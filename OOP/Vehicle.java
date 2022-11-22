public class OOP_Vehicle {
    double speed;
    String name;

    OOP_Vehicle(String name) {
        this.name = name;
    }

    void gas() {
        System.out.printf("%s is moving",this.name);
    }

    void brake() {
        System.out.printf("%s is stopped",this.name);
    }
}