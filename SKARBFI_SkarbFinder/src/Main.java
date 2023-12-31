import java.util.Scanner;

/**
 * Created by Adam Seweryn
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][][] mapy = new int[n][][];
        for (int i = 0; i < n; i++) {
            int m = scanner.nextInt();
            mapy[i] = new int[m][2];
            for (int j = 0; j < m; j++) {
                mapy[i][j][0] = scanner.nextInt();
                mapy[i][j][1] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            int startx = 0;
            int starty = 0;
            for (int j = 0; j < mapy[i].length; j++) {
                switch (mapy[i][j][0]) {
                    case (0):
                        starty += mapy[i][j][1];
                        break;
                    case (1):
                        starty -= mapy[i][j][1];
                        break;
                    case (2):
                        startx -= mapy[i][j][1];
                        break;
                    case (3):
                        startx += mapy[i][j][1];
                        break;
                }
            }
            if (startx == 0 && starty == 0) {
                System.out.println("studnia");
            } else if (startx == 0) {
                if (starty > 0) {
                    System.out.println("0 " + starty);
                } else {
                    System.out.println("1 " + Math.abs(starty));
                }
            } else if (starty == 0) {
                if (startx > 0) {
                    System.out.println("3 " + startx);
                } else {
                    System.out.println("2 " + Math.abs(startx));
                }
            } else if (starty > 0) {
                if (startx > 0) {
                    System.out.println("0 " + starty);
                    System.out.println("3 " + startx);
                } else {
                    System.out.println("0 " + starty);
                    System.out.println("2 " + Math.abs(startx));
                }
            } else {
                if (startx > 0) {
                    System.out.println("1 " + Math.abs(starty));
                    System.out.println("3 " + startx);
                } else {
                    System.out.println("1 " + Math.abs(starty));
                    System.out.println("2 " + Math.abs(startx));
                }
            }
        }

    }
}
