package _2014;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/**
 * :小明先把硬币摆成了一个 n 行 m 列的矩阵。
 * <p>
 * 随后，小明对每一个硬币分别进行一次 Q 操作。
 * <p>
 * 对第x行第y列的硬币进行 Q 操作的定义：将所有第 i*x 行，第 j*y 列的硬币进行翻转。
 * <p>
 * 其中i和j为任意使操作可行的正整数，行号和列号都是从1开始。
 * <p>
 * 当小明对所有硬币都进行了一次 Q 操作后，他发现了一个奇迹——所有硬币均为正面朝上。
 * <p>
 * 小明想知道最开始有多少枚硬币是反面朝上的。于是，他向他的好朋友小M寻求帮助。
 * <p>
 * 聪明的小M告诉小明，只需要对所有硬币再进行一次Q操作，即可恢复到最开始的状态。然而小明很懒，不愿意照做。于是小明希望你给出他更好的方法。帮他计算出答案。
 * <p>
 * 【数据格式】
 * 输入数据包含一行，两个正整数 n m，含义见题目描述。
 * 输出一个正整数，表示最开始有多少枚硬币是反面朝上的。
 * <p>
 * 【样例输入】
 * 2 3
 * <p>
 * 【样例输出】
 * 1
 * <p>
 * 【数据规模】
 * 对于10%的数据，n、m <= 10^3；
 * 对于20%的数据，n、m <= 10^7；
 * 对于40%的数据，n、m <= 10^15；
 * 对于10%的数据，n、m <= 10^1000（10的1000次方）。
 * <p>
 * 资源约定：
 * 峰值内存消耗（含虚拟机） < 256M
 * CPU消耗  < 2000ms
 * Alke
 * 2020-10-07 22:43
 */
public class _10矩阵翻硬币 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(sqrt(s1).multiply(sqrt(s2)));
    }

    private static BigInteger sqrt(String s) {
        int length = s.length();
        int len = 0;
        if (length % 2 == 0) len = length / 2;
        else len = length / 2 + 1;
        char[] chars = new char[len];
        Arrays.fill(chars, '0');
        BigInteger target = new BigInteger(s);
        for (int i = 0; i < len; i++) {
            for (char j = '1'; j <= '9'; j++) {
                chars[i] = j;
                BigInteger pow = new BigInteger(String.valueOf(chars)).pow(2);
                if (pow.compareTo(target) == 1) {
                    chars[i] -= 1;
                    break;
                }
            }
        }
        return new BigInteger(String.valueOf(chars));
    }
}
