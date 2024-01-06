import java.util.Scanner;

/**
 * Created by Adam Seweryn
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m;
        int suma;
        for (int i = 0; i < n; i++) {
            suma = 0;
            m = scanner.nextInt();
            for (int j = 0; j < m; j++) {
                suma += scanner.nextInt();
            }
            suma += m - 1;
            System.out.println(suma);
        }
    }
}


