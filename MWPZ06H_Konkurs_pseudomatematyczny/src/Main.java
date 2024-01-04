import java.util.Scanner;

/**
 * Created by Adam Seweryn
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m;
        for (int i = 0; i < n; i++) {
            m = scanner.nextInt();
            int[] wyniki = new int[m];
            for (int j = 0; j < m; j++) {
                wyniki[j] = scanner.nextInt();
            }
            if (m == 1) {
                System.out.println(wyniki[0]);
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                int max = 0;
                for (int j = 0; j < m; j++) {
                    if (wyniki[j] > max) {
                        max = wyniki[j];
                    }
                }
                for (int j = 0; j < m; j++) {
                    if (wyniki[j] == max) {
                        stringBuilder.append(wyniki[j]).append(" ");
                    }
                }
                for (int j = 0; j < max; j++) {
                    for (int k = 0; k < m; k++) {
                        if (j == wyniki[k])
                            stringBuilder.append(wyniki[k]).append(" ");
                    }
                }
                System.out.println(stringBuilder);
            }
        }
    }
}