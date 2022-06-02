package com.yuki.help;

import android.graphics.drawable.GradientDrawable;


/**
 * @author yuki
 * @date 创建时间：2022/5/27
 * @description
 */
public class DrawableBuilder {
    float radius;
    int strokeWidth;
    int strokeColor;
    int color;
    float[] radii;

    public DrawableBuilder setCornerRadius(float radius) {
        this.radius = radius;
        return this;
    }

    public DrawableBuilder setCornerRadii(float[] radii) {
        this.radii = radii;
        return this;
    }

    public DrawableBuilder setStroke(int width, int color) {
        this.strokeWidth = width;
        this.strokeColor = color;
        return this;
    }

    public DrawableBuilder setColor(int color) {
        this.color = color;
        return this;
    }

    public GradientDrawable build() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (radius != 0) {
            gradientDrawable.setCornerRadius(radius);
        }
        if (strokeWidth != 0 && strokeColor != 0) {
            gradientDrawable.setStroke(strokeWidth, strokeColor);
        }
        if (color != 0) {
            gradientDrawable.setColor(color);
        }
        if (radii != null) {
            gradientDrawable.setCornerRadii(radii);
        }

        return gradientDrawable;
    }

}