package PTA_L1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * :
 * Alke
 * 2020-11-07 17:15
 */
public class _7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] c = reader.readLine().toCharArray();
        Map<String, String> map = new HashMap<>();
        map.put("-", "fu");
        map.put("0", "ling");
        map.put("1", "yi");
        map.put("2", "er");
        map.put("3", "san");
        map.put("4", "si");
        map.put("5", "wu");
        map.put("6", "liu");
        map.put("7", "qi");
        map.put("8", "ba");
        map.put("9", "jiu");
        System.out.print(map.get(c[0] + ""));
        for (int i = 1; i < c.length; i++) {
            System.out.print(" " + map.get(c[i] + ""));
        }
    }
}
