package study.geometry;

/**
 * Created by ikocos on 21/01/2017.
 */
public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double pi = 3.14;
        double area = pi * Math.pow(this.radius, 2);
        return area;
    }
}
