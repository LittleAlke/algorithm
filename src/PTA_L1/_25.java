package PTA_L1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * :
 * Alke
 * 2020-11-18 11:37
 */
public class _25 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] ss = reader.readLine().split(" ");
        String a = ss[0];
        String b = "";
        for (int i = 1; i < ss.length; i++) {
            b += ss[i];
        }
        if (check(a).equals("?") || check(b).equals("?")) {
            System.out.println(check(a) + " + " + check(b) + " = " + "?");
        } else {
            System.out.println(a + " + " + b + " = " + (Integer.parseInt(a) + Integer.parseInt(b)));
        }
    }

    private static String check(String a) {
        try {
            int n = Integer.parseInt(a);
            if (n >= 1 && n <= 1000) return a;
            else return "?";
        } catch (Exception e) {
            return "?";
        }
    }
}
