package Ten;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 腾讯第一轮面试题
 * 找到字符串的最长无重复字符子串
 * 给定一个数组arr，返回arr的最长无重复子串的长度(无重复指的是所有字母都不相同)。
 * 输入描述
 * 输入包含两行，第一行包含一个整数n（1 \leq n \leq 10^5)（1≤n≤10
 * 5
 *  )，代表数组arr的长度,第二行包含n个整数，代表数组arr（ 1 \leq arr[i] \leq 10^6 ）（1≤arr[i]≤10
 * 6
 *  ）。
 * 输出描述
 * 输出一个整数，代表arr的最长无重复字符的长度。
 * 示例1
 * 输入
 * 4
 * 2 3 4 5
 * 输出
 * 4
 * 示例2
 * 输入
 * 5
 * 2 2 3 4 3
 * 输出
 * 3
 */
public class One {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int max = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (map.get(a)==null){
                map.put(a,i);
                ++sum;
            }else {
                sum = i- map.get(a);
            }
            max = Math.max(sum,max);
        }
        System.out.println(max);

    }

}
