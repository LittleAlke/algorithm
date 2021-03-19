package FirstWeek;

import java.util.Scanner;

/**
 * :
 * Alke
 * 2020-11-08 16:28
 */
public class _5 {
    static String[][] tree;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        tree = new String[n][n];
        String zhong = sc.next();
        String qian = sc.next();
        String[] zhongC = zhong.split(" ");
        String[] qianC = qian.split(" ");

    }

    public void bulid(String[] qian, String[] zhong, int index) {

        String root = qian[0];
        String[] newZhong1 = new String[zhong.length];
        String[] newZhong2 = new String[zhong.length];
        int newQianLen = -1;
        for (int i = 0; i < zhong.length; i++) {
            if (newQianLen == -1) newZhong1[i] = zhong[i];
            if (zhong[i].equals(root)) {
                newQianLen = i;
            }
            if (newQianLen != -1) newZhong2[i] = zhong[i];
        }
        if (newQianLen == -1) return;
        String[] newQ1 = new String[qian.length];
        String[] newQ2 = new String[qian.length];
        for (int i = 1; i <= newQianLen; i++) {
            newQ1[i] = qian[i];
        }
        for (int i = newQianLen + 1; i < qian.length; i++) {
            newQ2[i] = qian[i];
        }

        bulid(newQ1, newZhong1, index++);
    }
}
