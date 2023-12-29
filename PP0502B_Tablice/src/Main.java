import java.util.Scanner;

/**
 * Created by Adam Seweryn
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] teksty = new int[n][];
        for (int i = 0; i < n; i++) {
            int m = scanner.nextInt();
            teksty[i] = new int[m];
            for (int j = 0; j < m; j++) {
                teksty[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j =teksty[i].length-1; j>=0;j--){
                System.out.print(teksty[i][j]+ " ");
            }
            System.out.println();
        }
    }
}