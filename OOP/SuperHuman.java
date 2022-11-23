package OOP;

public class SuperHuman extends Human{
    String power;

    SuperHuman(String name, int age, String power) {
        super(name, age);
        this.power = power;
    }
}