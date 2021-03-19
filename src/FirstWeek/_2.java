package FirstWeek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * :7-2 说反话-加强版
 * 给定一句英语，要求你编写程序，将句中所有单词的顺序颠倒输出。
 * <p>
 * 输入格式：
 * 测试输入包含一个测试用例，在一行内给出总长度不超过500 000的字符串。字符串由若干单词和若干空格组成，
 * 其中单词是由英文字母（大小写有区分）组成的字符串，单词之间用若干个空格分开。
 * <p>
 * 输出格式：
 * 每个测试用例的输出占一行，输出倒序后的句子，并且保证单词间只有1个空格。
 * <p>
 * 输入样例：
 * Hello World   Here I Come
 * 输出样例：
 * Come I Here World Hello
 * Alke
 * 2020-11-08 14:17
 */
public class _2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine().trim();
        String[] ss = s.split(" +");
        for (int i = ss.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(ss[i]);
            } else {
                System.out.print(ss[i] + " ");
            }
        }
        System.out.println();
    }
}













