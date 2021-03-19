package TEST;


/**
 * 01背包：每件物品只有一件
 * Alke
 * 2021-03-16 14:07
 */
public class O1背包 {

    //优化：节省空间
    public static int dp2(int t,int m,int[] w,int[] v) {
        int dp[] = new int[t+1];
        for (int i = 1; i <= m; i++) {
            for (int j = t; j >= 0 ; j--) {
                if (j >= w[i])
                    dp[j] = Math.max(dp[j],dp[j-w[i]]+v[i]);
            }
        }
        return dp[t];
    }

    public static int dp1(int t,int m,int[] w,int[] v) {
        int[][] dp = new int[m + 1][t + 1];//不同承重量背包的总价值
        for (int i = 1; i <= m; i++) {
//              注意此处，不填满的话会出错
//            for (int j = t; j >= w[i]; j--) {
//                dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - w[i]] + v[i]);
//            }
            for (int j = t; j >= 0; j--) {
                if (j>=w[i])
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - w[i]] + v[i]);
                else
                    dp[i][j] = dp[i-1][j];
            }
        }
        return dp[m][t];
    }

    public static void main(String[] args) {
        int t = 8;//背包容量
        int m = 4;//物品的数量
        int[] w = {0,2, 3, 4, 5};//不同物品的体积
        int[] v = {0,3, 4, 5, 6};//不同物品的价值
        System.out.println(dp1(t,m,w,v));
        System.out.println(dp2(t,m,w,v));
    }


}
