package OOP;

public class Cat extends Animal{
    Cat(String name) {
        super(name);
    }

    public static void main(String[] args) {
        Animal cat = new Animal("Snopo");
        cat.speak();
    }
}
