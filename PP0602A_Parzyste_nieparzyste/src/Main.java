import java.util.Scanner;

/**
 * Created by Adam Seweryn
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i<n;i++){
            int m = scanner.nextInt();
            int [] ciag = new int[m];
            for (int j =0;j<m;j++){
                ciag[j]= scanner.nextInt();
            }
            for (int j = 0;j<m;j++){
                if (j%2==1) System.out.print(ciag[j]+" ");
            }
            for (int j = 0;j<m;j++){
                if (j%2==0) System.out.print(ciag[j]+" ");
            }
            System.out.println();
        }
    }
}