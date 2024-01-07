import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

/**
 * Created by Adam Seweryn
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String znak;
        char x;
        while (bufferedReader.ready()) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");


            BigInteger a = new BigInteger(stringTokenizer.nextToken());
            znak = stringTokenizer.nextToken();
            BigInteger b = new BigInteger(stringTokenizer.nextToken());
            x = znak.charAt(0);
            switch (x) {
                case '=':
                    if (a.equals(b)) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;
                case '!':
                    if (a.equals(b)) {
                        System.out.println(0);
                    } else {
                        System.out.println(1);
                    }
                    break;
                case '>':
                    if (a.subtract(b).toString().charAt(0) == '-') {
                        System.out.println(0);
                    } else {
                        System.out.println(1);
                    }
                    break;
                case '<':
                    if (a.subtract(b).toString().charAt(0) == '-') {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;
            }
        }
    }
}