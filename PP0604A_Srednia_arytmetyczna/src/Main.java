import java.util.Scanner;

/**
 * Created by Adam Seweryn
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int m = scanner.nextInt();
            float suma = 0;
            float srednia;
            int minimum = 0;
            int[] liczby = new int[m];
            for (int j = 0; j < m; j++) {
                liczby[j] = scanner.nextInt();
            }
            for (int k = 0; k < m; k++) {
                suma += liczby[k];
            }
            srednia = suma / m;
            for (int j = 0; j < m; j++) {
                if (j == 0) {
                    minimum = liczby[0];
                } else {
                    if (Math.abs(srednia - minimum) > Math.abs(srednia - liczby[j])) {
                        minimum = liczby[j];
                    }
                }

            }
            System.out.println(minimum);
        }
    }

}