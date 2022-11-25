import java.util.Scanner;

public class QuickCode {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.printf("%s\n",((n & 1) == 0 ? "EVEN" : "ODD"));
        System.out.printf("%d",n << 1);
    }
}
