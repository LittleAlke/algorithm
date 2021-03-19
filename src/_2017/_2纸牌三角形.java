package _2017;

/**
 * :A,2,3,4,5,6,7,8,9 共9张纸牌排成一个正三角形（A按1计算）。要求每个边的和相等。
 * 下图就是一种排法（如有对齐问题，参看p1.png）。
 * <p>
 * A
 * 9 6
 * 4   8
 * 3 7 5 2
 * <p>
 * 这样的排法可能会有很多。
 * <p>
 * 如果考虑旋转、镜像后相同的算同一种，一共有多少种不同的排法呢？
 * <p>
 * 请你计算并提交该数字。
 * <p>
 * 注意：需要提交的是一个整数，不要提交任何多余内容。
 * Alke
 * 2020-10-15 22:09
 */
public class _2纸牌三角形 {
    static int sum = 0;

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        f(a, 0);
        System.out.println(sum / 6);
    }

    private static void f(int[] a, int k) {
        if (k == a.length) {
            int a1 = 0, a2 = 0, a3 = 0;
            for (int i = 0; i < 4; i++) {
                a1 += a[i];
                a2 += a[i + 3];
                if (i + 6 < 9)
                    a3 += a[i + 6];
            }
            if (a1 == a2 && a2 == a3 + a[0]) sum++;
        }
        for (int i = k; i < a.length; i++) {
            int t = a[i];
            a[i] = a[k];
            a[k] = t;
            f(a, k + 1);
            t = a[i];
            a[i] = a[k];
            a[k] = t;
        }
    }
}
