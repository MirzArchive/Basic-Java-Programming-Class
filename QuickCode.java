import java.util.Scanner;

public class QuickCode {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        System.out.printf("%s",((n & 1) == 0 ? "EVEN" : "ODD"));
    }
}
