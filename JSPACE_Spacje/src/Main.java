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
        while (bufferedReader.ready()) {
            List<String> slowa = new LinkedList<>();
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            while (stringTokenizer.hasMoreElements()) {
                slowa.add(stringTokenizer.nextToken());
            }
            if (!slowa.isEmpty()) {
                System.out.print(slowa.get(0));
                for (int i = 1; i < slowa.size(); i++) {
                    System.out.print(SMS(slowa.get(i)));
                }
                System.out.println();
            }
        }
    }

    public static String SMS(String tekst) {
        return tekst.substring(0, 1).toUpperCase() + tekst.substring(1).toLowerCase();
    }
}