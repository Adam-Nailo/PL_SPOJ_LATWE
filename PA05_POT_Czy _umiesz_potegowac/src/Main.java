import java.util.Scanner;

/**
 * Created by Adam Seweryn
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] dane = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                dane[i][j] = scanner.nextInt();
            }
        }
        for (int k=0; k<n;k++){
            System.out.println(Potega(dane[k][0],dane[k][1]));
        }
    }

    public static int Potega(int a, int b) {
        switch (a % 10) {
            case 1:
                return 1;
            case 2:
                switch (b % 4) {
                    case 0:
                        return 6;
                    case 1:
                        return 2;
                    case 2:
                        return 4;
                    case 3:
                        return 8;
                }
            case 3:
                switch (b % 4) {
                    case 0:
                        return 1;
                    case 1:
                        return 3;
                    case 2:
                        return 9;
                    case 3:
                        return 7;
                }
            case 4:
                switch (b % 2) {
                    case 0:
                        return 6;
                    case 1:
                        return 4;
                }

            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                switch (b % 4) {
                    case 0:
                        return 1;
                    case 1:
                        return 7;
                    case 2:
                        return 9;
                    case 3:
                        return 3;
                }
            case 8:
                switch (b % 4) {
                    case 0:
                        return 6;
                    case 1:
                        return 8;
                    case 2:
                        return 4;
                    case 3:
                        return 2;
                }
            case 9:
                switch (b % 2) {
                    case 0:
                        return 1;
                    case 1:
                        return 9;
                }
            default:
                return 0;
        }


    }
}