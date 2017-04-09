package study.geometry.polygon;

/**
 * Created by ikocos on 11/02/2017.
 */
public class Rectangle {
    int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;

    }

    public int getArea() {
        return width * height;
    }
}
