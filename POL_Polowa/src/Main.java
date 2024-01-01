import java.util.Scanner;

/**
 * Created by Adam Seweryn
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] slowa = new String[n];
        for (int i = 0; i < n; i++) {
            slowa[i] = scanner.nextLine();
        }
        for (int i = 0; i < n; i++) {
            int dlugosc =slowa[i].length();
            int polowa = dlugosc/2;
            System.out.println(slowa[i].substring(0,polowa));
        }
    }
}