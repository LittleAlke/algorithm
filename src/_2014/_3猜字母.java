package _2014;

import jdk.nashorn.internal.ir.WhileNode;

import java.util.ArrayList;
import java.util.List;

/**
 * :把abcd...s共19个字母组成的序列重复拼接106次，得到长度为2014的串。
 * <p>
 * 接下来删除第1个字母（即开头的字母a），以及第3个，第5个等所有奇数位置的字母。
 * <p>
 * 得到的新串再进行删除奇数位置字母的动作。如此下去，最后只剩下一个字母，请写出该字母。
 * <p>
 * 答案是一个小写字母，请通过浏览器提交答案。不要填写任何多余的内容。
 * Alke
 * 2020-10-04 10:55
 */
public class _3猜字母 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 106; i++) {
            for (int j = 0; j < 19; j++) {
                list.add(97 + j);
            }
        }


        while (list.size() > 1) {
            int size = list.size();
            if (size % 2 != 0) size += 1;
            for (int i = 0; i < size / 2; i++) {
                list.remove(i);
            }
            System.out.println(list.size() + "  " + list.get(0));
        }
        int ans = list.get(0);
        System.out.println((char) ans);
    }

}
