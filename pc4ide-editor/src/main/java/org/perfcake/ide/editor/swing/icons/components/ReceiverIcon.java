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
public class ReceiverIcon extends AbstractIcon {

    public static final Color DEFAULT_COLOR = new Color(0x6FA0FF);

    /**
     * Creates a new transcoded SVG image.
     */
    public ReceiverIcon() {
        this(DEFAULT_COLOR);
    }

    /**
     * Creates a new transcoded SVG image.
     *
     * @param width  width of the icon
     * @param height height of the icon
     */
    public ReceiverIcon(int width, int height) {
        super(width, height, DEFAULT_COLOR);
    }

    /**
     * Creates new receiver icon.
     *
     * @param color color of the icon
     */
    public ReceiverIcon(Color color) {
        this(37, 31, color);
    }

    /**
     * Creates a new transcoded SVG image.
     *
     * @param width  width of the icon
     * @param height height of the icon
     * @param color  color of the icon
     */
    public ReceiverIcon(int width, int height, Color color) {
        super(width, height, color);
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        if (isRenderNeeded()) {
            image = new BufferedImage(getIconWidth(), getIconHeight(), BufferedImage.TYPE_INT_ARGB);
            final double coef = Math.min((double) width / (double) 37, (double) height / (double) 31);

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
        g.transform(new AffineTransform(0.037795275f, 0, 0, 0.037795275f, -485.40472f, -167.81102f));

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
        ((GeneralPath) shape).moveTo(13323.0, 5079.0);
        ((GeneralPath) shape).lineTo(13693.0, 5079.0);
        ((GeneralPath) shape).curveTo(13742.0, 5079.0, 13782.0, 5039.0, 13782.0, 4990.0);
        ((GeneralPath) shape).lineTo(13782.0, 4551.0);
        ((GeneralPath) shape).curveTo(13782.0, 4502.0, 13742.0, 4462.0, 13693.0, 4462.0);
        ((GeneralPath) shape).lineTo(12954.0, 4462.0);
        ((GeneralPath) shape).curveTo(12905.0, 4462.0, 12865.0, 4502.0, 12865.0, 4551.0);
        ((GeneralPath) shape).lineTo(12865.0, 4990.0);
        ((GeneralPath) shape).curveTo(12865.0, 5039.0, 12905.0, 5079.0, 12954.0, 5079.0);
        ((GeneralPath) shape).lineTo(13323.0, 5079.0);
        ((GeneralPath) shape).closePath();

        g.setPaint(color);
        g.setStroke(new BasicStroke(44, 0, 0, 4));
        g.draw(shape);

        // _0_0_0_0_0_1

        // _0_0_0_0_0_1_0

        // _0_0_0_0_0_1_0_0

        // _0_0_0_0_0_1_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13483.0, 5078.0);
        ((GeneralPath) shape).curveTo(13438.0, 4999.0, 13438.0, 4988.0, 13479.0, 4909.0);
        ((GeneralPath) shape).curveTo(13519.0, 4832.0, 13520.0, 4818.0, 13479.0, 4741.0);

        g.setStroke(new BasicStroke(42, 0, 0, 4));
        g.draw(shape);

        // _0_0_0_0_0_2

        // _0_0_0_0_0_2_0

        // _0_0_0_0_0_2_0_0

        // _0_0_0_0_0_2_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13477.0, 5242.0);
        ((GeneralPath) shape).curveTo(13522.0, 5163.0, 13522.0, 5152.0, 13481.0, 5073.0);
        ((GeneralPath) shape).curveTo(13441.0, 4996.0, 13441.0, 4982.0, 13481.0, 4905.0);

        g.draw(shape);

        // _0_0_0_0_0_3

        // _0_0_0_0_0_3_0

        // _0_0_0_0_0_3_0_0

        // _0_0_0_0_0_3_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13484.0, 4637.0);
        ((GeneralPath) shape).lineTo(13483.0, 4654.0);
        ((GeneralPath) shape).lineTo(13507.0, 4656.0);
        ((GeneralPath) shape).lineTo(13508.0, 4639.0);
        ((GeneralPath) shape).lineTo(13484.0, 4637.0);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_0_0_3_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13484.0, 4637.0);
        ((GeneralPath) shape).lineTo(13483.0, 4654.0);
        ((GeneralPath) shape).lineTo(13507.0, 4656.0);
        ((GeneralPath) shape).lineTo(13508.0, 4639.0);
        ((GeneralPath) shape).lineTo(13484.0, 4637.0);
        ((GeneralPath) shape).closePath();

        g.setStroke(new BasicStroke(15, 0, 1, 4));
        g.draw(shape);

        // _0_0_0_0_0_4

        // _0_0_0_0_0_4_0

        // _0_0_0_0_0_4_0_0

        // _0_0_0_0_0_4_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13432.0, 4769.0);
        ((GeneralPath) shape).lineTo(13498.0, 4603.0);
        ((GeneralPath) shape).lineTo(13543.0, 4778.0);
        ((GeneralPath) shape).curveTo(13512.0, 4748.0, 13467.0, 4745.0, 13432.0, 4769.0);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_0_0_4_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13432.0, 4769.0);
        ((GeneralPath) shape).lineTo(13498.0, 4603.0);
        ((GeneralPath) shape).lineTo(13543.0, 4778.0);
        ((GeneralPath) shape).curveTo(13512.0, 4748.0, 13467.0, 4745.0, 13432.0, 4769.0);
        ((GeneralPath) shape).closePath();

        g.draw(shape);

        // _0_0_0_0_0_5

        // _0_0_0_0_0_5_0

        // _0_0_0_0_0_5_0_0

