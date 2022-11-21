public class OOP_Static {
    String name;
    static int numberOfFriends;
    OOP_Static(String name) {
        this.name = name;
        numberOfFriends++;
    }

    void getNumberOfFriends() {
        System.out.println("You have " + numberOfFriends + " friend");
    }
}
