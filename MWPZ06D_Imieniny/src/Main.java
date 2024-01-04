import java.util.Scanner;

/**
 * Created by Adam Seweryn
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int dzieci, cukierki;
        for (int i = 0; i < n; i++) {
            dzieci = scanner.nextInt();
            cukierki = scanner.nextInt();
            dzieci--;
            if (dzieci == 1 || cukierki == 0) {
                System.out.println("NIE");
            } else if (dzieci == 0) {
                System.out.println("TAK");
            } else {
                if (cukierki % dzieci == 0) {
                    System.out.println("NIE");
                } else {
                    System.out.println("TAK");
                }
            }

        }
    }
}
