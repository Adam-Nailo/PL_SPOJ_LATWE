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
        int godzina, minuta;
        for (int i = 0; i < n; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), ":");
            godzina = Integer.parseInt(stringTokenizer.nextToken());
            minuta = Integer.parseInt(stringTokenizer.nextToken());
            if (godzina == 0 && minuta < 9) {
                System.out.println("00:0" + (minuta + 1));
            } else if (godzina == 0 && minuta < 11) {
                System.out.println("00:11");
            } else if (godzina == 0 && minuta < 22) {
                System.out.println("00:22");
            } else if (godzina == 0 && minuta < 33) {
                System.out.println("00:33");
            } else if (godzina == 0 && minuta < 44) {
                System.out.println("00:44");
            } else if (godzina == 0 && minuta < 55) {
                System.out.println("00:55");
            } else if (godzina == 0 || (godzina == 1 && minuta < 1)) {
                System.out.println("01:01");
            } else if (godzina == 1 && minuta < 11) {
                System.out.println("01:11");
            } else if (godzina == 1 && minuta < 21) {
                System.out.println("01:21");
            } else if (godzina == 1 && minuta < 31) {
                System.out.println("01:31");
            } else if (godzina == 1 && minuta < 41) {
                System.out.println("01:41");
            } else if (godzina == 1 && minuta < 51) {
                System.out.println("01:51");
            } else if (godzina == 1 || (godzina == 2 && minuta < 2)) {
                System.out.println("02:02");
            } else if (godzina == 2 && minuta < 12) {
                System.out.println("02:12");
            } else if (godzina == 2 && minuta < 22) {
                System.out.println("02:22");
            } else if (godzina == 2 && minuta < 32) {
                System.out.println("02:32");
            } else if (godzina == 2 && minuta < 42) {
                System.out.println("02:42");
            } else if (godzina == 2 && minuta < 52) {
                System.out.println("02:52");
            } else if (godzina == 2 || (godzina == 3 && minuta < 3)) {
                System.out.println("03:03");
            } else if (godzina == 3 && minuta < 13) {
                System.out.println("03:13");
            } else if (godzina == 3 && minuta < 23) {
                System.out.println("03:23");
            } else if (godzina == 3 && minuta < 33) {
                System.out.println("03:33");
            } else if (godzina == 3 && minuta < 43) {
                System.out.println("03:43");
            } else if (godzina == 3 && minuta < 53) {
                System.out.println("03:53");
            } else if (godzina == 3 || (godzina == 4 && minuta < 4)) {
                System.out.println("04:04");
            } else if (godzina == 4 && minuta < 14) {
                System.out.println("04:14");
            } else if (godzina == 4 && minuta < 24) {
                System.out.println("04:24");
            } else if (godzina == 4 && minuta < 34) {
                System.out.println("04:34");
            } else if (godzina == 4 && minuta < 44) {
                System.out.println("04:44");
            } else if (godzina == 4 && minuta < 54) {
                System.out.println("04:54");
            } else if (godzina == 4 || (godzina == 5 && minuta < 5)) {
                System.out.println("05:05");
            } else if (godzina == 5 && minuta < 15) {
                System.out.println("05:15");
            } else if (godzina == 5 && minuta < 25) {
                System.out.println("05:25");
            } else if (godzina == 5 && minuta < 35) {
                System.out.println("05:35");
            } else if (godzina == 5 && minuta < 45) {
                System.out.println("05:45");
            } else if (godzina == 5 && minuta < 55) {
                System.out.println("05:55");
            } else if (godzina == 5 || (godzina == 6 && minuta < 6)) {
                System.out.println("06:06");
            } else if (godzina == 6 && minuta < 16) {
                System.out.println("06:16");
            } else if (godzina == 6 && minuta < 26) {
                System.out.println("06:26");
            } else if (godzina == 6 && minuta < 36) {
                System.out.println("06:36");
            } else if (godzina == 6 && minuta < 46) {
                System.out.println("06:46");
            } else if (godzina == 6 && minuta < 56) {
                System.out.println("06:56");
            } else if (godzina == 6 || (godzina == 7 && minuta < 7)) {
                System.out.println("07:07");
            } else if (godzina == 7 && minuta < 17) {
                System.out.println("07:17");
            } else if (godzina == 7 && minuta < 27) {
                System.out.println("07:27");
            } else if (godzina == 7 && minuta < 37) {
                System.out.println("07:37");
            } else if (godzina == 7 && minuta < 47) {
                System.out.println("07:47");
            } else if (godzina == 7 && minuta < 57) {
                System.out.println("07:57");
            } else if (godzina == 7 || (godzina == 8 && minuta < 8)) {
                System.out.println("08:08");
            } else if (godzina == 8 && minuta < 18) {
                System.out.println("08:18");
            } else if (godzina == 8 && minuta < 28) {
                System.out.println("08:28");
            } else if (godzina == 8 && minuta < 38) {
                System.out.println("08:38");
            } else if (godzina == 8 && minuta < 48) {
                System.out.println("08:48");
            } else if (godzina == 8 && minuta < 58) {
                System.out.println("08:58");
            } else if (godzina == 8 || (godzina == 9 && minuta < 9)) {
                System.out.println("09:09");
            } else if (godzina == 9 && minuta < 19) {
                System.out.println("09:19");
            } else if (godzina == 9 && minuta < 29) {
                System.out.println("09:29");
            } else if (godzina == 9 && minuta < 39) {
                System.out.println("09:39");
            } else if (godzina == 9 && minuta < 49) {
                System.out.println("09:49");
            } else if (godzina == 9 && minuta < 59) {
                System.out.println("09:59");
            } else if (godzina == 9 || (godzina == 10 && minuta < 1)) {
                System.out.println("10:01");
            } else if (godzina == 10 || (godzina == 11 && minuta < 11)) {
                System.out.println("11:11");
            } else if (godzina == 11 || (godzina == 12 && minuta < 21)) {
                System.out.println("12:21");
            } else if (godzina == 12 || (godzina == 13 && minuta < 31)) {
                System.out.println("13:31");
            } else if (godzina == 13 || (godzina == 14 && minuta < 41)) {
                System.out.println("14:41");
            } else if (godzina == 14 || (godzina == 15 && minuta < 51)) {
                System.out.println("15:51");
            } else if (godzina == 15 || godzina == 16 || godzina == 17 || godzina == 18 || godzina == 19 || (godzina == 20 && minuta < 2)) {
                System.out.println("20:02");
            } else if (godzina == 20 || (godzina == 21 && minuta < 12)) {
                System.out.println("21:12");
            } else if (godzina == 21 || (godzina == 22 && minuta < 22)) {
                System.out.println("22:22");
            } else if (godzina == 22 || (godzina == 23 && minuta < 32)) {
                System.out.println("23:32");
            } else if (godzina == 23) {
                System.out.println("00:00");
            }
        }
    }
}