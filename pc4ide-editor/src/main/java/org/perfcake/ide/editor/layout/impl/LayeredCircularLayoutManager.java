/*
 *-----------------------------------------------------------------------------
 * pc4ide
 *
 * Copyright 2017 Jakub Knetl
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *-----------------------------------------------------------------------------
 */

package org.perfcake.ide.editor.layout.impl;

import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;
import org.perfcake.ide.editor.layout.LayoutData;
import org.perfcake.ide.editor.layout.LayoutManager;
import org.perfcake.ide.editor.view.View;

/**
 * Layered circular layout manager uses two layers for components.
 *
 * @author Jakub Knetl
 */
public class LayeredCircularLayoutManager implements LayoutManager {

    private LayoutManager innerLayerManager;
    private LayoutManager outerLayerManager;

    private Class<? extends View> innerViewsType;
    private Class<? extends View> outerViewsType;

    // split position will be 55% of radius for inner view and 40% for outer view
    private double splitPosition = 0.55;

    /**
     * Creates layered circular layout manager.
     *
     * @param innerViewsType type of view in the inner layer
     * @param outerViewsType type of view in the outer layer
     */
    public LayeredCircularLayoutManager(Class<? extends View> innerViewsType, Class<? extends View> outerViewsType) {
        this.innerViewsType = innerViewsType;
        this.outerViewsType = outerViewsType;
        innerLayerManager = new CircularSectorLayoutManager(true, false);
        outerLayerManager = new CircularSectorLayoutManager(true, false);

        innerLayerManager.setConstraint(new LayoutData());
        outerLayerManager.setConstraint(new LayoutData());
    }

    @Override
    public void layout(Graphics2D g2d) {
        if (!innerLayerManager.getChildren().isEmpty()) {
            innerLayerManager.layout(g2d);
        }
        if (!outerLayerManager.getChildren().isEmpty()) {
            outerLayerManager.layout(g2d);
        }

    }

    @Override
    public double getMinimumAngularExtent(LayoutData constraint, Graphics2D g2d) {
        double minimumSize = 0;

        if (!innerLayerManager.getChildren().isEmpty() && !outerLayerManager.getChildren().isEmpty()) {
            LayoutData innerConstraint = new LayoutData(constraint);
            double splitRadius = computeLayerBorder(constraint);
            innerConstraint.getRadiusData().setOuterRadius(splitRadius);
            LayoutData outerConstraint = new LayoutData(constraint);
            outerConstraint.getRadiusData().setInnerRadius(splitRadius);


            double minimumInnerExtent = innerLayerManager.getMinimumAngularExtent(innerConstraint, g2d);
            double minimumOuterExtent = outerLayerManager.getMinimumAngularExtent(outerConstraint, g2d);
            minimumSize = Math.max(minimumInnerExtent, minimumOuterExtent);
        } else if (!innerLayerManager.getChildren().isEmpty() && outerLayerManager.getChildren().isEmpty()) {
            minimumSize = innerLayerManager.getMinimumAngularExtent(constraint, g2d);
        } else if (innerLayerManager.getChildren().isEmpty() && !outerLayerManager.getChildren().isEmpty()) {
            minimumSize = outerLayerManager.getMinimumAngularExtent(constraint, g2d);
        }

        return minimumSize;
    }

    @Override
    public double getPreferredAngularExtent(LayoutData constraint, Graphics2D g2d) {
        double preferredSize = 0;

        if (!innerLayerManager.getChildren().isEmpty() && !outerLayerManager.getChildren().isEmpty()) {
            LayoutData innerConstraint = new LayoutData(constraint);
            double splitRadius = computeLayerBorder(constraint);
            innerConstraint.getRadiusData().setOuterRadius(splitRadius);
            LayoutData outerConstraint = new LayoutData(constraint);
            outerConstraint.getRadiusData().setInnerRadius(splitRadius);


            double preferredInnerExtent = innerLayerManager.getPreferredAngularExtent(innerConstraint, g2d);
            double preferredOuterExtent = outerLayerManager.getPreferredAngularExtent(outerConstraint, g2d);
            preferredSize = Math.max(preferredInnerExtent, preferredOuterExtent);
        } else if (!innerLayerManager.getChildren().isEmpty() && outerLayerManager.getChildren().isEmpty()) {
            preferredSize = innerLayerManager.getPreferredAngularExtent(constraint, g2d);
        } else if (innerLayerManager.getChildren().isEmpty() && !outerLayerManager.getChildren().isEmpty()) {
            preferredSize = outerLayerManager.getPreferredAngularExtent(constraint, g2d);
        }

        return preferredSize;
    }

    @Override
    public void setConstraint(LayoutData constraint) {
        // Compute constraint for inner layout managers
        if (!innerLayerManager.getChildren().isEmpty() && !outerLayerManager.getChildren().isEmpty()) {
            LayoutData innerConstraint = new LayoutData(constraint);
            double splitRadius = computeLayerBorder(constraint);
            innerConstraint.getRadiusData().setOuterRadius(splitRadius);
            LayoutData outerConstraint = new LayoutData(constraint);
            outerConstraint.getRadiusData().setInnerRadius(splitRadius);

            innerLayerManager.setConstraint(innerConstraint);
            outerLayerManager.setConstraint(outerConstraint);
        } else if (!innerLayerManager.getChildren().isEmpty() && outerLayerManager.getChildren().isEmpty()) {
            innerLayerManager.setConstraint(constraint);
        } else if (innerLayerManager.getChildren().isEmpty() && !outerLayerManager.getChildren().isEmpty()) {
            outerLayerManager.setConstraint(constraint);
        }
    }

    @Override
    public void add(View component) {
        if (component == null) {
            throw new IllegalArgumentException("Component is null.");
        }
        if (innerViewsType.isAssignableFrom(component.getClass())) {
            innerLayerManager.add(component);
        } else if (outerViewsType.isAssignableFrom(component.getClass())) {
            outerLayerManager.add(component);
        }

    }

    @Override
    public boolean remove(View component) {
        if (component == null) {
            throw new IllegalArgumentException("Component is null.");
        }
        boolean removed = false;
        if (innerViewsType.isAssignableFrom(component.getClass())) {
            removed = innerLayerManager.remove(component);
        } else if (outerViewsType.isAssignableFrom(component.getClass())) {
            removed = outerLayerManager.remove(component);
        }

        return removed;
    }

    @Override
    public List<View> getChildren() {
        List<View> children = new ArrayList<>();
        children.addAll(innerLayerManager.getChildren());
        children.addAll(outerLayerManager.getChildren());

        return children;
    }

    /**
     * Compute border radius between layers.
     *
     * @param data layout data
     * @return radius of border between layers.
     */
    protected double computeLayerBorder(LayoutData data) {
        double borderRadius = (data.getRadiusData().getInnerRadius() + data.getRadiusData().getOuterRadius()) * splitPosition;
        return borderRadius;
    }
}
