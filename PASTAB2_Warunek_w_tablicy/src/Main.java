import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by Adam Seweryn
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<String> liczby = new LinkedList<>();
        while (bufferedReader.ready()) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            while (stringTokenizer.hasMoreElements()) {
                liczby.add(stringTokenizer.nextToken());
            }
        }
        int koniec = liczby.size();
        BigInteger ostatnia = new BigInteger(liczby.get(koniec - 1));
        if (liczby.get(koniec - 2).charAt(0) == '>') {
            for (int i = 1; i < koniec - 2; i++) {
                BigInteger wartosc = new BigInteger(liczby.get(i));
                if (wartosc.subtract(ostatnia).toString().charAt(0) != '-' && wartosc.subtract(ostatnia).toString().charAt(0) != '0') {
                    System.out.println(wartosc);
                }
            }
        } else {
            for (int i = 1; i < koniec - 2; i++) {
                BigInteger wartosc = new BigInteger(liczby.get(i));
                if (wartosc.subtract(ostatnia).toString().charAt(0) == '-' && wartosc.subtract(ostatnia).toString().charAt(0) != '0') {
                    System.out.println(wartosc);
                }
            }
        }
    }
}