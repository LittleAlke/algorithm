package PTA_L1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * :
 * Alke
 * 2020-11-15 11:07
 */
public class _20 {
    static Set<String> rSUM = new HashSet<>();//朋友圈的所有人
    static Set<String> rONE = new HashSet<>();//只有一个人在朋友圈的人
    static List<String> rN = new ArrayList();//待输出的没有朋友的人（带重复元素）
    static Set<String> rS = new HashSet<>();//记录已经输出的没有朋友的人（避免重复输出）

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int qN = Integer.parseInt(reader.readLine());//朋友圈的数量
        for (int i = 0; i < qN; i++) {
            String[] s = reader.readLine().split(" +");
            int rN = Integer.parseInt(s[0]);//朋友圈人数
            if (rN == 1) rONE.add(s[1]);
            for (int j = 1; j <= rN; j++) {
                rSUM.add(s[j]);
            }
        }
        int cN = Integer.parseInt(reader.readLine());//待查人数
        String[] cR = reader.readLine().split(" +");//待查的人
        for (int i = 0; i < cN; i++) {
            String c = cR[i];
            if (rSUM.contains(c)) {//在朋友圈
                if (rONE.contains(c))//朋友圈只有他一个人
                    rN.add(c);
            } else {//没有朋友圈
                rN.add(c);
            }
        }
        if (rN.size() == 0) {
            System.out.println("No one is handsome");
        } else {
            for (int i = 0; i < rN.size(); i++) {
                String s = rN.get(i);
                if (rS.contains(s)) {//已经输出过了
                    continue;
                } else {
                    if (i != 0) System.out.print(" ");
                    System.out.print(rN.get(i));
                    rS.add(s);
                }
            }
            System.out.println();
        }

    }
}
