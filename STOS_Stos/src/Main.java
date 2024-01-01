import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Adam Seweryn
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> komendy = new LinkedList<>();
        while (scanner.hasNextLine()) {
            komendy.add(scanner.nextLine());
        }
        List<String> stos = new LinkedList<>();
        for (int i = 0; i < komendy.size(); i++) {
            if (komendy.get(i).charAt(0) == '+') {
                if (stos.size() < 10) {
                    stos.add(komendy.get(i + 1));
                    System.out.println(":)");
                } else {
                    System.out.println(":(");
                }
            } else {
                if (komendy.get(i).charAt(0) == '-') {
                    if (stos.size() > 0) {
                        System.out.println(stos.get(stos.size() - 1));
                        stos.remove(stos.size() - 1);
                    } else {
                        System.out.println(":(");
                    }
                }
            }
        }
    }
}