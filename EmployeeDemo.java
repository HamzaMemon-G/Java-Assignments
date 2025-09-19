import java.util.Scanner;

class Employee {
    int empId;
    String empName;
    double basicSalary;
    double DA;
    double HRA;
    double incomeTax;

    Employee(int id, String name, double basic, double da, double hra, double tax) {
        empId = id;
        empName = name;
        basicSalary = basic;
        DA = da;
        HRA = hra;
        incomeTax = tax;
    }

    double calculateGrossSalary() {
        return basicSalary + DA + HRA - incomeTax;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("DA: " + DA);
        System.out.println("HRA: " + HRA);
        System.out.println("Income Tax: " + incomeTax);
        System.out.println("Gross Salary: " + calculateGrossSalary());
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Basic Salary: ");
            double basic = sc.nextDouble();
            System.out.print("Enter DA: ");
            double da = sc.nextDouble();
            System.out.print("Enter HRA: ");
            double hra = sc.nextDouble();
            System.out.print("Enter Income Tax: ");
            double tax = sc.nextDouble();

            Employee emp = new Employee(id, name, basic, da, hra, tax);
            emp.displayDetails();
        }
    }
}