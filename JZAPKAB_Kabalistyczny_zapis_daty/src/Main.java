import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Adam Seweryn
 */
public class Main {
    public static void main(String[] args) throws IOException {
        int liczba = 0;
        String slowo;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        slowo = bufferedReader.readLine();
        for (int i = 0; i < slowo.length(); i++) {
            if (slowo.charAt(i) == 'a') liczba += 1;
            if (slowo.charAt(i) == 'b') liczba += 2;
            if (slowo.charAt(i) == 'c') liczba += 3;
            if (slowo.charAt(i) == 'd') liczba += 4;
            if (slowo.charAt(i) == 'e') liczba += 5;
            if (slowo.charAt(i) == 'f') liczba += 6;
            if (slowo.charAt(i) == 'g') liczba += 7;
            if (slowo.charAt(i) == 'h') liczba += 8;
            if (slowo.charAt(i) == 'i') liczba += 9;
            if (slowo.charAt(i) == 'k') liczba += 10;
            if (slowo.charAt(i) == 'l') liczba += 20;
            if (slowo.charAt(i) == 'm') liczba += 30;
            if (slowo.charAt(i) == 'n') liczba += 40;
            if (slowo.charAt(i) == 'o') liczba += 50;
            if (slowo.charAt(i) == 'p') liczba += 60;
            if (slowo.charAt(i) == 'q') liczba += 70;
            if (slowo.charAt(i) == 'r') liczba += 80;
            if (slowo.charAt(i) == 's') liczba += 90;
            if (slowo.charAt(i) == 't') liczba += 100;
            if (slowo.charAt(i) == 'v') liczba += 200;
            if (slowo.charAt(i) == 'x') liczba += 300;
            if (slowo.charAt(i) == 'y') liczba += 400;
            if (slowo.charAt(i) == 'z') liczba += 500;
        }
        System.out.println(liczba);
    }
}