import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Adam Seweryn
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        String pesel;
        int x;
        int[] wartosci = new int[11];
        for (int i = 0; i < n; i++) {
            pesel = bufferedReader.readLine();
            for (int j = 0; j < 11; j++) {
                wartosci[j] = pesel.charAt(j);
            }
            x = wartosci[0] + wartosci[1] * 3 + wartosci[2] * 7 + wartosci[3] * 9 + wartosci[4] + wartosci[5] * 3 + wartosci[6] * 7 + wartosci[7] * 9 + wartosci[8] + wartosci[9] * 3 + wartosci[10];
            if (x > 0 && x % 10 == 0) {
                System.out.println('D');
            } else {
                System.out.println('N');
            }
        }
    }
}