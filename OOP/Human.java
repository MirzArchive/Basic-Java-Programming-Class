package OOP;

public class Human {
    String name;
    int age;

    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getData() {
        return this.name + "\n" + this.age + "\n";
    }
}
