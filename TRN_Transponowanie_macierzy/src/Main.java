import java.util.Scanner;

/**
 * Created by Adam Seweryn
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int[][] macierz = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                macierz[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(macierz[j][i] + " ");
            }
            System.out.println();
        }
    }
}
