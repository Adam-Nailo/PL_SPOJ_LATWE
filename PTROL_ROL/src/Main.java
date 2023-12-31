import java.util.Scanner;

/**
 * Created by Adam Seweryn
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] liczby = new int[n][];
        for (int i = 0; i < n; i++) {
            int m = scanner.nextInt();
            liczby[i] = new int[m];
            for (int j = 0; j < m; j++) {
                liczby[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            int p = liczby[i][0];
            for (int j = 0; j < liczby[i].length; j++) {

                if (j == liczby[i].length - 1) {
                    liczby[i][j] = p;
                } else {
                    liczby[i][j] = liczby[i][j + 1];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < liczby[i].length; j++) {
                System.out.print(liczby[i][j]+" ");
            }
            System.out.println();
        }
    }

}
