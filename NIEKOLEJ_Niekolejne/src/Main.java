import java.io.*;

/**
 * Created by Adam Seweryn
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        int n = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        if (n <= 2) {
            if (n == 0) {
                stringBuilder.append(0);
            } else {
                stringBuilder.append("NIE");
            }
        } else if (n % 2 != 0) {
            stringBuilder.append(n - n / 2).append(" ");
            for (int i = 0; i < n / 2; i++) {
                stringBuilder.append(i).append(" ").append(n - i).append(" ");
            }
            stringBuilder.append((n - n / 2) - 1);
        } else {
            stringBuilder.append(n - n / 2).append(" ");
            for (int i = 0; i < n / 2; i++) {
                stringBuilder.append(i).append(" ").append(n - i).append(" ");
            }
            System.out.println();
        }
        out.write((stringBuilder.toString()).getBytes());
        out.flush();
    }
}
