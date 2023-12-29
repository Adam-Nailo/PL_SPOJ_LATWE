import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Adam Seweryn
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double r = scanner.nextDouble();
        double d = scanner.nextDouble();
        System.out.println(Math.PI*(Math.pow(r,2)-(Math.pow(d,2)/4)));
    }
}