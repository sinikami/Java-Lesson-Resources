package study;

import study.geometry.Circle;

import study.geometry.polygon.*;
/**
 * Created by ikocos on 11/02/2017.
 */
public class PackageExample {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        Rectangle rectangle = new Rectangle(100, 200);
        Square square = new Square(100);
        System.out.println(rectangle.getArea());
        System.out.println(circle.getArea());
        System.out.println(square.getArea());

    }
}

