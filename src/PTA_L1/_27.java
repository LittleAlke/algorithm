package PTA_L1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * :
 * Alke
 * 2020-11-20 17:22
 */
public class _27 {
    public static void main(String[] args) throws IOException {
        TreeSet<Integer> set = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int[] a = new int[11];
        for (int i = 0; i < s.length(); i++) {
            int n = Integer.parseInt(s.substring(i, i + 1));
            a[i] = n;
            set.add(n);
        }
        int[] ans = new int[11];
        for (int i = 0; i < a.length; i++) {
            int index = 0;
            for (int n : set) {
                if (n == a[i]) {
                    ans[i] = index;
                    break;
                }
                index++;
            }
        }
        System.out.print("int[] arr = new int[]{");
        int index = 0;
        for (int n : set) {
            System.out.print(n);
            if (index != set.size() - 1) System.out.print(",");
            index++;
        }
        System.out.println("};");

        System.out.print("int[] index = new int[]{");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);
            if (i != ans.length - 1) System.out.print(",");
        }
        System.out.println("};");

    }
}
