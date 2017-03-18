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
/**
 *
 */

package org.perfcake.ide.editor.view;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.perfcake.ide.editor.actions.ActionType;
import org.perfcake.ide.editor.colors.ColorScheme;
import org.perfcake.ide.editor.colors.DefaultColorScheme;
import org.perfcake.ide.editor.layout.LayoutData;
import org.perfcake.ide.editor.layout.LayoutManager;
import org.perfcake.ide.editor.swing.icons.ControlIcon;

/**
 * {@link AbstractView} implements some of the methods of {@link View} interface.
 *
 * @author jknetl
 */
public abstract class AbstractView implements View {

    protected List<ControlIcon> managementIcons;
    private boolean isSelected = false;
    private List<View> children = new ArrayList<>();
    private View parent;
    protected boolean isValid;

    protected LayoutData layoutData;
    protected LayoutManager layoutManager;

    protected ColorScheme colorScheme;

    /**
     * Creates new abstract view.
     */
    public AbstractView() {
        super();
        isValid = false;
        colorScheme = new DefaultColorScheme();
        managementIcons = new ArrayList<>();
        initManagementIcons();
    }

    @Override
    public boolean isSelected() {
        return isSelected;
    }

    @Override
    public void setSelected(boolean selected) {
        if (this.isSelected != selected) {
            this.isSelected = selected;
            invalidate();
        }
    }

    @Override
    public boolean isValid() {
        return isValid;
    }

    @Override
    public void invalidate() {
        isValid = false;
        if (parent != null) {
            // indicate to parent that this controller needs validation
            parent.invalidate();
        }
    }

    @Override
    public void validate(Graphics2D g2d) {
        if (layoutManager != null) {
            layoutManager.layout(g2d);
        }
        for (final View view : children) {
            view.validate(g2d);
        }
        isValid = true;
    }

    @Override
    public LayoutData getLayoutData() {
        return layoutData;
    }

    @Override
    public void setLayoutData(LayoutData layoutData) {
        this.layoutData = layoutData;
    }

    @Override
    public List<View> getChildren() {
        return Collections.unmodifiableList(children);
    }

    @Override
    public View getParent() {
        return parent;
    }

    @Override
    public void setParent(View parent) {
        this.parent = parent;
    }

    @Override
    public void addChild(View view) {
        if (view != null) {
            children.add(view);
            view.setParent(this);
            if (layoutManager != null) {
                layoutManager.add(view);
            }
        }
    }

    @Override
    public boolean removeChild(View view) {
        if (layoutManager != null) {
            layoutManager.remove(view);
        }
        boolean removed = children.remove(view);
        if (removed) {
            view.setParent(null);
        }

        return removed;
    }

    @Override
    public ColorScheme getColorScheme() {
        return colorScheme;
    }

    @Override
    public void setColorScheme(ColorScheme colorScheme) {
        this.colorScheme = colorScheme;
    }

    @Override
    public ActionType getAction(Point2D location) {
        ActionType action = ActionType.NONE;

        if (location != null && getViewBounds() != null || getViewBounds().contains(location)) {
            action = ActionType.SELECT;

            for (ControlIcon controlIcon : managementIcons) {
                Shape iconBounds = controlIcon.getBounds();
                if (iconBounds.contains(location) && controlIcon.getAction() != null) {
                    action = controlIcon.getAction();
                }
            }
        }

        return action;
    }

    /**
     * Adds rendering hints to a graphics context.
     *
     * @param g2d graphics context
     */
    protected void addRenderingHints(Graphics2D g2d) {
        final Map<Object, Object> hints = new HashMap<>();
        hints.put(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        hints.put(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);
        hints.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        hints.put(RenderingHints.KEY_TEXT_LCD_CONTRAST, 100);
        g2d.addRenderingHints(hints);
    }

    /**
     * This method is intended to add management icons.
     */
    protected abstract void initManagementIcons();
}
