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
        char znak;
        String slowo;
        while (bufferedReader.ready()) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            znak = stringTokenizer.nextToken().charAt(0);
            slowo = stringTokenizer.nextToken();
            for (int i = 0; i < slowo.length(); i++) {
                if (slowo.charAt(i) != znak) {
                    System.out.print(slowo.charAt(i));
                }
            }
            System.out.println();
        }
    }
}