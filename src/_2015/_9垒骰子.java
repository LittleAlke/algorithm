package _2015;

import java.util.Scanner;

/**
 * :赌圣atm晚年迷恋上了垒骰子，就是把骰子一个垒在另一个上边，不能歪歪扭扭，要垒成方柱体。
 * 经过长期观察，atm 发现了稳定骰子的奥秘：有些数字的面贴着会互相排斥！
 * 我们先来规范一下骰子：1 的对面是 4，2 的对面是 5，3 的对面是 6。
 * 假设有 m 组互斥现象，每组中的那两个数字的面紧贴在一起，骰子就不能稳定的垒起来。 atm想计算一下有多少种不同的可能的垒骰子方式。
 * 两种垒骰子方式相同，当且仅当这两种方式中对应高度的骰子的对应数字的朝向都相同。
 * 由于方案数可能过多，请输出模 10^9 + 7 的结果。
 * <p>
 * 不要小看了 atm 的骰子数量哦～
 * <p>
 * 「输入格式」
 * 第一行两个整数 n m
 * n表示骰子数目
 * 接下来 m 行，每行两个整数 a b ，表示 a 和 b 不能紧贴在一起。
 * <p>
 * 「输出格式」
 * 一行一个数，表示答案模 10^9 + 7 的结果。
 * <p>
 * 「样例输入」
 * 2 1
 * 1 2
 * <p>
 * 「样例输出」
 * 544
 * <p>
 * 「数据范围」
 * 对于 30% 的数据：n <= 5
 * 对于 60% 的数据：n <= 100
 * 对于 100% 的数据：0 < n <= 10^9, m <= 36
 * <p>
 * <p>
 * 资源约定：
 * 峰值内存消耗（含虚拟机） < 256M
 * CPU消耗  < 2000ms
 * Alke
 * 2020-10-11 16:15
 */
public class _9垒骰子 {
    static final int mod = (int) (Math.pow(10, 9) + 7);
    static boolean[][] conflict = new boolean[7][7];
    static int n, m, sum = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for (int i = 1; i <= m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            conflict[x][y] = true;
            conflict[y][x] = true;
        }
        f(1, 0);
        System.out.println(sum);


    }

    private static void f(int number, int before) {//骰子数量   前一个骰子下面的数字
        if (number > n) {
            sum += (int) Math.pow(4, n);
            sum = sum % mod;
            return;
        }
        for (int i = 1; i < 7; i++) {
            if (conflict[op(i)][before] || conflict[before][op(i)]) {
                continue;
            }
            f(number + 1, i);


        }
    }

    public static int op(int a) {
        switch (a) {
            case 1:
                return 4;
            case 2:
                return 5;
            case 3:
                return 6;
            case 4:
                return 1;
            case 5:
                return 2;
            case 6:
                return 3;
        }
        return 0;
    }
}
