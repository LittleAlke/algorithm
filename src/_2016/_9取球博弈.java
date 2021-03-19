package _2016;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * :两个人玩取球的游戏。
 * 一共有N个球，每人轮流取球，每次可取集合{n1,n2,n3}中的任何一个数目。
 * 如果无法继续取球，则游戏结束。
 * 此时，持有奇数个球的一方获胜。
 * 如果两人都是奇数，则为平局。
 * <p>
 * 假设双方都采用最聪明的取法，
 * 第一个取球的人一定能赢吗？
 * 试编程解决这个问题。
 * <p>
 * 输入格式：
 * 第一行3个正整数n1 n2 n3，空格分开，表示每次可取的数目 (0<n1,n2,n3<100)
 * 第二行5个正整数x1 x2 ... x5，空格分开，表示5局的初始球数(0<xi<1000)
 * <p>
 * 输出格式：
 * 一行5个字符，空格分开。分别表示每局先取球的人能否获胜。
 * 能获胜则输出+，
 * 次之，如有办法逼平对手，输出0，
 * 无论如何都会输，则输出-
 * <p>
 * 例如，输入：
 * 1 2 3
 * 1 2 3 4 5
 * <p>
 * 程序应该输出：
 * + 0 + 0 -
 * <p>
 * 再例如，输入：
 * 1 4 5
 * 10 11 12 13 15
 * <p>
 * 程序应该输出：
 * 0 - 0 + +
 * <p>
 * 再例如，输入：
 * 2 3 5
 * 7 8 9 10 11
 * <p>
 * 程序应该输出：
 * + 0 0 0 0
 * <p>
 * 1 7 8
 * 900 901 903 905 907
 * <p>
 * 资源约定：
 * 峰值内存消耗（含虚拟机） < 256M
 * CPU消耗  < 3000ms
 * Alke
 * 2020-10-15 15:24
 */
public class _9取球博弈 {
    static int ke[] = new int[3];
    static int qiu[] = new int[5];
    static char[][][] cache = new char[1000][2][2];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < ke.length; i++) {
            ke[i] = sc.nextInt();
        }
        Arrays.sort(ke);
        for (int i = 0; i < qiu.length; i++) {
            qiu[i] = sc.nextInt();
        }
        for (int i = 0; i < qiu.length; i++) {
            char c = f(qiu[i], 0, 0);
            System.out.print(c + " ");
        }
    }

    private static char f(int num, int me, int you) {
        if (num < ke[0]) {
            if ((me & 1) == 1 && (you & 1) == 0) return '+';
            else if ((me & 1) == 0 && (you & 1) == 1) return '-';
            else return '0';
        }

        if (cache[num][me][you] != '\0') return cache[num][me][you];

        boolean ping = false;
        for (int i = 0; i < ke.length; i++) {
            if (num >= ke[i]) {
                char c = f(num - ke[i], you & 1, (me + ke[i]) & 1);
                if (c == '-') {
                    cache[num][me][you] = '+';
                    return '+';//只要出现对手输了，就返回我赢了
                }
                if (c == '0') ping = true;//可以成为平局
            }
        }
        //到这里还没有结束说明对手已经不可能输了
        if (ping) return '0';
        else return '-';
    }
}
