import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Adam Seweryn
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int a1,a2,a3,b1,b2,b3;
        for (int i = 0;i<n;i++){
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(),"\t");
            a1 = Integer.parseInt(stringTokenizer.nextToken());
            b1 = Integer.parseInt(stringTokenizer.nextToken());
            a2 = Integer.parseInt(stringTokenizer.nextToken());
            b2 = Integer.parseInt(stringTokenizer.nextToken());
            a3 = Integer.parseInt(stringTokenizer.nextToken());
            b3 = Integer.parseInt(stringTokenizer.nextToken());
            if (a1==a2 && a2==a3){
                System.out.println("TAK");
            } else if (b1==b2 && b2==b3) {
                System.out.println("TAK");
            } else if (b1-a1==b2-a2 && b2-a2==b3-a3) {
                System.out.println("TAK");
            } else {
                System.out.println("NIE");
            }
        }
    }
}