import java.util.Scanner;

/**
 * Created by Adam Seweryn
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[][] napisy = new String[n][2];
        for (int i = 0; i < n; i++) {
            String napis = scanner.nextLine();
            String[] slowa = napis.split(" ");
            napisy[i][0] = slowa[0];
            napisy[i][1] = slowa[1];
        }
for (int j = 0;j<n;j++){
    StringMerge(napisy[j][0],napisy[j][1]);
    System.out.println();
}
    }

    public static void StringMerge(String a, String b) {
        String krotszy = (a.length() > b.length()) ? b : a;
        for (int i = 0; i < krotszy.length(); i++) {
            System.out.print(a.charAt(i));
            System.out.print(b.charAt(i));
        }
    }
}


