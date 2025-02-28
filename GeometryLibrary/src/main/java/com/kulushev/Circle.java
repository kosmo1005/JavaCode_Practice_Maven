package com.kulushev;

/**
 * Круг
 *
 */
public class Circle {
    private double r;
    private final double PI = 3.14159265358979323846;

    public Circle(double radius) {
        this.r = radius;
    }


    public double getArea() {
        return PI * r * r;
    }
    public double getPerimeter() {
        return 2 * PI * r;
    }
}
