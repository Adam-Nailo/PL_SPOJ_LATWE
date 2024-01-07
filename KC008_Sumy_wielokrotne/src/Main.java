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
        BigInteger big_suma = BigInteger.valueOf(0);
        BigInteger suma;
        while (bufferedReader.ready()) {
            List<BigInteger> liczby = new LinkedList<>();
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            while (stringTokenizer.hasMoreElements()) {
                liczby.add(BigInteger.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
            }
            suma = BigInteger.valueOf(0);
            for (int i = 0; i < liczby.size(); i++) {
                suma = suma.add(liczby.get(i));
            }
            System.out.println(suma);
            big_suma = big_suma.add(suma);
        }
        System.out.println(big_suma);
    }
}