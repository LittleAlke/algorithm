package leetCode;

/**
 给你一个字符串 s，找到 s 中最长的回文子串。

  

 示例 1：

 输入：s = "babad"
 输出："bab"
 解释："aba" 同样是符合题意的答案。
 示例 2：

 输入：s = "cbbd"
 输出："bb"
 示例 3：

 输入：s = "a"
 输出："a"
 示例 4：

 输入：s = "ac"
 输出："a"
  

 提示：

 1 <= s.length <= 1000
 s 仅由数字和英文字母（大写和/或小写）组成

 */
public class 最长回文字符串 {

    /*
    * 思路：
    * 1. 回文子串的头和尾一定相同
    * 2. 若用i标识左边界，j表示右边界，dp[i+1][j-1]一定要为true
    * 3. 只有当i+1和j-1之间的字母大于1个时，才有参看的意义，即 j-i>=3
    * */
    public static void main(String[] args) {
        System.out.println(longestPalindrome("aacabdkacaa"));
    }
    public static String longestPalindrome(String s) {
        // 特判
        int len = s.length();
        if (len < 2) {
            return s;
        }

        int maxLen = 1;
        int begin = 0;

        // dp[i][j] 表示 s[i, j] 是否是回文串
        boolean[][] dp = new boolean[len][len];
        char[] charArray = s.toCharArray();

        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }
        //因为对角线都是true 所以从1开始填表
        for (int j = 1; j < len; j++) {
            for (int i = 0; i < j; i++) {//左边界要小于右边界
                if (charArray[i] != charArray[j]) {
                    dp[i][j] = false;
                } else {
                    if (j - i < 3) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }
                // 只要 dp[i][j] == true 成立，就表示子串 s[i..j] 是回文，此时记录回文长度和起始位置
                if (dp[i][j] && j - i + 1 > maxLen) {
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }
        return s.substring(begin, begin + maxLen);
    }

}








