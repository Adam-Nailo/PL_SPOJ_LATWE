import java.util.Scanner;

/**
 * Created by Adam Seweryn
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int[][] tablica = new int[x][y];
            int[][] tablica_obrocona = new int[x][y];
            for (int j = 0; j < x; j++) {
                for (int k = 0; k < y; k++) {
                    tablica[j][k] = scanner.nextInt();
                }
            }
            for (int j = 0; j < x; j++) {
                for (int k = 0; k < y; k++) {
                    if (j == 0) {
                        if (k == y - 1) {
                            tablica_obrocona[j][k] = tablica[j + 1][k];
                        } else {
                            tablica_obrocona[j][k] = tablica[j][k + 1];
                        }
                    } else if (j == x - 1) {
                        if (k == 0) {
                            tablica_obrocona[j][k] = tablica[j - 1][k];
                        } else {
                            tablica_obrocona[j][k] = tablica[j][k - 1];
                        }
                    } else {
                        if (k == 0) {
                            tablica_obrocona[j][k] = tablica[j - 1][k];
                        } else if (k == y - 1) {
                            tablica_obrocona[j][k] = tablica[j + 1][k];
                        } else {
                            tablica_obrocona[j][k] = tablica[j][k];
                        }
                    }
                }
            }
            for (int j = 0; j < x; j++) {
                for (int k = 0; k < y; k++) {
                    System.out.print(tablica_obrocona[j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}