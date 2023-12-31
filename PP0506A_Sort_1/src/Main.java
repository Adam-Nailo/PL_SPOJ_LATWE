import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Adam Seweryn
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[][][] punkty = new String[n][][];
        for (int i = 0; i < n; i++) {
            int m = scanner.nextInt();
            scanner.nextLine();
            punkty[i] = new String[m][4];
            for (int j = 0; j < m; j++) {
                String napis = scanner.nextLine();
                String[] slowa = napis.split(" ");
                punkty[i][j][0] = slowa[0];
                punkty[i][j][1] = slowa[1];
                punkty[i][j][2] = slowa[2];
                punkty[i][j][3] = Double.toString(Math.sqrt(Math.pow(Double.parseDouble(punkty[i][j][1]), 2) + Math.pow(Double.parseDouble(punkty[i][j][2]), 2)));
            }
        }
        for (int i = 0; i < n; i++) {
            Double[] odleglosci = new Double[punkty[i].length];
            for (int j = 0; j < punkty[i].length; j++) {
                odleglosci[j] = Double.parseDouble(punkty[i][j][3]);
            }
            Arrays.sort(odleglosci);
            for (int k = 0; k < odleglosci.length; k++) {
                Double temp = odleglosci[k];
                for (int l = 0; l < odleglosci.length; l++) {
                    if (temp == Double.parseDouble(punkty[i][l][3])) {
                        System.out.println(punkty[i][l][0] + " " + punkty[i][l][1] + " " + punkty[i][l][2]);
                    }
                }
            }
            if (i == n - 1) {
                break;
            }
            System.out.println();
        }
    }
}