package leetCode;

import java.math.BigInteger;

/**
 * :
 * Alke
 * 2021-03-17 16:42
 */
public class 整数反转 {
    public static void main(String[] args) {
//        System.out.println(reverse(-2147483647));
        System.out.println((2147483647)*10/10);
    }
    public static int reverse(int x) {
        int ans = 0;
        while (x != 0) {
            if ((ans * 10) / 10 != ans) { //溢出之后结果不一致就跳出了
                ans = 0;
                break;
            }
            ans = ans * 10 + x % 10;
            x = x / 10;
        }
        return ans;


//        String s;
//        if (x>=0){
//            s = new StringBuilder(""+x).reverse().toString();
//        }else {
//            s = "-"+new StringBuilder((""+x).substring(1)).reverse().toString();
//        }
//        BigInteger b1 = new BigInteger(s);
//        if (x>0&&b1.compareTo(new BigInteger("2147483647"))>0){
//            return 0;
//        }
//        if (x<0&&b1.compareTo(new BigInteger("-2147483648"))<0){
//            return 0;
//        }
//        return Integer.valueOf(s);
    }
}