        // _0_0_0_0_0_5_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13319.0, 5078.0);
        ((GeneralPath) shape).curveTo(13274.0, 4999.0, 13274.0, 4988.0, 13315.0, 4909.0);
        ((GeneralPath) shape).curveTo(13355.0, 4832.0, 13356.0, 4818.0, 13315.0, 4741.0);

        g.setStroke(new BasicStroke(42, 0, 0, 4));
        g.draw(shape);

        // _0_0_0_0_0_6

        // _0_0_0_0_0_6_0

        // _0_0_0_0_0_6_0_0

        // _0_0_0_0_0_6_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13312.0, 5242.0);
        ((GeneralPath) shape).curveTo(13357.0, 5163.0, 13357.0, 5152.0, 13316.0, 5073.0);
        ((GeneralPath) shape).curveTo(13276.0, 4996.0, 13276.0, 4982.0, 13316.0, 4905.0);

        g.draw(shape);

        // _0_0_0_0_0_7

        // _0_0_0_0_0_7_0

        // _0_0_0_0_0_7_0_0

        // _0_0_0_0_0_7_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13320.0, 4637.0);
        ((GeneralPath) shape).lineTo(13319.0, 4654.0);
        ((GeneralPath) shape).lineTo(13343.0, 4656.0);
        ((GeneralPath) shape).lineTo(13344.0, 4639.0);
        ((GeneralPath) shape).lineTo(13320.0, 4637.0);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_0_0_7_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13320.0, 4637.0);
        ((GeneralPath) shape).lineTo(13319.0, 4654.0);
        ((GeneralPath) shape).lineTo(13343.0, 4656.0);
        ((GeneralPath) shape).lineTo(13344.0, 4639.0);
        ((GeneralPath) shape).lineTo(13320.0, 4637.0);
        ((GeneralPath) shape).closePath();

        g.setStroke(new BasicStroke(15, 0, 1, 4));
        g.draw(shape);

        // _0_0_0_0_0_8

        // _0_0_0_0_0_8_0

        // _0_0_0_0_0_8_0_0

        // _0_0_0_0_0_8_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13268.0, 4769.0);
        ((GeneralPath) shape).lineTo(13334.0, 4603.0);
        ((GeneralPath) shape).lineTo(13379.0, 4778.0);
        ((GeneralPath) shape).curveTo(13348.0, 4748.0, 13303.0, 4745.0, 13268.0, 4769.0);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_0_0_8_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13268.0, 4769.0);
        ((GeneralPath) shape).lineTo(13334.0, 4603.0);
        ((GeneralPath) shape).lineTo(13379.0, 4778.0);
        ((GeneralPath) shape).curveTo(13348.0, 4748.0, 13303.0, 4745.0, 13268.0, 4769.0);
        ((GeneralPath) shape).closePath();

        g.draw(shape);

        // _0_0_0_0_0_9

        // _0_0_0_0_0_9_0

        // _0_0_0_0_0_9_0_0

        // _0_0_0_0_0_9_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13154.0, 5078.0);
        ((GeneralPath) shape).curveTo(13109.0, 4999.0, 13109.0, 4988.0, 13150.0, 4909.0);
        ((GeneralPath) shape).curveTo(13190.0, 4832.0, 13191.0, 4818.0, 13150.0, 4741.0);

        g.setStroke(new BasicStroke(42, 0, 0, 4));
        g.draw(shape);

        // _0_0_0_0_0_10

        // _0_0_0_0_0_10_0

        // _0_0_0_0_0_10_0_0

        // _0_0_0_0_0_10_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13148.0, 5242.0);
        ((GeneralPath) shape).curveTo(13193.0, 5163.0, 13193.0, 5152.0, 13152.0, 5073.0);
        ((GeneralPath) shape).curveTo(13112.0, 4996.0, 13112.0, 4982.0, 13152.0, 4905.0);

        g.draw(shape);

        // _0_0_0_0_0_11

        // _0_0_0_0_0_11_0

        // _0_0_0_0_0_11_0_0

        // _0_0_0_0_0_11_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13156.0, 4637.0);
        ((GeneralPath) shape).lineTo(13155.0, 4654.0);
        ((GeneralPath) shape).lineTo(13179.0, 4656.0);
        ((GeneralPath) shape).lineTo(13180.0, 4639.0);
        ((GeneralPath) shape).lineTo(13156.0, 4637.0);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_0_0_11_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13156.0, 4637.0);
        ((GeneralPath) shape).lineTo(13155.0, 4654.0);
        ((GeneralPath) shape).lineTo(13179.0, 4656.0);
        ((GeneralPath) shape).lineTo(13180.0, 4639.0);
        ((GeneralPath) shape).lineTo(13156.0, 4637.0);
        ((GeneralPath) shape).closePath();

        g.setStroke(new BasicStroke(15, 0, 1, 4));
        g.draw(shape);

        // _0_0_0_0_0_12

        // _0_0_0_0_0_12_0

        // _0_0_0_0_0_12_0_0

        // _0_0_0_0_0_12_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13103.0, 4769.0);
        ((GeneralPath) shape).lineTo(13169.0, 4603.0);
        ((GeneralPath) shape).lineTo(13214.0, 4778.0);
        ((GeneralPath) shape).curveTo(13183.0, 4748.0, 13138.0, 4745.0, 13103.0, 4769.0);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_0_0_12_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13103.0, 4769.0);
        ((GeneralPath) shape).lineTo(13169.0, 4603.0);
        ((GeneralPath) shape).lineTo(13214.0, 4778.0);
        ((GeneralPath) shape).curveTo(13183.0, 4748.0, 13138.0, 4745.0, 13103.0, 4769.0);
        ((GeneralPath) shape).closePath();

        g.draw(shape);

        g.setTransform(transformations.pop()); // _0

    }
}

