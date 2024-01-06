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
        while (bufferedReader.ready()) {
            double[] liczby = new double[3];
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            liczby[0] = Double.parseDouble(stringTokenizer.nextToken());
            liczby[1] = Double.parseDouble(stringTokenizer.nextToken());
            liczby[2] = Double.parseDouble(stringTokenizer.nextToken());
            if (liczby[0] < 0 || liczby[1] < 0 || liczby[2] < 0) {
                System.out.println(0);
            } else if
            (liczby[0] + liczby[1] > liczby[2] && liczby[0] + liczby[2] > liczby[1] && liczby[2] + liczby[1] > liczby[0]) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}