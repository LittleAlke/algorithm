package TEST;

/**
 * 多重背包：每件物品的件数不一样
 * Alke
 * 2021-03-16 15:36
 */
public class 多重背包 {
    public static void main(String[] args) {
        int t = 165;//背包容量
        int m = 4;//物品的数量
        int[] w = {2, 3, 4, 5};//不同物品的体积
        int[] v = {3, 4, 5, 6};//不同物品的价值
        int[] s = {5, 3, 1, 6};//每种物品有几个
        System.out.println(dp(t, m, w, v, s));
    }

    private static int dp(int t, int m, int[] w, int[] v, int[] s) {
        int[] dp = new int[t + 1];
        for (int i = 0; i < m; i++) {
            for (int j = t; j > 0; j--) {
                //在零一背包的基础上加上第i个物品拿k个循环
                for (int k = 0; k <= s[i] && j >= k * w[i]; k++) {
                    dp[j] = Math.max(dp[j], dp[j - k * w[i]] + k * v[i]);
                }
            }
        }
        return dp[t];
    }
}
