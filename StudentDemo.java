interface MarksheetInterface {
    String getCollegeName();
    void calculateMarksheet();
}

class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    void displayStudent() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name);
    }
}

class Test extends Student {
    int subject1;
    int subject2;

    Test(int rollNo, String name, int subject1, int subject2) {
        super(rollNo, name);
        this.subject1 = subject1;
        this.subject2 = subject2;
    }

    void displayTest() {
        displayStudent();
        System.out.println("Subject1: " + subject1 + ", Subject2: " + subject2);
    }
}

class Marksheet extends Test implements MarksheetInterface {
    String collegeName;

    Marksheet(int rollNo, String name, int subject1, int subject2, String collegeName) {
        super(rollNo, name, subject1, subject2);
        this.collegeName = collegeName;
    }

    @Override
    public String getCollegeName() {
        return collegeName;
    }

    @Override
    public void calculateMarksheet() {
        int total = subject1 + subject2;
        double average = total / 2.0;
        System.out.println("Total Marks: " + total + ", Average: " + average);
    }

    void displayMarksheet() {
        displayTest();
        System.out.println("College: " + getCollegeName());
        calculateMarksheet();
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Marksheet ms = new Marksheet(101, "John Doe", 85, 90, "ABC College");
        ms.displayMarksheet();
    }
}