package OOP;

public class Cat extends Animal{
    Cat(String name) {
        super(name);
    }

    @Override
    void speak() {
        System.out.printf("%s miaw miaw nibba ",name);
    }
}
