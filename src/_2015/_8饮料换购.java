package _2015;

import java.util.Scanner;

/**
 * :乐羊羊饮料厂正在举办一次促销优惠活动。乐羊羊C型饮料，凭3个瓶盖可以再换一瓶C型饮料，并且可以一直循环下去，但不允许赊账。
 * <p>
 * 请你计算一下，如果小明不浪费瓶盖，尽量地参加活动，那么，对于他初始买入的n瓶饮料，最后他一共能得到多少瓶饮料。
 * <p>
 * 输入：一个整数n，表示开始购买的饮料数量（0<n<10000）
 * 输出：一个整数，表示实际得到的饮料数
 * <p>
 * 例如：
 * 用户输入：
 * 100
 * 程序应该输出：
 * 149
 * <p>
 * 用户输入：
 * 101
 * 程序应该输出：
 * 151
 * <p>
 * <p>
 * 资源约定：
 * 峰值内存消耗（含虚拟机） < 256M
 * CPU消耗  < 1000ms
 * Alke
 * 2020-10-11 16:07
 */
public class _8饮料换购 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = n;
        while (n >= 3) {
            sum += n / 3;
            n = n / 3 + n % 3;
        }
        System.out.println(sum);
    }
}
