public class OOP_ObjectUtilization {
    public static void main(String[] args) {
        OOP_Static friend1 = new OOP_Static("Spongebob");
        OOP_Static friend2 = new OOP_Static("Patrick");
        OOP_Static friend3 = new OOP_Static("Squidward");

        System.out.printf("%d",OOP_Static.numberOfFriends);
        System.out.printf("Name : %s",friend1.name);
        System.out.printf("Name : %s",friend2.name);
        System.out.printf("Name : %s",friend3.name);
    }
}
