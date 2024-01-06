import java.util.Scanner;

/**
 * Created by Adam Seweryn
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int suma = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int m = scanner.nextInt();
            suma+=m;
            if (suma>max){
                max=suma;
            }
            if (suma<0){
                suma = 0;
            }
        }
        System.out.println(max);
    }
}