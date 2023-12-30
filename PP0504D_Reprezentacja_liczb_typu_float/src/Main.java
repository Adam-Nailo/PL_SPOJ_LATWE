import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Adam Seweryn
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int n = scanner.nextInt();
        float[] liczby = new float[n];
        for (int i = 0; i < n; i++) {
            liczby[i] = scanner.nextFloat();
        }
        for (int i = 0; i < n; i++) {
            printfloat(liczby[i]);
        }
    }

    public static void printfloat(float a) {
        StringBuilder stringBuilder = new StringBuilder();
        if (a == 0) {
            stringBuilder.append("0 0 0 0");
        } else {
            for (int i = 0; i < 4; i++) {
                if (Integer.toHexString(Float.floatToIntBits(a)).substring(2 * i, 2 * i + 2).equals("00")) {
                    stringBuilder.append("0");
                } else {
                    if (Integer.toHexString(Float.floatToIntBits(a)).substring(2 * i, 2 * i + 2).startsWith("0")) {
                        stringBuilder.append(Integer.toHexString(Float.floatToIntBits(a)).substring(2 * i + 1, 2 * i + 2));
                    } else {
                        stringBuilder.append(Integer.toHexString(Float.floatToIntBits(a)).substring(2 * i, 2 * i + 2));
                    }
                }
                if (i != 3) stringBuilder.append(" ");
            }
        }
        System.out.println(stringBuilder.toString());
    }
}