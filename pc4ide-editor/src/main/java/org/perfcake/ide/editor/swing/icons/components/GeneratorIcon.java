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

package org.perfcake.ide.editor.swing.icons.components;

import java.awt.BasicStroke;
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
public class GeneratorIcon extends AbstractIcon {

    public static final Color DEFAULT_COLOR = new Color(0xFF6FAF);

    /**
     * Creates a new transcoded SVG image.
     */
    public GeneratorIcon() {
        this(DEFAULT_COLOR);
    }

    /**
     * Creates new generator icon.
     *
     * @param color color of the icon
     */
    public GeneratorIcon(Color color) {
        this(31, 22, color);
    }

    /**
     * Creates a new transcoded SVG image.
     *
     * @param width  width of the icon
     * @param height height of the icon
     */
    public GeneratorIcon(int width, int height) {
        super(width, height, DEFAULT_COLOR);
    }

    /**
     * Creates a new transcoded SVG image.
     *
     * @param width  width of the icon
     * @param height height of the icon
     * @param color  color  of an icon
     */
    public GeneratorIcon(int width, int height, Color color) {
        super(width, height, color);
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        if (isRenderNeeded()) {
            image = new BufferedImage(getIconWidth(), getIconHeight(), BufferedImage.TYPE_INT_ARGB);
            final double coef = Math.min((double) width / (double) 31, (double) height / (double) 22);

            final Graphics2D g2d = image.createGraphics();
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

        final float origAlpha = 1.0f;

        final java.util.LinkedList<AffineTransform> transformations = new java.util.LinkedList<AffineTransform>();


        //
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(0.03779528f, 0, 0, 0.03779528f, -488.4284f, -56.239376f));

        // _0

        // _0_0

        // _0_0_0

        // _0_0_0_0

        // _0_0_0_0_0

        // _0_0_0_0_0_0

        // _0_0_0_0_0_0_0

        // _0_0_0_0_0_0_0_0

        // _0_0_0_0_0_0_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13048.0, 1509.0);
        ((GeneralPath) shape).lineTo(13392.0, 1509.0);
        ((GeneralPath) shape).lineTo(13392.0, 1621.0);
        ((GeneralPath) shape).lineTo(13504.0, 1621.0);
        ((GeneralPath) shape).lineTo(13504.0, 1693.0);
        ((GeneralPath) shape).lineTo(13584.0, 1693.0);
        ((GeneralPath) shape).lineTo(13584.0, 1621.0);
        ((GeneralPath) shape).lineTo(13664.0, 1621.0);
        ((GeneralPath) shape).lineTo(13704.0, 1709.0);
        ((GeneralPath) shape).lineTo(13704.0, 1909.0);
        ((GeneralPath) shape).lineTo(13664.0, 1997.0);
        ((GeneralPath) shape).lineTo(13576.0, 1997.0);
        ((GeneralPath) shape).lineTo(13576.0, 1933.0);
        ((GeneralPath) shape).lineTo(13496.0, 1933.0);
        ((GeneralPath) shape).lineTo(13496.0, 2045.0);
        ((GeneralPath) shape).lineTo(13208.0, 2045.0);
        ((GeneralPath) shape).lineTo(13072.0, 1941.0);
        ((GeneralPath) shape).lineTo(12944.0, 1941.0);
        ((GeneralPath) shape).lineTo(12944.0, 1565.0);
        ((GeneralPath) shape).lineTo(13048.0, 1565.0);
        ((GeneralPath) shape).lineTo(13048.0, 1509.0);
        ((GeneralPath) shape).closePath();

        g.setPaint(color);
        g.setStroke(new BasicStroke(42, 0, 1, 4));
        g.draw(shape);

        g.setTransform(transformations.pop()); // _0

    }
}

