import java.util.Scanner;

/**
 * Created by Adam Seweryn
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] zestawy = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                zestawy[i][j] = scanner.nextInt();
            }
        }
        for (int k = 0; k < n; k++) {
            System.out.println(NajmniejszaWspolnaWielokrotnosc(zestawy[k][0], zestawy[k][1]));
        }
    }

    public static int NajmniejszaWspolnaWielokrotnosc(int a, int b) {
        int wynik = 0;
        int wieksza = 0;
        int mniejsza = 0;

        if (a > b) {
            wieksza = a;
            mniejsza = b;
        } else {
            wieksza = b;
            mniejsza = a;
        }

        if (wieksza == mniejsza) {
            wynik = wieksza;
        } else if (wieksza == (2 * mniejsza)) {
            wynik = wieksza;
        } else if (wieksza == (3 * mniejsza)) {
            wynik = wieksza;
        } else {
            wynik = wieksza * mniejsza;
            if (wieksza % 13 == 0 && mniejsza % 13 == 0) wynik /= 13;
            if (wieksza % 11 == 0 && mniejsza % 11 == 0)
                wynik /= 11;
            if (wieksza % 7 == 0 && mniejsza % 7 == 0)
                wynik /= 7;
            if (wieksza % 5 == 0 && mniejsza % 5 == 0)
                wynik /= 5;
            if (wieksza % 3 == 0 && mniejsza % 3 == 0) wynik /= 3;
            if (wieksza % 2 == 0 && mniejsza % 2 == 0)
                wynik /= 2;
        }
        return wynik;
    }
} 