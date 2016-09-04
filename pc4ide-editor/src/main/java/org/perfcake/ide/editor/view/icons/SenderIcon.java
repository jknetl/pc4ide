package org.perfcake.ide.editor.view.icons;


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

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 */
public class SenderIcon implements ResizableIcon {

    /** The width of this icon. */
    private int width;

    /** The height of this icon. */
    private int height;

    /** The rendered image. */
    private BufferedImage image;

    /**
     * Creates a new transcoded SVG image.
     */
    public SenderIcon() {
        this(34, 34);
    }

    /**
     * Creates a new transcoded SVG image.
     */
    public SenderIcon(int width, int height) {
        this.width = width;
        this.height = height;
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
	public void setIconWidth(int width) {
		this.width = width;
	}

	@Override
	public void setIconHeight(int height) {
		this.height = height;
	}

	@Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        if (image == null) {
            image = new BufferedImage(getIconWidth(), getIconHeight(), BufferedImage.TYPE_INT_ARGB);
            final double coef = Math.min((double) width / (double) 34, (double) height / (double) 34);

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
    private static void paint(Graphics2D g) {
        Shape shape = null;

        final float origAlpha = 1.0f;

        final java.util.LinkedList<AffineTransform> transformations = new java.util.LinkedList<AffineTransform>();


        //
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(0.037795275f, 0, 0, 0.037795275f, -488.6173f, -106.73386f));

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
        ((GeneralPath) shape).moveTo(13240.0, 3690.0);
        ((GeneralPath) shape).lineTo(13429.0, 3690.0);
        ((GeneralPath) shape).curveTo(13463.0, 3690.0, 13490.0, 3662.0, 13490.0, 3628.0);
        ((GeneralPath) shape).lineTo(13490.0, 2906.0);
        ((GeneralPath) shape).curveTo(13490.0, 2872.0, 13463.0, 2845.0, 13429.0, 2845.0);
        ((GeneralPath) shape).lineTo(13050.0, 2845.0);
        ((GeneralPath) shape).curveTo(13016.0, 2845.0, 12989.0, 2872.0, 12989.0, 2906.0);
        ((GeneralPath) shape).lineTo(12989.0, 3628.0);
        ((GeneralPath) shape).curveTo(12989.0, 3662.0, 13016.0, 3690.0, 13050.0, 3690.0);
        ((GeneralPath) shape).lineTo(13240.0, 3690.0);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xFFC73A));
        g.setStroke(new BasicStroke(42, 0, 0, 4));
        g.draw(shape);

        // _0_0_0_0_0_1

        // _0_0_0_0_0_1_0

        // _0_0_0_0_0_1_0_0

        // _0_0_0_0_0_1_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12928.0, 3688.0);
        ((GeneralPath) shape).lineTo(13549.0, 3688.0);

        g.draw(shape);

        // _0_0_0_0_0_2

        // _0_0_0_0_0_2_0

        // _0_0_0_0_0_2_0_0

        // _0_0_0_0_0_2_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13240.0, 3679.0);
        ((GeneralPath) shape).lineTo(13490.0, 3679.0);
        ((GeneralPath) shape).lineTo(13490.0, 3678.0);
        ((GeneralPath) shape).lineTo(13490.0, 3159.0);
        ((GeneralPath) shape).lineTo(13490.0, 3159.0);
        ((GeneralPath) shape).lineTo(12989.0, 3159.0);
        ((GeneralPath) shape).lineTo(12989.0, 3159.0);
        ((GeneralPath) shape).lineTo(12989.0, 3678.0);
        ((GeneralPath) shape).curveTo(12989.0, 3679.0, 12989.0, 3679.0, 12989.0, 3679.0);
        ((GeneralPath) shape).lineTo(13240.0, 3679.0);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_0_0_2_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13240.0, 3679.0);
        ((GeneralPath) shape).lineTo(13490.0, 3679.0);
        ((GeneralPath) shape).lineTo(13490.0, 3678.0);
        ((GeneralPath) shape).lineTo(13490.0, 3159.0);
        ((GeneralPath) shape).lineTo(13490.0, 3159.0);
        ((GeneralPath) shape).lineTo(12989.0, 3159.0);
        ((GeneralPath) shape).lineTo(12989.0, 3159.0);
        ((GeneralPath) shape).lineTo(12989.0, 3678.0);
        ((GeneralPath) shape).curveTo(12989.0, 3679.0, 12989.0, 3679.0, 12989.0, 3679.0);
        ((GeneralPath) shape).lineTo(13240.0, 3679.0);
        ((GeneralPath) shape).closePath();

        g.setStroke(new BasicStroke(28, 0, 0, 4));
        g.draw(shape);

        // _0_0_0_0_0_3

        // _0_0_0_0_0_3_0

        // _0_0_0_0_0_3_0_0

        // _0_0_0_0_0_3_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13610.0, 2842.0);
        ((GeneralPath) shape).lineTo(13785.0, 3044.0);

        g.setStroke(new BasicStroke(42, 0, 0, 4));
        g.draw(shape);

        // _0_0_0_0_0_4

        // _0_0_0_0_0_4_0

        // _0_0_0_0_0_4_0_0

        // _0_0_0_0_0_4_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13487.0, 3205.0);
        ((GeneralPath) shape).curveTo(13550.0, 3206.0, 13574.0, 3229.0, 13589.0, 3255.0);
        ((GeneralPath) shape).curveTo(13618.0, 3314.0, 13557.0, 3515.0, 13658.0, 3591.0);
        ((GeneralPath) shape).curveTo(13691.0, 3612.0, 13717.0, 3617.0, 13746.0, 3600.0);
        ((GeneralPath) shape).curveTo(13818.0, 3553.0, 13814.0, 3454.0, 13789.0, 3375.0);
        ((GeneralPath) shape).curveTo(13759.0, 3318.0, 13726.0, 3145.0, 13737.0, 2997.0);

        g.setStroke(new BasicStroke(28, 0, 1, 4));
        g.draw(shape);

        g.setTransform(transformations.pop()); // _0

    }
}

