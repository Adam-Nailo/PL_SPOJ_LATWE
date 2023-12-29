import java.util.Scanner;

/**
 * Created by Adam Seweryn
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] zestawy = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                zestawy[i][j] = scanner.nextInt();
            }
        }
        for (int k = 0; k < n; k++) {
            System.out.println(nwd(zestawy[k][0], zestawy[k][1]));
        }
    }
    private static int nwd(int a, int b) {
        int c = (a>b) ? a%b : b%a;
        if(c==0) return Math.min(a, b);
        return (a>b) ? nwd(c, b) : nwd(c, a);
    }
} 