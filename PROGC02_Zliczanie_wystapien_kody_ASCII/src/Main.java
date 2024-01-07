import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Adam Seweryn
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<String> znaki = new LinkedList<>();
        int liczba_wczytanych_linii = 0;
        while (bufferedReader.ready()) {
            znaki.add(bufferedReader.readLine());
            liczba_wczytanych_linii++;
        }
        int liczba_znakow = 0;
        for (int i = 0; i < znaki.size(); i++) {
            for (int j = 0; j < znaki.get(i).length(); j++) {
                liczba_znakow++;
            }
        }
        List<Character> znaki_list = new LinkedList<>();
        for (int i = 0; i < znaki.size(); i++) {
            for (int j = 0; j < znaki.get(i).length(); j++) {
                znaki_list.add(znaki.get(i).charAt(j));
            }
        }
        char[] symbole_char = new char[liczba_znakow];
        for (int i = 0; i < znaki_list.size(); i++) {
            symbole_char[i] = znaki_list.get(i);
        }
        int[] symbole_int = new int[liczba_znakow];
        for (int i = 0; i < liczba_znakow; i++) {
            symbole_int[i] = symbole_char[i];
        }
        for (int i = liczba_znakow - 1; i > 0; i--) {
            int index_max = 0;
            for (int j = 1; j <= i; j++) {
                if (symbole_int[j] > symbole_int[index_max]) {
                    index_max = j;
                }
            }
            int temp = symbole_int[i];
            symbole_int[i] = symbole_int[index_max];
            symbole_int[index_max] = temp;
        }
        int liczba_powtorzen = 1;
        if (symbole_int[0] > 10) {
            System.out.println("10 " + liczba_wczytanych_linii);
        }
        for (int i = 0; i < liczba_znakow; i++) {
            if (i == liczba_znakow - 1) {
                System.out.println(symbole_int[i] + " " + liczba_powtorzen);
            } else if (symbole_int[i + 1] == symbole_int[i]) {
                liczba_powtorzen++;
            } else {
                System.out.println(symbole_int[i] + " " + liczba_powtorzen);
                if (symbole_int[i] < 10 && symbole_int[i + 1] > 10) {
                    System.out.println("10 " + liczba_wczytanych_linii);
                }
                liczba_powtorzen = 1;
            }
        }
    }
}