import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Adam Seweryn
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String napis;
        int j;

        while (bufferedReader.ready()) {
            napis = bufferedReader.readLine();
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < napis.length(); i++) {
                if (napis.charAt(i) == '<') {
                    j = i;
                    while (napis.charAt(j) != '>') {
                        stringBuilder.append(napis.substring(j, j + 1).toUpperCase());
                        j++;
                    }
                    i = j;
                }
                stringBuilder.append(napis.charAt(i));
            }
            System.out.println(stringBuilder);
        }
    }
}