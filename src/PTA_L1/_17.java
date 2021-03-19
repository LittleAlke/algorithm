package PTA_L1;

import java.util.Scanner;

/**
 * :
 * Alke
 * 2020-11-08 13:20
 */
public class _17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] cs = s.toCharArray();
        double n2 = 0;
        for (char c : cs)
            if (c == '2') n2++;
        double wei = cs[0] == '-' ? s.length() - 1 : s.length();
        double ans = n2 / wei;
        if (cs[0] == '-') ans *= 1.5;
        if (Integer.valueOf(cs[cs.length - 1] + "") % 2 == 0) ans *= 2;
        System.out.println(String.format("%.2f", ans * 100) + "%");
    }
}
