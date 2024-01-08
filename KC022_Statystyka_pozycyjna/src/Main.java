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
        int liczba_wierszy = 0;
        List<String> wiersze = new LinkedList<>();
        while (bufferedReader.ready()) {
            wiersze.add(bufferedReader.readLine());
            liczba_wierszy++;
        }
        int[] pierwsze_znaki = new int[liczba_wierszy];
        for (int i = 0; i < liczba_wierszy; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(wiersze.get(i));
            pierwsze_znaki[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        for (int i=0;i<liczba_wierszy;i++){
            List<String> liczby = new LinkedList<>();
            StringTokenizer stringTokenizer = new StringTokenizer(wiersze.get(i));
            while (stringTokenizer.hasMoreElements()){
                liczby.add(stringTokenizer.nextToken());
            }

        }
    }
}