import java.util.Scanner;

/**
 * Created by Adam Seweryn
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] napisy = new String[n];
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            napisy[i] = scanner.nextLine();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(Wyraz(napisy[i]));
        }
    }

    public static String Wyraz(String slowo) {
        if (slowo.length() < 3) return slowo;
        else {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < slowo.length() - 1; i++) {
                char c = slowo.charAt(i);
                stringBuilder.append(c);
                int count = 1;
                if (i == slowo.length() - 1) {
                    break;
                }
                while (c == slowo.charAt(i + 1)) {
                    count++;
                    i++;
                    if (i == slowo.length() - 1) {
                        break;
                    }
                }
                if (count == 2) {
                    stringBuilder.append(c);
                } else if (count > 2) {
                    stringBuilder.append(count);
                }
                if (i == slowo.length() - 2) {
                    stringBuilder.append(slowo.charAt(i + 1));
                }

            }
            return stringBuilder.toString();

        }
    }
} 