import java.util.Scanner;

/**
 * Created by Adam Seweryn
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[][] pary_liczb = new double[n][2];
        for (int i = 0; i < n; i++) {
            pary_liczb[i][0] = scanner.nextDouble();
            pary_liczb[i][1] = scanner.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            System.out.println((long) dwumianNewtona(pary_liczb[i][0], pary_liczb[i][1]));
        }
    }

    public static double dwumianNewtona(double a, double b) {
        double wynik = 1;
        for (int i = 1; i <= b; i++) {
            wynik = (wynik * (a - i + 1) / i);
        }
        return Math.round(wynik);
    }
}