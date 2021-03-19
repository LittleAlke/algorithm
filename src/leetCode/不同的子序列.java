package leetCode;

import java.util.Scanner;

/**
 * 给定一个字符串 s 和一个字符串 t ，计算在 s 的子序列中 t 出现的个数。
 *
 * 字符串的一个 子序列 是指，通过删除一些（也可以不删除）字符且不干扰剩余字符相对位置所组成的新字符串。（例如，"ACE" 是 "ABCDE" 的一个子序列，而 "AEC" 不是）
 *
 * 题目数据保证答案符合 32 位带符号整数范围。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：s = "rabbbit", t = "rabbit"
 * 输出：3
 * 解释：
 * 如下图所示, 有 3 种可以从 s 中得到 "rabbit" 的方案。
 * (上箭头符号 ^ 表示选取的字母)
 * rabbbit
 * ^^^^ ^^
 * rabbbit
 * ^^ ^^^^
 * rabbbit
 * ^^^ ^^^
 * 示例 2：
 *
 * 输入：s = "babgbag", t = "bag"
 * 输出：5
 * 解释：
 * 如下图所示, 有 5 种可以从 s 中得到 "bag" 的方案。
 * (上箭头符号 ^ 表示选取的字母)
 * babgbag
 * ^^ ^
 * babgbag
 * ^^    ^
 * babgbag
 * ^    ^^
 * babgbag
 *   ^  ^^
 * babgbag
 *     ^^^
 *  
 *
 * 提示：
 *
 * 0 <= s.length, t.length <= 1000
 * s 和 t 由英文字母组成
 * Alke
 * 2021-03-17 12:41
 */
public class 不同的子序列 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
//        if (t.equals("")) return 1;
//        if (s.equals("")) return 0;
        int[][] dp = new int[t.length()+1][s.length()+1];
        //若s为空
        for (int i = 0; i < t.length()+1; i++) {
            dp[i][0] = 0; //无论如何无法转换成功
        }
        //若t为空
        for (int i = 0; i < s.length() + 1; i++) {
            dp[0][i] = 1; //删除所有s即只有这一种方案
        }

        for (int i = 1; i <= t.length() ; i++) { //外层遍历t的所有字符
            for (int j = 1; j <= s.length(); j++) { //内层遍历s的所有字符
                if (s.charAt(j-1)!=t.charAt(i-1)){
                    dp[i][j] = dp[i][j-1];
                }else {
                    dp[i][j] = dp[i-1][j-1] + dp[i][j-1];
                }
            }
        }
        System.out.println(dp[t.length()][s.length()]);
        for (int i = 0; i < dp.length; i++) {
            if (i==0) {
                System.out.print("    ");
                for (int j = 0; j < s.length(); j++) {
                    System.out.print(s.charAt(j) + " ");
                }
                System.out.println();
                System.out.print("  ");
            }
            if (i>0)
                System.out.print(t.charAt(i-1)+" ");
            for (int j = 0; j < dp[i].length; j++) {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }

}




























