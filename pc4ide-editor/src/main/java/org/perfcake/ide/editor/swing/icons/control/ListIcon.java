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

package org.perfcake.ide.editor.swing.icons.control;

import static java.awt.Color.BLACK;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.image.BufferedImage;
import org.perfcake.ide.editor.swing.icons.AbstractIcon;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 */
public class ListIcon extends AbstractIcon {

    public static final int DEFAULT_WIDTH = 8;
    public static final int DEFAULT_HEIGHT = 7;

    /**
     * The rendered image.
     */
    private BufferedImage image;

    /**
     * Creates a new transcoded SVG image.
     */
    public ListIcon() {
        this(DEFAULT_WIDTH, DEFAULT_HEIGHT, BLACK);
    }

    /**
     * Creates a new transcoded SVG image.
     *
     * @param width  width of icon
     * @param height height of  icon
     */
    public ListIcon(int width, int height) {
        this(width, height, BLACK);
    }

    /**
     * Creates a new transcoded SVG image.
     *
     * @param width  width of icon
     * @param height height of  icon
     * @param color  color of icon
     */
    public ListIcon(int width, int height, Color color) {
        super(width, height, color);
    }

    @Override
    public int getIconHeight() {
        return height;
    }

    @Override
    public int getIconWidth() {
        return width;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        if (image == null) {
            image = new BufferedImage(getIconWidth(), getIconHeight(), BufferedImage.TYPE_INT_ARGB);
            double coef = Math.min((double) width / (double) DEFAULT_WIDTH, (double) height / (double) DEFAULT_HEIGHT);

            Graphics2D g2d = image.createGraphics();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.scale(coef, coef);
            paint(g2d);
            g2d.dispose();
        }

        g.drawImage(image, x, y, null);
    }

    /**
     * Paints the transcoded SVG image on the specified graphics context.
     *
     * @param g Graphics context.
     */
    private void paint(Graphics2D g) {
        Shape shape = null;

        float origAlpha = 1.0f;

        java.util.LinkedList<AffineTransform> transformations = new java.util.LinkedList<AffineTransform>();


        // 

        // _0

        // _0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.5, 0.0);
        ((GeneralPath) shape).curveTo(0.22, 0.0, 0.0, 0.22, 0.0, 0.5);
        ((GeneralPath) shape).curveTo(0.0, 0.78, 0.22, 1.0, 0.5, 1.0);
        ((GeneralPath) shape).curveTo(0.78, 1.0, 1.0, 0.78, 1.0, 0.5);
        ((GeneralPath) shape).curveTo(1.0, 0.22000003, 0.78, 0.0, 0.5, 0.0);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(2.0, 0.0);
        ((GeneralPath) shape).lineTo(2.0, 1.0);
        ((GeneralPath) shape).lineTo(8.0, 1.0);
        ((GeneralPath) shape).lineTo(8.0, 0.0);
        ((GeneralPath) shape).lineTo(2.0, 0.0);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(0.5, 2.0);
        ((GeneralPath) shape).curveTo(0.22, 2.0, 0.0, 2.22, 0.0, 2.5);
        ((GeneralPath) shape).curveTo(0.0, 2.78, 0.22, 3.0, 0.5, 3.0);
        ((GeneralPath) shape).curveTo(0.78, 3.0, 1.0, 2.78, 1.0, 2.5);
        ((GeneralPath) shape).curveTo(1.0, 2.22, 0.78, 2.0, 0.5, 2.0);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(2.0, 2.0);
        ((GeneralPath) shape).lineTo(2.0, 3.0);
        ((GeneralPath) shape).lineTo(8.0, 3.0);
        ((GeneralPath) shape).lineTo(8.0, 2.0);
        ((GeneralPath) shape).lineTo(2.0, 2.0);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(0.5, 4.0);
        ((GeneralPath) shape).curveTo(0.22, 4.0, 0.0, 4.22, 0.0, 4.5);
        ((GeneralPath) shape).curveTo(0.0, 4.78, 0.22, 5.0, 0.5, 5.0);
        ((GeneralPath) shape).curveTo(0.78, 5.0, 1.0, 4.78, 1.0, 4.5);
        ((GeneralPath) shape).curveTo(1.0, 4.22, 0.78, 4.0, 0.5, 4.0);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(2.0, 4.0);
        ((GeneralPath) shape).lineTo(2.0, 5.0);
        ((GeneralPath) shape).lineTo(8.0, 5.0);
        ((GeneralPath) shape).lineTo(8.0, 4.0);
        ((GeneralPath) shape).lineTo(2.0, 4.0);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(0.5, 6.0);
        ((GeneralPath) shape).curveTo(0.22, 6.0, 0.0, 6.22, 0.0, 6.5);
        ((GeneralPath) shape).curveTo(0.0, 6.78, 0.22, 7.0, 0.5, 7.0);
        ((GeneralPath) shape).curveTo(0.78, 7.0, 1.0, 6.78, 1.0, 6.5);
        ((GeneralPath) shape).curveTo(1.0, 6.22, 0.78, 6.0, 0.5, 6.0);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(2.0, 6.0);
        ((GeneralPath) shape).lineTo(2.0, 7.0);
        ((GeneralPath) shape).lineTo(8.0, 7.0);
        ((GeneralPath) shape).lineTo(8.0, 6.0);
        ((GeneralPath) shape).lineTo(2.0, 6.0);
        ((GeneralPath) shape).closePath();

        g.setPaint(color);
        g.fill(shape);

    }
}

