import java.util.Scanner;

public class QuickCode {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int row = Integer.parseInt(sc.next());
        int column = Integer.parseInt(sc.next());
        sc.nextLine();

        String[][] board = new String[row][column];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ".";
            }
        }

        int targetX = Integer.parseInt(sc.next());
        int targetY = Integer.parseInt(sc.next());
        sc.nextLine();

        int counter = sc.nextInt();
        for (int i = 0; i < counter; i++) {
            row = Integer.parseInt(sc.next());
            column = Integer.parseInt(sc.next());
            sc.nextLine();
            if (row == targetX && column == targetY) {
                System.out.printf("Bullseye\n");
                board[targetX][targetY] = "W";
            } 
            else if ((row == targetX - 1 || row == targetX + 1) ^ 
            (column == targetY - 1 || column == targetY + 1)) {
                System.out.printf("Near Miss\n");
                board[row][column] = "X";
            } 
            else {
                System.out.printf("Miss\n");
                board[row][column] = "X";
            }
            getBoard(board);
        }
    }

    private static void getBoard(String board[][]) {
        for (String row[] : board) {
            for (String column : row) {
                System.out.printf("%s",column);
            }
            System.out.println();
        }
    }
}
