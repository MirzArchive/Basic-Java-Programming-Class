package OOP;
public class Static {
    String name;
    static int numberOfFriends;
    Static(String name) {
        this.name = name;
        numberOfFriends++;
    }

    void getNumberOfFriends() {
        System.out.println("You have " + numberOfFriends + " friend");
    }
}
