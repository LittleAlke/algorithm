package PTA_L1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * :
 * Alke
 * 2020-11-18 11:13
 */
public class _23 {
    public static void main(String[] args) throws IOException {
        int g = 0, p = 0, l = 0, t = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] cs = reader.readLine().toCharArray();
        for (char c : cs) {
            if (c == 'g' || c == 'G') g++;
            else if (c == 'p' || c == 'P') p++;
            else if (c == 'l' || c == 'L') l++;
            else if (c == 't' || c == 'T') t++;
        }
        while (g + p + l + t != 0) {
            if (g != 0) {
                System.out.print('G');
                g--;
            }
            if (p != 0) {
                System.out.print('P');
                p--;
            }
            if (l != 0) {
                System.out.print('L');
                l--;
            }
            if (t != 0) {
                System.out.print('T');
                t--;
            }
        }

    }
}
