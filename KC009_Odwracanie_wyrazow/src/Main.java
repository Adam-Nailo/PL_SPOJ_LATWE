import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Adam Seweryn
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String slowo;
        while (bufferedReader.ready()) {
            slowo = bufferedReader.readLine();
            for (int i = 0; i < slowo.length(); i++) {
                System.out.print(slowo.charAt(slowo.length() - 1 - i));
            }
            System.out.println();
        }
    }
}