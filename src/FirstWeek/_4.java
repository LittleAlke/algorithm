package FirstWeek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * :
 * Alke
 * 2020-11-08 14:48
 */
public class _4 {
    static Map<String, Integer> sum = new HashMap<>();

    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int quanNumber = Integer.parseInt(reader.readLine());
        String ansS = "";
        for (int i = 0; i < quanNumber; i++) {
            String[] ss = reader.readLine().split(" ");
            if (ss.length == 2) {
                list.add(ss[1]);
            }
            for (int j = 1; j < ss.length; j++) {
                sum.put(ss[j], 1);
            }
        }
        int chaNumber = Integer.parseInt(reader.readLine());
        String[] check = reader.readLine().split(" ");
        boolean no = true;
        for (int i = 0; i < check.length; i++) {
            if (sum.get(check[i]) == null) {
                list.add(check[i]);
                no = false;
            }
        }
        if (no) {
            System.out.println("No one is handsome");
        } else {
            Map<String, Integer> hondsome = new HashMap<>();
            for (String s : list) {
                if (hondsome.get(s) == null) {
                    ansS += " " + s;
                    hondsome.put(s, 1);
                }
            }
            System.out.println(ansS.trim());
        }

    }
}
