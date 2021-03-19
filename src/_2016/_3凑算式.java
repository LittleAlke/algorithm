package _2016;

/**
 * :
 * B      DEF
 * A + --- + ------- = 10
 * C      GHI
 * <p>
 * （如果显示有问题，可以参见【图1.jpg】）
 * <p>
 * <p>
 * 这个算式中A~I代表1~9的数字，不同的字母代表不同的数字。
 * <p>
 * 比如：
 * 6+8/3+952/714 就是一种解法，
 * 5+3/1+972/486 是另一种解法。
 * <p>
 * 这个算式一共有多少种解法？
 * <p>
 * 注意：你提交应该是个整数，不要填写任何多余的内容或说明性文字。
 * <p>
 * Alke
 * 2020-10-12 19:32
 */
public class _3凑算式 {
    static int sum = 0;

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] b = {6, 8, 3, 9, 5, 2, 7, 1, 4};
        f(b, 0);
        System.out.println(sum);
    }

    private static void f(int[] a, int k) {
        if (k == a.length) {
            if (check(a)) {
                sum++;
            }
            return;
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

    private static boolean check(int[] arr) {
        int a = arr[0];
        int b = arr[1];
        int c = arr[2];
        int def = arr[3] * 100 + arr[4] * 10 + arr[5];
        int ghi = arr[6] * 100 + arr[7] * 10 + arr[8];
        if ((10 - a) * c * ghi == b * ghi + c * def) return true;
        else return false;
//        int n21 = b*ghi;
//        int n22 = c*ghi;
//        int n31 = c*def;
//        int n32 = c*ghi;
//        if ((n21+n31)/n22+a==10){ //除号自动忽略小数导致很多数都可以凑出来！！！！！！！！！！！
//            return true;
//        }
//        return false;
    }
}
