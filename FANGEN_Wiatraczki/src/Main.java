import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Adam Seweryn
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> wiatraczki = new ArrayList<>();

        int x = 0;
        do {
            wiatraczki.add(scanner.nextInt());
            x++;
        } while (wiatraczki.get(x - 1) != 0);

        for (int i = 0; i < wiatraczki.size(); i++) {

            if (wiatraczki.get(i) == 0) {
                break;
            } else if (wiatraczki.get(i) > 0) {
                System.out.println(wiatraczekLewoskretny(wiatraczki.get(i)));
            } else {
                System.out.println(wiatraczekPrawoskretny(Math.abs(wiatraczki.get(i))));
            }
        }
    }

    public static StringBuilder wiatraczekLewoskretny(int a) {
        int rozmiar_wiatraczka = 2 * a;
        int liczba_kropek = 0;
        char[][] wiatraczek = new char[rozmiar_wiatraczka][rozmiar_wiatraczka];

        for (int i = 0; i < rozmiar_wiatraczka; i++) {
            for (int j = 0; j < rozmiar_wiatraczka; j++) {
                wiatraczek[i][j] = '*';
            }
        }
        for (int i = 1; i <= rozmiar_wiatraczka; i++) {
            if (liczba_kropek < a) {
                for (int j = 0; j < liczba_kropek; j++) {
                    wiatraczek[a - i][a - j - 1] = '.';
                }
            }
            if (liczba_kropek < a) {
                for (int j = 0; j < liczba_kropek; j++) {
                    wiatraczek[i - 1][rozmiar_wiatraczka - j - 1] = '.';
                }

            }
            if (liczba_kropek < a) {
                for (int j = 0; j < liczba_kropek; j++) {
                    wiatraczek[rozmiar_wiatraczka - i][j] = '.';
                }
            }
            if (liczba_kropek < a) {
                for (int j = 0; j < liczba_kropek; j++) {
                    wiatraczek[a + i - 1][a + j] = '.';
                }
            }
            liczba_kropek++;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < rozmiar_wiatraczka; i++) {
            for (int j = 0; j < rozmiar_wiatraczka; j++) {
                stringBuilder.append(wiatraczek[i][j]);
            }
            stringBuilder.append("\n");
        }
        return stringBuilder;
    }

    public static StringBuilder wiatraczekPrawoskretny(int a) {
        int rozmiar_wiatraczka = 2 * a;
        int liczba_kropek = 0;
        char[][] wiatraczek = new char[rozmiar_wiatraczka][rozmiar_wiatraczka];

        for (int i = 0; i < rozmiar_wiatraczka; i++) {
            for (int j = 0; j < rozmiar_wiatraczka; j++) {
                wiatraczek[i][j] = '*';
            }
        }
        for (int i = 1; i <= rozmiar_wiatraczka; i++) {
            if (liczba_kropek < a) {
                for (int j = 0; j < liczba_kropek; j++) {
                    wiatraczek[a - i][a + j] = '.';
                }
            }
            if (liczba_kropek < a) {
                for (int j = 0; j < liczba_kropek; j++) {
                    wiatraczek[i - 1][i - j - 2] = '.';
                }

            }
            if (liczba_kropek < a) {
                for (int j = 0; j < liczba_kropek; j++) {
                    wiatraczek[rozmiar_wiatraczka - i][rozmiar_wiatraczka - j - 1] = '.';
                }
            }
            if (liczba_kropek < a) {
                for (int j = 0; j < liczba_kropek; j++) {
                    wiatraczek[a + i - 1][a - j - 1] = '.';
                }
            }
            liczba_kropek++;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < rozmiar_wiatraczka; i++) {
            for (int j = 0; j < rozmiar_wiatraczka; j++) {
                stringBuilder.append(wiatraczek[i][j]);
            }
            stringBuilder.append("\n");
        }
        return stringBuilder;
    }
}