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
        double value = PI * r * r;
        return Math.round(value * 100.0) / 100.0;
    }
    public double getPerimeter() {
        double value = 2 * PI * r;
        return Math.round(value * 100.0) / 100.0;
    }
}
