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
        String imie;
        String nazwisko;
        String wiek;
        int dobrze, rok, miesiac, dzien;
        char[] alfabet_maly = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] alfabet_duzy = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] liczby = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        while (bufferedReader.ready()) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), ";");
            imie = stringTokenizer.nextToken();
            imie = imie.substring(6);
            nazwisko = stringTokenizer.nextToken();
            nazwisko = nazwisko.substring(11);
            wiek = stringTokenizer.nextToken();
            wiek = wiek.substring(11);
            dobrze = 0;
            for (int i = 0; i < 26; i++) {
                if (imie.charAt(0) == alfabet_duzy[i]) {
                    dobrze++;
                }
            }
            if (dobrze != 1) {
                System.out.println(0);
            } else {
                for (int i = 1; i < imie.length(); i++) {
                    for (int j = 0; j < 26; j++) {
                        if (imie.charAt(i) == alfabet_maly[j]) {
                            dobrze++;
                        }
                    }
                }
                if (dobrze != imie.length()) {
                    System.out.println(0);
                } else {
                    dobrze = 0;
                    for (int i = 0; i < 26; i++) {
                        if (nazwisko.charAt(0) == alfabet_duzy[i]) {
                            dobrze++;
                        }
                    }
                    if (dobrze != 1) {
                        System.out.println(1);
                    } else {
                        for (int i = 1; i < nazwisko.length(); i++) {
                            for (int j = 0; j < 26; j++) {
                                if (nazwisko.charAt(i) == alfabet_maly[j]) {
                                    dobrze++;
                                }
                            }
                        }
                        if (dobrze != nazwisko.length()) {
                            System.out.println(1);
                        } else {
                            if (wiek.length() != 10 || wiek.charAt(4) != '-' || wiek.charAt(7) != '-') {
                                System.out.println(2);
                            } else {
                                dobrze = 0;
                                for (int i = 0; i < wiek.length(); i++) {
                                    for (int j = 0; j < 10; j++) {
                                        if (wiek.charAt(i) == liczby[j]) {
                                            dobrze++;
                                        }
                                    }
                                }
                                if (dobrze != 8) {
                                    System.out.println(2);
                                } else {
                                    rok = Integer.parseInt(wiek.substring(0, 4));
                                    miesiac = Integer.parseInt(wiek.substring(5, 7));
                                    dzien = Integer.parseInt(wiek.substring(8, 10));
                                    if (rok > 2000 || rok < 1900 || miesiac > 12 || miesiac < 1 || dzien > 31 || dzien < 1) {
                                        System.out.println(2);
                                    } else {
                                        System.out.println(3);
                                    }
                                }
                            }
                        }
                    }
                }
            }

        }
    }
}