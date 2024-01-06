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
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());
        int[] liczby = new int[n];
        int[] liczby_wyj = new int[n];
        StringTokenizer stringTokenizer1 = new StringTokenizer(bufferedReader.readLine(), " ");
        for (int i = 0; i < n; i++) {
            liczby[i] = Integer.parseInt(stringTokenizer1.nextToken());
        }
        for (int i = 0; i < n - m; i++) {
            liczby_wyj[i] = liczby[i + m];
        }
        for (int i = 0; i < m; i++) {
            liczby_wyj[n - i - 1] = liczby[m - i - 1];
        }
        for (int item : liczby_wyj) {
            System.out.print(item + " ");
        }
    }
}