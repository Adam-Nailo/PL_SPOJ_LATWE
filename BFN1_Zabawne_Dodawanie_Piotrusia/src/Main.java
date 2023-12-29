import java.util.Scanner;

/**
 * Created by Adam Seweryn
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] liczby = new int[n];
        for (int i = 0; i < n; i++) {
            liczby[i] = scanner.nextInt();
        }
        for (int j = 0; j < n; j++) {
            System.out.println(ZabDod(liczby[j]));
        }
    }

    public static String ZabDod(int a) {
        int liczba_dodawan = 0;
        String palindrom = Integer.toString(a);
        int k = 8;
        for (int i = 0; i < k; i++) {
            if ((a < 10)) {
                break;
            } else if (palindrom.length() == 2) {
                String c1 = palindrom.substring(0, 1);
                String c2 = palindrom.substring(1, 2);
                if (c1.equals(c2)) {
                    break;
                } else {
                    palindrom = Integer.toString(Integer.parseInt(c1 + c2) + Integer.parseInt(c2 + c1));
                    liczba_dodawan++;

                }
            } else if (palindrom.length() == 3) {
                String c1 = palindrom.substring(0, 1);
                String c2 = palindrom.substring(1, 2);
                String c3 = palindrom.substring(2, 3);
                if (c1.equals(c3)) {
                    break;
                } else {
                    palindrom = Integer.toString(Integer.parseInt(c1 + c2 + c3) + Integer.parseInt(c3 + c2 + c1));
                    liczba_dodawan++;

                }
            } else if (palindrom.length() == 4) {
                String c1 = palindrom.substring(0, 1);
                String c2 = palindrom.substring(1, 2);
                String c3 = palindrom.substring(2, 3);
                String c4 = palindrom.substring(3, 4);
                if (c1.equals(c4) && c2.equals(c3)) {
                    break;
                } else {
                    palindrom = Integer.toString(Integer.parseInt(c1 + c2 + c3 + c4) + Integer.parseInt(c4 + c3 + c2 + c1));
                    liczba_dodawan++;

                }
            } else if (palindrom.length() == 5) {
                String c1 = palindrom.substring(0, 1);
                String c2 = palindrom.substring(1, 2);
                String c3 = palindrom.substring(2, 3);
                String c4 = palindrom.substring(3, 4);
                String c5 = palindrom.substring(4, 5);
                if (c1.equals(c5) && c2.equals(c4)) {
                    break;
                } else {
                    palindrom = Integer.toString(Integer.parseInt(c1 + c2 + c3 + c4 + c5) + Integer.parseInt(c5 + c4 + c3 + c2 + c1));
                    liczba_dodawan++;

                }
            }
        }
        return palindrom + " " + liczba_dodawan;
    }
} 