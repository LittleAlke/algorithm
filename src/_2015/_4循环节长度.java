package _2015;

import java.util.Vector;

/**
 * :两个整数做除法，有时会产生循环小数，其循环部分称为：循环节。
 * 比如，11/13=6=>0.846153846153.....  其循环节为[846153] 共有6位。
 * 下面的方法，可以求出循环节的长度。
 * <p>
 * 请仔细阅读代码，并填写划线部分缺少的代码。
 * <p>
 * public static int f(int n, int m)
 * {
 * n = n % m;
 * Vector v = new Vector();
 * <p>
 * for(;;)
 * {
 * v.add(n);
 * n *= 10;
 * n = n % m;
 * if(n==0) return 0;
 * if(v.indexOf(n)>=0)  _________________________________ ;  //填空
 * }
 * }
 * <p>
 * 注意，只能填写缺少的部分，不要重复抄写已有代码。不要填写任何多余的文字。
 * Alke
 * 2020-10-11 10:47
 */
public class _4循环节长度 {
    public static void main(String[] args) {
        System.out.println(f(11, 13));
    }

    public static int f(int n, int m) {
        n = n % m;
        Vector v = new Vector();

        for (; ; ) {
            v.add(n);
            n *= 10;
            n = n % m;
            if (n == 0) return 0;
            if (v.indexOf(n) >= 0) return v.size() - v.indexOf(n);  //填空
        }
    }
}
