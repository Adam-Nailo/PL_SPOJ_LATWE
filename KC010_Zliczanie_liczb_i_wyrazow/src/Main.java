import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by Adam Seweryn
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        char[] cyfry = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        int liczby, slowa, suma_cyfr;
        while (bufferedReader.ready()) {
            liczby = 0;
            slowa = 0;
            List<String> wyrazy = new LinkedList<>();
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            while (stringTokenizer.hasMoreElements()) {
                wyrazy.add(stringTokenizer.nextToken());
            }
            for (int i = 0; i < wyrazy.size(); i++) {
                suma_cyfr = 0;
                for (int j = 0; j < wyrazy.get(i).length(); j++) {

                    for (int k = 0; k < 10; k++) {
                        if (wyrazy.get(i).charAt(j) == cyfry[k]) {
                            suma_cyfr++;
                        }
                    }

                }
                if (suma_cyfr == wyrazy.get(i).length()) {
                    liczby++;
                } else {
                    slowa++;
                }
            }
            System.out.println(liczby + " " + slowa);
        }
    }
}