import java.util.Scanner;

/**
 * Created by Adam Seweryn
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String szesnastkowy, jedenastkowy;
        for (int i = 0; i < n; i++) {
            int m = scanner.nextInt();
            szesnastkowy = zamiana(m, 16);
            jedenastkowy = zamiana(m, 11);
            System.out.println(szesnastkowy + " " + jedenastkowy);
        }
    }

    public static String zamiana(int a, int b) {
        char[] wartosci = new char[50];
        char[] znaki = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int index = 0;
        for (int i = 0; a != 0; a /= b) {
            wartosci[index++] = znaki[a % b];
        }
        String text = "";
        for (int j = 0; (j < wartosci.length && wartosci[j] != 0); j++) {
            text = wartosci[j] + text;
        }
        return text;
    }
}