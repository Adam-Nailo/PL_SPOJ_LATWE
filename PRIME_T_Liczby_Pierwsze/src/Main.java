import java.util.Scanner;

/**
 * Created by Adam Seweryn
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numery = new int[n];
        for (int i = 0; i < n; i++) {
            numery[i] = scanner.nextInt();
        }

        for (int num : numery) {
            System.out.println(IsPrime(num));
        }

    }

    public static String IsPrime(int a) {
        if (a == 1) {
            return "NIE";
        } else {
            for (int i = 2; i < a; i++) if (a % i == 0) return "NIE";
            return "TAK";
        }
    }
}