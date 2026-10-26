import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] arr = new int[4][2];
        int total = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = s.nextInt();
                total += arr[i][j];
            }
        }
        for (int i = 0; i < 4; i++) {
            int row = 0;
            for (int j = 0; j < 2; j++) {
                row += arr[i][j];
            }
            System.out.print(row / 2 + " ");
        }
        System.out.println();
        for (int j = 0; j < 2; j++) {
            int col = 0;
            for (int i = 0; i < 4; i++) {
                col += arr[i][j];
            }
            System.out.print(col / 4 + " ");
        }
        System.out.println();
        System.out.println(total / 8);
    }
}