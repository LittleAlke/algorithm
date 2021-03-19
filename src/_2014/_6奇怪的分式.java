package _2014;

/**
 * :上小学的时候，小明经常自己发明新算法。一次，老师出的题目是：
 * <p>
 * 1/4 乘以 8/5
 * <p>
 * 小明居然把分子拼接在一起，分母拼接在一起，答案是：18/45 （参见图1.png）
 * <p>
 * 老师刚想批评他，转念一想，这个答案凑巧也对啊，真是见鬼！
 * <p>
 * 对于分子、分母都是 1~9 中的一位数的情况，还有哪些算式可以这样计算呢？
 * <p>
 * 请写出所有不同算式的个数（包括题中举例的）。
 * <p>
 * 显然，交换分子分母后，例如：4/1 乘以 5/8 是满足要求的，这算做不同的算式。
 * <p>
 * 但对于分子分母相同的情况，2/2 乘以 3/3 这样的类型太多了，不在计数之列!
 * <p>
 * 注意：答案是个整数（考虑对称性，肯定是偶数）。请通过浏览器提交。不要书写多余的内容。
 * Alke
 * 2020-10-07 10:40
 */
public class _6奇怪的分式 {

    public static void main(String[] args) {
        int ans = 0;
        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                if (a == b) continue;
                for (int c = 1; c < 10; c++) {
                    for (int d = 1; d < 10; d++) {
                        if (c == d) continue;
                        int g1 = gcd(a * c, b * d);
                        int g2 = gcd(a * 10 + c, b * 10 + d);
                        if (a * c / g1 == (a * 10 + c) / g2 && b * d / g1 == (b * 10 + d) / g2)
                            ans++;


                    }
                }
            }
        }
        System.out.println(ans);
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
