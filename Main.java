import java.util.*;
abstract class Shape {
    abstract double area();
}

class Rectangle extends Shape {
 double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double area() {
        return width * height;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        Shape circle = new Circle(7);

        System.out.println("Area of rectangle: " + rectangle.area());
        System.out.println("Area of circle: " + circle.area());
    }
} 