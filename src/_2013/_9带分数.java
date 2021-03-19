package _2013;

import java.util.Scanner;

/**
 * :100 可以表示为带分数的形式：100 = 3 + 69258 / 714
 * <p>
 * 还可以表示为：100 = 82 + 3546 / 197
 * <p>
 * 注意特征：带分数中，数字1~9分别出现且只出现一次（不包含0）。
 * <p>
 * 类似这样的带分数，100 有 11 种表示法。
 * <p>
 * 题目要求：
 * 从标准输入读入一个正整数N (N<1000*1000)
 * 程序输出该数字用数码1~9不重复不遗漏地组成带分数表示的全部种数。
 * 注意：不要求输出每个表示，只统计有多少表示法！
 * <p>
 * <p>
 * 例如：
 * 用户输入：
 * 100
 * 程序输出：
 * 11
 * <p>
 * 再例如：
 * 用户输入：
 * 105
 * 程序输出：
 * 6
 * <p>
 * <p>
 * 资源约定：
 * 峰值内存消耗（含虚拟机） < 64M
 * CPU消耗  < 3000ms
 * Alke
 * 2020-10-03 12:26
 */
public class _9带分数 {
    static int n, sum = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        f(arr, 0);
        System.out.println(sum);
    }

    private static void f(int[] arr, int k) {
        if (k == arr.length) {
            check(arr);

        }
        for (int i = k; i < arr.length; i++) {
            int t = arr[i];
            arr[i] = arr[k];
            arr[k] = t;

            f(arr, k + 1);

            t = arr[i];
            arr[i] = arr[k];
            arr[k] = t;

        }
    }

    public static void check(int arr[]) {
        for (int j = 1; j <= 7; j++) {//加号
            int jia = toNumber(arr, 0, j - 1);
            if (jia >= n)
                continue;
            for (int c = 8; c - j >= 9 - c; c--) {//减号
                int beichu = toNumber(arr, j, c - 1);
                int chu = toNumber(arr, c, 8);
                if (beichu % chu == 0 && n == beichu / chu + jia)
                    sum++;
            }
        }

    }

    private static int toNumber(int[] arr, int a, int b) {
        int number = 0;
        int bei = 1;
        for (int w = b; w >= a; w--) {
            number += arr[w] * bei;
            bei *= 10;
        }
        return number;
    }

}
