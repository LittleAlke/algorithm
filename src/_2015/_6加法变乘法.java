package _2015;

/**
 * :我们都知道：1+2+3+ ... + 49 = 1225
 * 现在要求你把其中两个不相邻的加号变成乘号，使得结果为2015
 * <p>
 * 比如：
 * 1+2+3+...+10*11+12+...+27*28+29+...+49 = 2015
 * 就是符合要求的答案。
 * <p>
 * 请你寻找另外一个可能的答案，并把位置靠前的那个乘号左边的数字提交（对于示例，就是提交10）。
 * <p>
 * 注意：需要你提交的是一个整数，不要填写任何多余的内容。
 * Alke
 * 2020-10-11 11:06
 */
public class _6加法变乘法 {
    static int[] a;

    public static void main(String[] args) {
        a = new int[49];
        for (int i = 1; i < 50; i++) {
            a[i - 1] = i;
        }
        for (int i = 1; i < 49; i++) {
            for (int j = i + 2; j < 49; j++) {
                f(i, j);
            }
        }
    }

    private static void f(int i, int j) {
        int sum = a[0];
        for (int k = 1; k < 49; k++) {
            if (k != i && k != j) {
                sum += a[k];
            } else {
                sum -= a[k - 1];
                if (i != 1)
                    sum += a[k - 1] * a[k];
                else
                    sum *= a[k];
            }
        }
        if (sum == 2015) System.out.println(i + " " + j);
    }
}
