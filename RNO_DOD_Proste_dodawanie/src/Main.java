import java.util.Scanner;

/**
 * Created by Adam Seweryn
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] tablica = new int[n][];
        for (int i = 0; i < n; i++) {
            tablica[i] = new int[scanner.nextInt()];
            for (int j = 0; j < tablica[i].length; j++) {
                tablica[i][j] = scanner.nextInt();
            }
        }

        for (int k = 0; k < n; k++) {
            int m = 0;
            for (int l = 0; l < tablica[k].length; l++) {
                m = m + tablica[k][l];

            }
            System.out.println(m);
        }
    }
} 