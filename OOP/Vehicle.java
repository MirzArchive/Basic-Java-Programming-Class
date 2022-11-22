package OOP;
public class Vehicle {
    double speed;
    String name;

    Vehicle(String name) {
        this.name = name;
    }

    void gas() {
        System.out.printf("%s is moving",this.name);
    }

    void brake() {
        System.out.printf("%s is stopped",this.name);
    }
}