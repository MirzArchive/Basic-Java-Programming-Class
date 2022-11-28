package OOP;
public class ObjectUtilize {
    public static void main(String[] args) {
        SuperHuman human1 = new SuperHuman("Batman", 81, "$$$");
        Car car = new Car("Mitsubishi", 300, 2022);
        System.out.printf("%s\n",human1.getData());
        System.out.println(car.speed);
    }
}
