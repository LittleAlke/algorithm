package _2013;

import sun.applet.Main;

import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * :幸运数是波兰数学家乌拉姆命名的。它采用与生成素数类似的“筛法”生成。
 * <p>
 * 首先从1开始写出自然数1,2,3,4,5,6,....
 * <p>
 * 1 就是第一个幸运数。
 * 我们从2这个数开始。把所有序号能被2整除的项删除，变为：
 * 1 _ 3 _ 5 _ 7 _ 9 ....
 * <p>
 * 把它们缩紧，重新记序，为：
 * <p>
 * 1 3 5 7 9 .... 。这时，3为第2个幸运数，然后把所有能被3整除的序号位置的数删去。注意，是序号位置，不是那个数本身能否被3整除!! 删除的应该是5，11, 17, ...
 * <p>
 * 此时7为第3个幸运数，然后再删去序号位置能被7整除的(19,39,...)
 * <p>
 * 最后剩下的序列类似：
 * <p>
 * 1, 3, 7, 9, 13, 15, 21, 25, 31, 33, 37, 43, 49, 51, 63, 67, 69, 73, 75, 79, ...
 * <p>
 * 本题要求：
 * <p>
 * 输入两个正整数m n, 用空格分开 (m < n < 1000*1000)
 * 程序输出 位于m和n之间的幸运数的个数（不包含m和n）。
 * <p>
 * 例如：
 * 用户输入：
 * 1 20
 * 程序输出：
 * 5
 * <p>
 * 例如：
 * 用户输入：
 * 30 69
 * 程序输出：
 * 8
 * <p>
 * <p>
 * <p>
 * 资源约定：
 * 峰值内存消耗（含虚拟机） < 64M
 * CPU消耗  < 2000ms
 * Alke
 * 2020-10-03 10:26
 */
public class _8幸运数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 1; i <= end; i += 2) {
            list.add(i);
        }
        int index = 1;
        int luck = list.get(index);
        while (luck <= end && luck <= list.size()) {
            for (int i = 1; i <= list.size(); i++) {
                if (i % luck != 0)
                    temp.add(list.get(i - 1));
            }
            list.clear();
            list.addAll(temp);//list = temp;
            temp.clear();
            index++;
            luck = list.get(index);
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > start) {
                if (list.get(list.size() - 1) == end)
                    System.out.println(list.size() - i - 1);
                else
                    System.out.println(list.size() - i);
                break;
            }
        }
    }
}
