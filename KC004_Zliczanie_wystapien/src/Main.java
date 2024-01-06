import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by Adam Seweryn
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int liczba_wystapien;
        while (bufferedReader.ready()) {
            liczba_wystapien = 0;
            List<String> liczby = new ArrayList<>();
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            while (stringTokenizer.hasMoreElements()) {
                liczby.add(stringTokenizer.nextToken());
            }
            for (int i = 2; i < Integer.parseInt(liczby.get(1)) + 2; i++) {
                if (Integer.parseInt(liczby.get(i)) == Integer.parseInt(liczby.get(0))) {
                    liczba_wystapien++;
                }
            }
            System.out.println(liczba_wystapien);
        }
    }
}