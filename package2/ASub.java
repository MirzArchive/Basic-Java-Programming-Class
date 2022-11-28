package package2;
import package1.*;

public class ASub extends A {
    public static void main(String[] args) {
        ASub asub = new ASub();
        System.out.printf("%s",asub.protectedMessage);
    }
}
