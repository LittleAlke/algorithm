package PTA_L1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * :
 * Alke
 * 2020-11-20 22:55
 */
public class _30 {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> map = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] nan = new String[n / 2];
        int i1 = 0;
        String[] nv = new String[n / 2];
        int i2 = 0;
        List<String> list = new ArrayList<>();
        List<String> sex = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] ss = reader.readLine().split(" +");
            if (i < n / 2) {
                list.add(ss[1]);
                sex.add(ss[0]);
            }
            if (Integer.parseInt(ss[0]) == 1) {
                map.put(ss[1], i1);
                nan[i1] = ss[1];
                i1++;
            } else {
                map.put(ss[1], i2);
                nv[i2] = ss[1];
                i2++;
            }
        }


        for (int i = 0; i < n / 2; i++) {
            String s1 = list.get(i);
            if (sex.get(i).equals("1")) {
                System.out.println(s1 + " " + nv[n / 2 - 1 - map.get(s1)]);

            } else {
                System.out.println(s1 + " " + nan[n / 2 - 1 - map.get(s1)]);

            }
        }
    }
}
