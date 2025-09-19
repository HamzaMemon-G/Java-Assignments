import org.calculator.Arithmetic;
import org.calculator.CalcPower;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Arithmetic arith = new Arithmetic();
            CalcPower power = new CalcPower();

            System.out.print("Enter two numbers: ");
            double a = sc.nextDouble();
            double b = sc.nextDouble();

            System.out.println("Add: " + arith.add(a, b));
            System.out.println("Subtract: " + arith.subtract(a, b));
            System.out.println("Multiply: " + arith.multiply(a, b));
            System.out.println("Divide: " + arith.divide(a, b));

            System.out.println("Square of " + a + ": " + power.square(a));
            System.out.println("Cube of " + a + ": " + power.cube(a));
        }
    }
}