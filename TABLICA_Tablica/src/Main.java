import java.util.Scanner;

/**
 * Created by Adam Seweryn
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String liczby = scanner.nextLine();
        String[] wartosci = liczby.split(" ");
        for (int i = wartosci.length; i > 0; i--) {
            System.out.print(wartosci[i - 1] + " ");
        }
    }
}