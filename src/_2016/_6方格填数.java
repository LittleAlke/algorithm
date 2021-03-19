package _2016;

/**
 * :如下的10个格子
 * +--+--+--+
 * |  |  |  |
 * +--+--+--+--+
 * |  |  |  |  |
 * +--+--+--+--+
 * |  |  |  |
 * +--+--+--+
 * <p>
 * （如果显示有问题，也可以参看【图1.jpg】）
 * <p>
 * 填入0~9的数字。要求：连续的两个数字不能相邻。
 * （左右、上下、对角都算相邻）
 * <p>
 * 一共有多少种可能的填数方案？
 * <p>
 * 请填写表示方案数目的整数。
 * 注意：你提交的应该是一个整数，不要填写任何多余的内容或说明性文字。
 * Alke
 * 2020-10-14 10:52
 */
public class _6方格填数 {
    static int sum = 0;
    static int[][] map = new int[5][6];

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                map[i][j] = -2;
            }
        }
        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        f(a, 0);
        System.out.println(sum);
    }

    private static void f(int[] a, int k) {
        if (k == a.length) {
            if (check(a)) sum++;
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

    private static boolean check(int[] a) {
        int index = 0;
        boolean t = true;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 4; j++) {
                if (i == 1 && j == 1) continue;
                if (i == 3 && j == 4) break;
                map[i][j] = a[index];
                index++;
            }
        }
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 4; j++) {
                if (i == 1 && j == 1) continue;
                if (check2(i, j)) return false;
                if (i == 3 && j == 4) break;

            }
        }
        return true;
    }

    private static boolean check2(int a, int b) {
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (map[a + i][b + j] - map[a][b] == 1 || map[a + i][b + j] - map[a][b] == -1) return true;
            }
        }
        return false;
    }
}
