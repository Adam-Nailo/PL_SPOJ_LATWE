import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Adam Seweryn
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        List<String> dane = new LinkedList<>();
        while (scanner.hasNextLine()) {
            dane.add(scanner.nextLine());
        }
        float[][] parametry = new float[dane.size()][3];
        for (int i = 0; i < dane.size(); i++) {
            String[] param = dane.get(i).split(" ");
            parametry[i][0] = Float.parseFloat(param[0]);
            parametry[i][1] = Float.parseFloat(param[1]);
            parametry[i][2] = Float.parseFloat(param[2]);
            float delta = (float) Math.pow(parametry[i][1],2) - 4*parametry[i][0]*parametry[i][2];
            if (delta > 0) {
                System.out.println(2);
            } else if (delta == 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}