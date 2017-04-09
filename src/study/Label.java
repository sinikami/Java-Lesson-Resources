package study;

import study.RectangleInterface.Changeble;

/**
 * Created by ikocos on 11/02/2017.
 */
public class Label implements Changeble {
    public String text, foreground, background, font;
    public int width, height;

     Label(String text, int width, int height, String foreground, String background, String font) {
        this.text = text;
        this.width = width;
        this.height = height;
        this.foreground = foreground;
        this.background = background;
        this.font = font;
    }

    @Override
    public void setBackground(String color) {
        this.background = color;
    }

    @Override
    public void setForegground(String color) {
        this.foreground = color;
    }

    @Override
    public void resize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void setFont(String font) {
        this.font = font;
    }
}
