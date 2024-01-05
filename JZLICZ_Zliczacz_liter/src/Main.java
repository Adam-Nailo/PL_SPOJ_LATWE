import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Adam Seweryn
 */
public class Main {
    public static void main(String[] args) throws IOException {
        char[] alfabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        int[] powtorzenia = new int[52];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        String linia;
        for (int i = 0; i < n; i++) {
            linia = bufferedReader.readLine();
            for (int j = 0; j < 52; j++) {
                for (int k = 0; k < linia.length(); k++) {
                    if (alfabet[j] == linia.charAt(k))
                        powtorzenia[j]++;
                }
            }
        }
        for (int i = 0; i < 52; i++) {
            if (powtorzenia[i] != 0) {
                System.out.println(alfabet[i] + " " + powtorzenia[i]);
            }
        }
    }
}