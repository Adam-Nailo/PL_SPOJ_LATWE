import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by Adam Seweryn
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        char[] alfabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        while (bufferedReader.ready()) {
            List<String> slowa = new ArrayList<>();
            StringBuilder stringBuilder = new StringBuilder();
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            while (stringTokenizer.hasMoreElements()) {
                slowa.add(stringTokenizer.nextToken());
            }
            for (int i = 0; i < slowa.size(); i++) {
                for (int j = 0; j < slowa.get(i).length(); j++) {
                    for (int k = 0; k < alfabet.length; k++) {
                        if (slowa.get(i).charAt(j) == alfabet[23]) {
                            stringBuilder.append(alfabet[0]);
                            break;
                        } else if (slowa.get(i).charAt(j) == alfabet[24]) {
                            stringBuilder.append(alfabet[1]);
                            break;
                        } else if (slowa.get(i).charAt(j) == alfabet[25]) {
                            stringBuilder.append(alfabet[2]);
                            break;
                        } else if (slowa.get(i).charAt(j) == alfabet[k]) {
                            stringBuilder.append(alfabet[k + 3]);
                        }
                    }
                }
                stringBuilder.append(" ");
            }
            System.out.println(stringBuilder);
        }

    }
}
