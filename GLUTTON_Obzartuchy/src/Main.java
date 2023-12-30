import java.util.Scanner;

/**
 * Created by Adam Seweryn
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] tabela_obrzartuchow = new int[n][];
        int[] liczba_ciastek_w_pudelku = new int[n];
        for (int i = 0; i < n; i++) {
            tabela_obrzartuchow[i] = new int[scanner.nextInt()];
            liczba_ciastek_w_pudelku[i] = scanner.nextInt();
            for (int j = 0; j < tabela_obrzartuchow[i].length; j++) {
                tabela_obrzartuchow[i][j] = scanner.nextInt();
            }
        }
        for (int k = 0; k < n; k++) {
            int liczba_na_dobe = 0;
            for (int l = 0; l < tabela_obrzartuchow[k].length; l++) {

                liczba_na_dobe += 86400 / tabela_obrzartuchow[k][l];
            }
            if (liczba_na_dobe % liczba_ciastek_w_pudelku[k] == 0) {
                System.out.println(liczba_na_dobe / liczba_ciastek_w_pudelku[k]);
            } else {
                System.out.println(liczba_na_dobe / liczba_ciastek_w_pudelku[k] + 1);
            }
        }
    }
}
