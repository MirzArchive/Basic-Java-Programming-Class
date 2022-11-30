import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter matrix x y (ex. 6 9) : ","");
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.nextLine();

        int[][] matrix = new int[x][y]; // Nnotasi transpose matriks A^T

        System.out.println();
        for (int[] row : matrix) {
            System.out.printf("| ");
            for (int column : row) {
                System.out.printf("%d ",column);
            }
            System.out.printf("|\n");
        }
        System.out.println();

        sc.close();
    }
}
