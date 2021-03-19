package TEST;

/**
 * 完全背包：每件物品有无穷多件
 * Alke
 * 2021-03-16 15:34
 */
public class 完全背包 {
    public static void main(String[] args) {
        int t = 1;//背包容量
        int m = 4;//物品的数量
        int[] w = {2, 3, 4, 5};//不同物品的体积
        int[] v = {3, 4, 5, 6};//不同物品的价值
        System.out.println(dp(t, m, w, v));

    }

    private static int dp(int t, int m, int[] w, int[] v) {
        int dp[] = new int[t + 1];
        for (int i = 0; i < m; i++) {//当只有1，2，3...种物品时
                for (int j = w[i]; j <= t; j++) {//从放好装下这件物品开始，依次遍历背包容量，依次比较放或者不放
                    dp[j] = Math.max(dp[j], dp[j - w[i]] + v[i]);
                    System.out.print(dp[j]+" ");
                }
            System.out.println();
        }

        return dp[t];
    }


}
