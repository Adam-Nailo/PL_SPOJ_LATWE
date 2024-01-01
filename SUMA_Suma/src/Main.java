import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Adam Seweryn
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> liczby = new LinkedList<>();
        while (scanner.hasNextInt()) {
            liczby.add(scanner.nextInt());
        }
        int suma = 0;
        int x = 1;
        for (int i = 0; i < liczby.size(); i++) {
            for (int j =0;j<x;j++){
                suma+= liczby.get(j);
            }
            System.out.println(suma);
            suma = 0;
            x++;
        }
    }
}