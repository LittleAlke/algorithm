package TEST;

/**
 * 最大区间和Maximum Subarray Sum
 * 给N个数，求数组中连续区间数字和最
 * 大值，也可以选空区间和为0。
 * 大的正数被太多的负数挡在外面就不值
 * 得去拿了，除非后面有更大的奖励。
 * Alke
 * 2021-03-16 11:09
 */
public class 最大区间和 {
    public static void main(String[] args) {
        int[] arr = {2, -3, 4, -1, -2, 1, 5, -3, 1, 1};
        int sum = maxSubMax(arr);
        System.out.println(sum);
    }

    private static int maxSubMax(int[] arr) {
        int ans = 0;
        int dp = 0;
        for (int i = 0; i < arr.length; i++) {
            dp = Math.max(arr[i], dp + arr[i]);
            ans = Math.max(dp,ans);
        }
        return ans;
    }
}
















