package OOP;
public class Car extends Vehicle{
    private int year;

    Car(String name, int speed, int year) {
        super(name, speed);
        this.year = year;
    }

    public int getYear() {
        return year;
    }
}
