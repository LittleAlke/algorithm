package _2014;

import java.util.HashSet;
import java.util.Set;

/**
 * : A A 2 2 3 3 4 4， 一共4对扑克牌。请你把它们排成一行。
 * 要求：两个A中间有1张牌，两个2之间有2张牌，两个3之间有3张牌，两个4之间有4张牌。
 * <p>
 * 请填写出所有符合要求的排列中，字典序最小的那个。
 * <p>
 * 例如：22AA3344 比 A2A23344 字典序小。当然，它们都不是满足要求的答案。
 * <p>
 * <p>
 * 请通过浏览器提交答案。“A”一定不要用小写字母a，也不要用“1”代替。字符间一定不要留空格。
 * Alke
 * 2020-10-07 13:03
 */
public class _7扑克排序 {
    static Set<String> set;

    public static void main(String[] args) {
        char[] arr = {'A', 'A', '2', '2', '3', '3', '4', '4'};
        set = new HashSet<>();
        f(arr, 0);
        for (String ss : set)
            System.out.println(ss);
    }

    private static void f(char[] arr, int k) {
        if (k == arr.length) {
            String s = "";
            for (char i : arr)
                s += i;
//            System.out.println(s);
            int a1 = s.indexOf("A");
            int a11 = s.lastIndexOf("A");
            int a2 = s.indexOf("2");
            int a22 = s.lastIndexOf("2");
            int a3 = s.indexOf("3");
            int a33 = s.lastIndexOf("3");
            int a4 = s.indexOf("4");
            int a44 = s.lastIndexOf("4");
            if (a11 - a1 == 2 && a22 - a2 == 3 & a33 - a3 == 4 && a44 - a4 == 5) {
//                System.out.println(s);
                set.add(s);
            }
        }
        for (int i = k; i < arr.length; i++) {
            char t = arr[k];
            arr[k] = arr[i];
            arr[i] = t;

            f(arr, k + 1);

            t = arr[k];
            arr[k] = arr[i];
            arr[i] = t;
        }
    }

}
