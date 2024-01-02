import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Adam Seweryn
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String x;
        bufferedReader.readLine();
        short a, b;
        while ((x = bufferedReader.readLine()) != null) {
            StringTokenizer dane = new StringTokenizer(x, " ");
            System.out.println(2 * (a = Short.parseShort(dane.nextToken())) * (b = Short.parseShort(dane.nextToken())) / (a + b));
        }
    }
}