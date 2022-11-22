import java.util.Scanner;

public class QuickCode {
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        sc.nextLine();
        String[] array = new String[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextLine();
        }

        int pick = sc.nextInt();

        System.out.printf("%s",array[pick]);
        sc.close();
    }
    
}
