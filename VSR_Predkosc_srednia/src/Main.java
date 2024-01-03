import java.util.*;
import java.lang.*;
import java.io.*;

class Parser {
    byte[] buffer;

    int offs = 0;

    public Parser(int len) throws java.lang.Exception {
        System.in.read(buffer = new byte[len]);
    }

    int readInt() {
        int result = 0;

        while (buffer[offs] <= ' ') {
            ++offs;
        }

        int c;

        while ((c = buffer[offs++]) > ' ') {
            result = (result << 3) + (result << 1) + (c - '0');
        }

        return result;
    }
}

class Main {

    public static void main(String[] args) throws java.lang.Exception {
        Parser in = new Parser(10001 * 10);

        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int t = in.readInt();

        while (t-- != 0) {
            int v1 = in.readInt();

            int v2 = in.readInt();

            out.println(2 * v1 * v2 / (v1 + v2));
        }

        out.flush();
    }
}