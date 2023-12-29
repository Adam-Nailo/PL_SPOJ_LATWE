import java.util.Scanner;

/**
 * Created by Adam Seweryn
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numery = new int[n];
        for (int i = 0; i < n; i++) {
            numery[i] = scanner.nextInt();
        }
        for(int num:numery){
            System.out.println(Silnia(num));
        }
    }
    public static String Silnia(int a) {
        switch (a) {
            case 0:
            case 1:
                return "0 1";
            case 2:
                return "0 2";
            case 3:
                return "0 6";
            case 4:
                return "2 4";
            case 5:
            case 6:
            case 8:
                return "2 0";
            case 7:
                return "4 0";

            case 9:
                return "8 0";
            default:
                return "0 0";
        }
    }
}