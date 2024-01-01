import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Adam Seweryn
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> dane = new LinkedList<>();
        while (scanner.hasNextLine()){
            dane.add(scanner.nextLine());
        }
        String[][] informacje = new String[dane.size()][3];
        for (int i = 0; i< dane.size();i++){
            String[] param = dane.get(i).split(" ");
            informacje[i][0]=param[0];
            informacje[i][1]=param[1];
            informacje[i][2]=param[2];
            switch (informacje[i][0].charAt(0)){
                case '+':
                    System.out.println(Integer.parseInt(informacje[i][1])+Integer.parseInt(informacje[i][2]));
                    break;
                case '-':
                    System.out.println(Integer.parseInt(informacje[i][1])-Integer.parseInt(informacje[i][2]));
                    break;
                case '*':
                    System.out.println(Integer.parseInt(informacje[i][1])*Integer.parseInt(informacje[i][2]));
                    break;
                case '/':
                    System.out.println(Integer.parseInt(informacje[i][1])/Integer.parseInt(informacje[i][2]));
                    break;
                case '%':
                    System.out.println(Integer.parseInt(informacje[i][1])%Integer.parseInt(informacje[i][2]));
                    break;
            }
        }
    }
}