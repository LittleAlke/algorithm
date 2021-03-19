package _2015;

/**
 * :观察下面的现象,某个数字的立方，按位累加仍然等于自身。
 * 1^3 = 1
 * 8^3  = 512    5+1+2=8
 * 17^3 = 4913   4+9+1+3=17
 * ...
 * <p>
 * 请你计算包括1,8,17在内，符合这个性质的正整数一共有多少个？
 * <p>
 * 请填写该数字，不要填写任何多余的内容或说明性的文字。
 * Alke
 * 2020-10-08 17:48
 */
public class _2立方变自身 {
    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            int n = (int) Math.pow(i, 3);
            String s = n + "";
            int sum = 0;
            for (int j = 0; j < s.length(); j++) {
                sum += s.charAt(j) - '0';
            }
            if (sum == i)
                System.out.println(i);
        }
    }
}
