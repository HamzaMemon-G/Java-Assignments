import java.util.Scanner;

class ShapeArea {
    double area(double length, double width) {
        return length * width;
    }

    double area(double side) {
        return side * side;
    }

    double area(double radius, boolean isCircle) {
        return Math.PI * radius * radius;
    }
}

public class ShapeAreaDemo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ShapeArea sa = new ShapeArea();
            System.out.println("Choose shape: 1.Rectangle 2.Square 3.Circle");
            int choice = sc.nextInt();
            double result = 0;
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter length and width: ");
                    double l = sc.nextDouble();
                    double w = sc.nextDouble();
                    result = sa.area(l, w);
                    System.out.println("Rectangle Area: " + result);
                }
                case 2 -> {
                    System.out.print("Enter side: ");
                    double s = sc.nextDouble();
                    result = sa.area(s);
                    System.out.println("Square Area: " + result);
                }
                case 3 -> {
                    System.out.print("Enter radius: ");
                    double r = sc.nextDouble();
                    result = sa.area(r, true);
                    System.out.println("Circle Area: " + result);
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }
}