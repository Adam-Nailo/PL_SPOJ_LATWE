import java.util.Scanner;

/**
 * Created by Adam Seweryn
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n);
        int licznik = 0;
        int m;
        do {
            m = scanner.nextInt();
            if (n != 42 && m == 42) {
                licznik++;
            }
            n = m;
            System.out.println(n);
        } while (licznik < 3);
    }
}
