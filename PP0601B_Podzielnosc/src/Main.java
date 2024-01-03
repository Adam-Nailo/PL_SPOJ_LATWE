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
        int n = Integer.parseInt(bufferedReader.readLine());
        String linia_danych;
        int a, b, c;
        for (int i = 0; i < n; i++) {
            linia_danych = bufferedReader.readLine();
            StringTokenizer stringTokenizer = new StringTokenizer(linia_danych, " ");
            a = Integer.parseInt(stringTokenizer.nextToken());
            b = Integer.parseInt(stringTokenizer.nextToken());
            c = Integer.parseInt(stringTokenizer.nextToken());
            for (int j = 0; j < a; j++) {
                if (j % b == 0 && j % c != 0) {
                    System.out.print(j + " ");
                }
            }
        }
    }
}
