package com.kulushev;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        double value = width * height;
        return Math.round(value * 100.0) / 100.0;
    }
    public double getPerimeter() {
        double value = width * 2 + height * 2;
        return Math.round(value * 100.0) / 100.0;
    }
}
