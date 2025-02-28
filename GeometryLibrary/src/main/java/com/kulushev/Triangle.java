package com.kulushev;

public class Triangle {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getArea() {
        double s = (a + b + c) / 2;
        double value = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return Math.round(value * 100.0) / 100.0;
    }
    public double getPerimeter() {
        double value = a + b + c;
        return Math.round(value * 100.0) / 100.0;
    }
}
