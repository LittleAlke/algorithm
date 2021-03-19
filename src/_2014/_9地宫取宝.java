package _2014;

import java.util.Scanner;

/**
 * :X 国王有一个地宫宝库。是 n x m 个格子的矩阵。每个格子放一件宝贝。每个宝贝贴着价值标签。
 * <p>
 * 地宫的入口在左上角，出口在右下角。
 * <p>
 * 小明被带到地宫的入口，国王要求他只能向右或向下行走。
 * <p>
 * 走过某个格子时，如果那个格子中的宝贝价值比小明手中任意宝贝价值都大，小明就可以拿起它（当然，也可以不拿）。
 * <p>
 * 当小明走到出口时，如果他手中的宝贝恰好是k件，则这些宝贝就可以送给小明。
 * <p>
 * 请你帮小明算一算，在给定的局面下，他有多少种不同的行动方案能获得这k件宝贝。
 * <p>
 * 【数据格式】
 * <p>
 * 输入一行3个整数，用空格分开：n m k (1<=n,m<=50, 1<=k<=12)
 * <p>
 * 接下来有 n 行数据，每行有 m 个整数 Ci (0<=Ci<=12)代表这个格子上的宝物的价值
 * <p>
 * 要求输出一个整数，表示正好取k个宝贝的行动方案数。该数字可能很大，输出它对 1000000007 取模的结果。
 * <p>
 * 例如，输入：
 * 2 2 2
 * 1 2
 * 2 1
 * 程序应该输出：
 * 2
 * <p>
 * 再例如，输入：
 * 2 3 2
 * 1 2 3
 * 2 1 5
 * 程序应该输出：
 * 14
 * <p>
 * 资源约定：
 * 峰值内存消耗（含虚拟机） < 256M
 * CPU消耗  < 2000ms
 * Alke
 * 2020-10-07 21:11
 */
public class _9地宫取宝 {//超时，四十多分
    static int[][] map;
    static int m, n, k, ans = 0;
    static final int mod = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();
        map = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        dfs(0, 0, -1, 0);
        System.out.println(ans);
    }

    private static void dfs(int x, int y, int max, int cut) {
        if (x == n || y == m || cut > k) return;
        int cur = map[x][y];
        if (x == n - 1 && y == m - 1) {
            if (cut == k || cut == k - 1 && cur > max) {
                ans++;
                ans %= mod;
                return;
            }
            return;
        }
        if (cur > max) {
            dfs(x + 1, y, cur, cut + 1);
            dfs(x, y + 1, cur, cut + 1);
        }
        dfs(x + 1, y, max, cut);
        dfs(x, y + 1, max, cut);
    }
}
