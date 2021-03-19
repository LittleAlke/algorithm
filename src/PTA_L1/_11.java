package PTA_L1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * :
 * Alke
 * 2020-11-07 22:31
 */
public class _11 {
    public static void main(String[] args) throws IOException {
        int book[] = new int[256];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char a[] = reader.readLine().toCharArray();
        char b[] = reader.readLine().toCharArray();
        for (int i = 0; i < b.length; i++) {
            book[b[i]] = 1;
        }
        for (int i = 0; i < a.length; i++) {
            if (book[a[i]] == 1) continue;
            System.out.print(a[i]);
        }
//        Map<Character,Boolean> map = new HashMap<>();
//        char[] a = reader.readLine().toCharArray();
//        char[] b = reader.readLine().toCharArray();
//        for (char c:b){
//            map.put(c,true);
//        }
//
//        for (char c:a){
//            if (map.get(c)!=null)
//                continue;
//            else
//                System.out.print(c);
//        }
    }
}
