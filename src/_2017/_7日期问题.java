package _2017;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * :小明正在整理一批历史文献。这些历史文献中出现了很多日期。小明知道这些日期都在1960年1月1日至2059年12月31日。
 * 令小明头疼的是，这些日期采用的格式非常不统一，有采用年/月/日的，有采用月/日/年的，还有采用日/月/年的。
 * 更加麻烦的是，年份也都省略了前两位，使得文献上的一个日期，存在很多可能的日期与其对应。
 * <p>
 * 比如02/03/04，可能是2002年03月04日、2004年02月03日或2004年03月02日。
 * <p>
 * 给出一个文献上的日期，你能帮助小明判断有哪些可能的日期对其对应吗？
 * <p>
 * 输入
 * ----
 * 一个日期，格式是"AA/BB/CC"。  (0 <= A, B, C <= 9)
 * <p>
 * 输入
 * ----
 * 输出若干个不相同的日期，每个日期一行，格式是"yyyy-MM-dd"。多个日期按从早到晚排列。
 * <p>
 * 样例输入
 * ----
 * 02/03/04
 * <p>
 * 样例输出
 * ----
 * 2002-03-04
 * 2004-02-03
 * 2004-03-02
 * <p>
 * 资源约定：
 * 峰值内存消耗（含虚拟机） < 256M
 * CPU消耗  < 1000ms
 * Alke
 * 2020-10-16 13:52
 */
public class _7日期问题 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String aa = s.substring(0, 2);
        String bb = s.substring(3, 5);
        String cc = s.substring(6);
        String[] date = new String[3];
        int[] d = new int[3];
        date[0] = aa + "-" + bb + "-" + cc;//年月日
        date[1] = cc + "-" + aa + "-" + bb;//月日年
        date[2] = cc + "-" + bb + "-" + aa;//日月年
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            if (check(date[i]))
                d[i] = Integer.valueOf(change(date[i]));
        }
        Arrays.sort(d);
        for (int i : d) {
            if (i == 0) continue;
            System.out.println(change(i + ""));
        }


    }

    private static String change(String s) {
        if (s.length() == 8) {
            return s.substring(0, 2) + "" + s.substring(3, 5) + "" + s.substring(6);
        } else if (s.length() == 6) {
            return s.substring(0, 2) + "-" + s.substring(2, 4) + "-" + s.substring(4);
        } else return null;
    }

    private static boolean check(String s) {
        int year = Integer.valueOf(s.substring(0, 2));
        int month = Integer.valueOf(s.substring(3, 5));
        int day = Integer.valueOf(s.substring(6));
        if (month < 1 || month > 12 || day > 31 || day < 1) return false;
        if (month == 2) {
            if (year == 00 || year % 4 == 0) {
                if (day > 29) return false;
            } else {
                if (day > 28) return false;
            }
        } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            if (day > 31) return false;
        } else {
            if (day > 30) return false;
        }
        return true;
    }
}
