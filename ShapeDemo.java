import java.util.Scanner;

abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Choose shape: 1.Circle 2.Rectangle 3.Triangle");
            int choice = sc.nextInt();
            Shape shape = null;
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter radius: ");
                    double r = sc.nextDouble();
                    shape = new Circle(r);
                }
                case 2 -> {
                    System.out.print("Enter length and width: ");
                    double l = sc.nextDouble();
                    double w = sc.nextDouble();
                    shape = new Rectangle(l, w);
                }
                case 3 -> {
                    System.out.print("Enter base and height: ");
                    double b = sc.nextDouble();
                    double h = sc.nextDouble();
                    shape = new Triangle(b, h);
                }
                default -> System.out.println("Invalid choice");
            }
            if (shape != null) {
                System.out.println("Area: " + shape.area());
            }
        }
    }
}