import java.util.Scanner;

/**
 * Created by Adam Seweryn
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] liczby = new int[n];
        for (int i = 0; i < n; i++) {
            liczby[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int x = 0;
            int s = liczby[i];
            if (s == 1) {
                System.out.println(0);
            } else {
                while (s != 1) {
                    if (s % 2 == 0) {
                        s = s / 2;
                    } else {
                        s = 3 * s + 1;
                    }
                    x++;
                }
                System.out.println(x);
            }

        }
    }
}