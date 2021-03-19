package PTA_L1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * :
 * Alke
 * 2020-11-07 11:16
 */
public class _6 {
    public static void main(String[] args) throws IOException {
        long maxLength = 0; //数据类型long     2,147,483,648
        long start = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(reader.readLine());
        for (int i = 2; i <= Math.sqrt(n); i++) { //截断点求根号
            long mul = 1;
            for (int j = i; mul * i <= n; j++) {
                mul *= j;
                if (n % mul == 0 && j - i + 1 > maxLength) {
                    start = i;
                    maxLength = j - i + 1;
                }
            }
        }
        if (start == 0) {
            start = n;
            maxLength = 1;
        }
        System.out.println(maxLength);
        String s = start + "";
        for (long i = start + 1; i < start + maxLength; i++) {
            s += "*" + i;
        }
        System.out.println(s);
    }
}
