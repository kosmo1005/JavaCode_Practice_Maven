package com.kulushev;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Circle circle = new Circle(3.5);
        Rectangle rectangle = new Rectangle(3.2, 4.4);
        Triangle triangle = new Triangle(3.2, 4.4, 5.5);

        System.out.println("Круг: ");
        System.out.println("Периметр: " + circle.getPerimeter());
        System.out.println("Площадь: " + circle.getArea());
        System.out.println("Квадорат: ");
        System.out.println("Периметр: " + rectangle.getPerimeter());
        System.out.println("Площадь: " + rectangle.getArea());
        System.out.println("Треугольник: ");
        System.out.println("Периметр: " + triangle.getPerimeter());
        System.out.println("Площадь: " + triangle.getArea());

    }
}
