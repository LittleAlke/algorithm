package TEST;

import java.util.Scanner;

/**
 * :
 * Alke
 * 2021-03-11 15:50
 */
public class 构造回文 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while (sc.hasNext()) {
                String s1 = sc.next();
                String s2 = new StringBuilder(s1).reverse().toString();
                int[][] dp = new int[s1.length() + 1][s2.length() + 1];
                for (int i = 1; i < dp.length; i ++ ) {
                    for (int j = 1; j < dp[0].length; j ++ ) {
                        dp[i][j] = s1.charAt(i - 1) == s2.charAt(j - 1) ? dp[i - 1][j - 1] + 1 : Math.max(dp[i - 1][j], dp[i][j - 1]);
                    }
                }
                System.out.println(s1.length() - dp[s1.length()][s2.length()]);
            }
        }


//    static int huiwen(String s){
//        char[] x = s.toCharArray();
//        char[] y = new StringBuffer(s).reverse().toString().toCharArray();
//        int[][] d = new int[x.length+1][y.length+1];
//        int max = 0;
//        for (int i = 1; i < x.length+1; i++) {
//            for (int j = 1; j < y.length+1; j++) {
//                if (x[i-1]!=y[j-1]){
//                    d[i][j] = d[i-1][j] > d[i][j-1] ? d[i-1][j] : d[i][j-1];
//                }else {
//                    d[i][j] = 1 + d[i-1][j-1];
//                    if (max < d[i][j]) max = d[i][j];
//                }
//            }
//        }
//        return s.length()-max;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()){
//            String str = sc.nextLine();
//            System.out.println(huiwen(str));
//        }
//    }
}
