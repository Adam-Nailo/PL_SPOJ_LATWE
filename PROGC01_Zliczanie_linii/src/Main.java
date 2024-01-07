import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Adam Seweryn
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int liczba_linii = 0;
        while (bufferedReader.ready()) {
            bufferedReader.readLine();
            liczba_linii++;
        }
        System.out.println(liczba_linii);
    }
}