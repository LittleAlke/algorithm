package work.alibaba;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 牛牛找牛妹，错误，每只牛手机里的通讯录人数不止一个
 * Alke
 * 2021-03-12 19:40
 */
public class t1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            map.put(sc.nextInt(),sc.nextInt());
        }
        int q = sc.nextInt();
        int mQ[][] = new int[q][2];
        for (int i = 0; i < q; i++) {
            mQ[i][0] = sc.nextInt();
            mQ[i][1] = sc.nextInt();
        }
        for (int i = 0; i < mQ.length; i++) {
            int niu = mQ[i][0];
            int mei = mQ[i][1];
            if (map.get(niu)==null){
                System.out.println(-1);
                continue;
            }
            int c = map.get(niu);
            int ci = 1;
            while (true){
                if (map.get(c)==null){
                    System.out.println(-1);
                    break;
                }
                if (map.get(c).equals(mei)){
                    System.out.println(ci+1);
                    break;
                }
                c = map.get(c);
                if (ci>=m+1){
                    System.out.println(-1);
                    break;
                }
                ci++;
            }
        }
    }
}
