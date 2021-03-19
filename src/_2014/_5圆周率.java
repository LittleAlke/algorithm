package _2014;

/**
 * :    数学发展历史上，圆周率的计算曾有许多有趣甚至是传奇的故事。其中许多方法都涉及无穷级数。
 * <p>
 * 图1.png中所示，就是一种用连分数的形式表示的圆周率求法。
 * <p>
 * 下面的程序实现了该求解方法。实际上数列的收敛对x的初始值 并不敏感。
 * <p>
 * 结果打印出圆周率近似值（保留小数点后4位，并不一定与圆周率真值吻合）。
 * <p>
 * double x = 111;
 * for(int n = 10000; n>=0; n--){
 * int i = 2 * n + 1;
 * x = 2 + (i*i / x);
 * }
 * <p>
 * System.out.println(String.format("%.4f", ______________));
 * Alke
 * 2020-10-07 10:19
 */
public class _5圆周率 {
    public static void main(String[] args) {
        System.out.println(f1());
//        System.out.println(4/(f(0,10000)-1));
    }

//    public static double f(int i,int lun){
//        if (lun<=0){
//            return 1;
//        }
//        return 2+(i*2+1)*(i*2+1)/f(i+1,lun-1);
//    }

    public static double f1() {
        double x = 111;
        for (int n = 10000; n >= 0; n--) {
            int i = 2 * n + 1;
            x = 2 + (i * i / x);
        }
        return 4 / (x - 1);
    }
}
