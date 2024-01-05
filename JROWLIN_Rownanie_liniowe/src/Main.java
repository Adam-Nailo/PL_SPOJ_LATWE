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
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        float a = Float.parseFloat(stringTokenizer.nextToken());
        float b = Float.parseFloat(stringTokenizer.nextToken());
        float c = Float.parseFloat(stringTokenizer.nextToken());
        if (a == 0){
            if (b == c){
                System.out.println("NWR");
            } else {
                System.out.println("BR");
            }
        } else{
            System.out.format("%.2f",(c-b)/a);
        }

    }
}