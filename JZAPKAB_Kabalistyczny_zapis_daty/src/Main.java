import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Adam Seweryn
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String[][] szyfr = {{"a", "1"}, {"b", "2"}, {"c", "3"}, {"d", "4"}, {"e", "5"}, {"f", "6"}, {"g", "7"}, {"h", "8"}, {"i", "9"}, {"k", "10"}, {"l", "20"}, {"m", "30"}, {"n", "40"}, {"o", "50"}, {"p", "60"}, {"q", "70"}, {"r", "80"}, {"s", "90"}, {"t", "100"}, {"v", "200"}, {"x", "300"}, {"y", "400"}, {"z", "500"}};
        int liczba = 0;
        String slowo;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        slowo = bufferedReader.readLine();
        for (int i = 0; i < slowo.length(); i++) {
            for (int j = 0; j < szyfr.length; j++) {
                if (slowo.charAt(i) == szyfr[j][0].charAt(0)) {
                    liczba += Integer.parseInt(szyfr[j][1]);
                }
            }
        }
        System.out.println(liczba);
    }
}