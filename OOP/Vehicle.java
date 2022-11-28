package OOP;
public abstract class Vehicle {
    protected double speed;
    protected String name;

    Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    void gas() {
        System.out.printf("%s is moving",this.name);
    }

    void brake() {
        System.out.printf("%s is stopped",this.name);
    }
}