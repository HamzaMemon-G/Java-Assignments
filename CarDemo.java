class Car {
    String name;
    String model;
    int year;

    Car() {
        this.name = "Unknown";
        this.model = "Unknown";
        this.year = 0;
    }

    Car(String name) {
        this.name = name;
        this.model = "Unknown";
        this.year = 0;
    }

    Car(String name, String model) {
        this.name = name;
        this.model = model;
        this.year = 0;
    }

    Car(String name, String model, int year) {
        this.name = name;
        this.model = model;
        this.year = year;
    }

    void display() {
        System.out.println("Car: " + name + ", Model: " + model + ", Year: " + year);
    }

    void display(String message) {
        System.out.println(message + " - Car: " + name + ", Model: " + model + ", Year: " + year);
    }
}

public class CarDemo {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Toyota");
        Car car3 = new Car("Honda", "Civic");
        Car car4 = new Car("Ford", "Mustang", 2020);

        car1.display();
        car2.display("New Car");
        car3.display();
        car4.display("Classic Car");
    }
}