import java.util.Scanner;

/**
 * Created by Adam Seweryn
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] zetony = new int[n][2];
        for (int i = 0; i < n; i++) {
            zetony[i][0] = scanner.nextInt();
            zetony[i][1] = scanner.nextInt();
        }
        for (int i = 0; i<n;i++){
            int wieksza = Math.max(zetony[i][0], zetony[i][1]);
            int mniejsza = Math.min(zetony[i][0], zetony[i][1]);
                if (wieksza == mniejsza){
                    System.out.println(wieksza+mniejsza);
                } else {
                    int pom;
                    while (wieksza-mniejsza>0){
                        pom =wieksza - mniejsza;
                        wieksza = Math.max(pom, mniejsza);
                        mniejsza = Math.min(pom,mniejsza);
                    }
                    System.out.println(wieksza+mniejsza);
                }
        }
    }
}