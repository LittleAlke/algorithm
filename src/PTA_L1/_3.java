package PTA_L1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * :
 * Alke
 * 2020-11-06 23:12
 */
public class _3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char cs[] = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : cs) {
            if (map.get(c) == null) {
                map.put(c, 1);
            } else {
                int a = map.get(c);
                a++;
                map.put(c, a);
            }
        }
        Set<Map.Entry<Character, Integer>> set = map.entrySet();
        for (Map.Entry entry : set) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
