package PTA_L1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * :
 * Alke
 * 2020-11-20 21:08
 */
public class _28 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(reader.readLine());
            if (a == 1) {
                list.add("No");
                continue;
            }
            boolean su = true;
            for (int j = 2; j <= Math.sqrt(a); j++) {
                if (a % j == 0) {
                    su = false;
                    list.add("No");
                    break;
                }
            }
            if (su) list.add("Yes");
        }
        for (String s : list) System.out.println(s);

    }
}
