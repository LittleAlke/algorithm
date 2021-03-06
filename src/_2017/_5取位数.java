package _2017;

/**
 * :求1个整数的第k位数字有很多种方法。
 * 以下的方法就是一种。
 * <p>
 * public class Main
 * {
 * static int len(int x){
 * if(x<10) return 1;
 * return len(x/10)+1;
 * }
 * <p>
 * // 取x的第k位数字
 * static int f(int x, int k){
 * if(len(x)-k==0) return x%10;
 * return ______________________;  //填空
 * }
 * <p>
 * public static void main(String[] args)
 * {
 * int x = 23513;
 * //System.out.println(len(x));
 * System.out.println(f(x,3));
 * }
 * }
 * <p>
 * 对于题目中的测试数据，应该打印5。
 * <p>
 * 请仔细分析源码，并补充划线部分所缺少的代码
 * Alke
 * 2020-10-16 10:46
 */
public class _5取位数 {
    static int len(int x) {
        if (x < 10) return 1;
        return len(x / 10) + 1;
    }

    // 取x的第k位数字
    static int f(int x, int k) {
        if (len(x) - k == 0) return x % 10;
//        return ______________________;  //填空
        return f(x / 10, k);
    }

    public static void main(String[] args) {
        int x = 23513;
        //System.out.println(len(x));
        System.out.println(f(x, 3));

    }
}
