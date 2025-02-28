package com.kulushev;

public class Parallelepiped {
    private double width;
    private double height;
    private double depth;

    public Parallelepiped(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double getSurfaceArea() {
        double value = 2 * (width * height + height * depth + depth * width);
        return Math.round(value * 100.0) / 100.0;
    }
    public double getVolume() {
        double value = width * height * depth;
        return Math.round(value * 100.0) / 100.0;
    }
}

