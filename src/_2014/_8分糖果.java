package _2014;


import java.util.Scanner;

/**
 * :有n个小朋友围坐成一圈。老师给每个小朋友随机发偶数个糖果，然后进行下面的游戏：
 * <p>
 * 每个小朋友都把自己的糖果分一半给左手边的孩子。
 * <p>
 * 一轮分糖后，拥有奇数颗糖的孩子由老师补给1个糖果，从而变成偶数。
 * <p>
 * 反复进行这个游戏，直到所有小朋友的糖果数都相同为止。
 * <p>
 * 你的任务是预测在已知的初始糖果情形下，老师一共需要补发多少个糖果。
 * <p>
 * 【格式要求】
 * <p>
 * 程序首先读入一个整数N(2<N<100)，表示小朋友的人数。
 * 接着是一行用空格分开的N个偶数（每个偶数不大于1000，不小于2）
 * 要求程序输出一个整数，表示老师需要补发的糖果数。
 * <p>
 * 例如：输入
 * 3
 * 2 2 4
 * 程序应该输出：
 * 4
 * <p>
 * 资源约定：
 * 峰值内存消耗（含虚拟机） < 256M
 * CPU消耗  < 1000ms
 * Alke
 * 2020-10-07 20:46
 */
public class _8分糖果 {
    static int ans = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        while (!check(arr)) {
            int give = arr[arr.length - 1] / 2;
            for (int i = 0; i < arr.length; i++) {
                int t = arr[i] / 2;
                arr[i] = t + give;
                give = t;
                if (arr[i] % 2 != 0) {
                    arr[i] += 1;
                    ans++;
                }
            }
        }
        System.out.println(ans);

    }

    public static boolean check(int a[]) {
        boolean b = true;
        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i - 1]) {
                b = false;
                break;
            }
        }
        return b;
    }
}
