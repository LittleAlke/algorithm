package PTA_L1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * :
 * Alke
 * 2020-11-07 18:11
 */
public class _9 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(reader.readLine());
        String[] strs = reader.readLine().split(" ");
        String he = strs[0];
        for (int i = 1; i < strs.length; i++) {
            he = jisuan(he, strs[i]);
        }
        String[] sum = he.split("/");
        long zi = Long.valueOf(sum[0]);
        long mu = Long.valueOf(sum[1]);
        String end = "";
        if (zi == 0 || zi == -0) {
            System.out.println(0);
        } else if (zi > mu) {
            if (zi % mu == 0)
                System.out.println(end + zi / mu);
            else
                System.out.println(end + zi / mu + " " + zi % mu + "/" + mu);
        } else if (zi == mu) {
            System.out.println("1");
        } else if (zi < mu && zi > 0) {
            System.out.println(zi + "/" + mu);
        } else if (zi < mu && zi < 0) {
            if (Math.abs(zi) > mu) {
                if (Math.abs(zi) % mu == 0)
                    System.out.println("-" + end + Math.abs(zi) / mu);
                else
                    System.out.println(end + zi / mu + " " + Math.abs(zi) % mu + "/" + mu);
            } else {
                System.out.println(zi + "/" + mu);
            }

        }
    }

    public static String jisuan(String s1, String s2) {
        String[] ss1 = s1.split("/");
        String[] ss2 = s2.split("/");
        long z1 = Integer.valueOf(ss1[0]);
        long m1 = Integer.valueOf(ss1[1]);
        long z2 = Integer.valueOf(ss2[0]);
        long m2 = Integer.valueOf(ss2[1]);
        long z = z1 * m2 + z2 * m1;
        long m = m1 * m2;
        long g = gcd(z, m);
        return z / g + "/" + m / g;
    }

    public static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

}
