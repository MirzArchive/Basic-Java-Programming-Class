package OOP;

public class Animal {
    String name;
    Animal(String name) {
        this.name = name;
    }

    void speak() {
        System.out.printf("%s is making sound",name);
    }

    void hungry() {
        System.out.printf("%s is hungry",name);
    }
}
