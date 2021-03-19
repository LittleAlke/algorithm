package FirstWeek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * :7-1 通讯录排序
 * 输入n个朋友的信息，包括姓名、生日、电话号码，本题要求编写程序，按照年龄从大到小的顺序依次输出通讯录。题目保证所有人的生日均不相同。
 * <p>
 * 输入格式:
 * 输入第一行给出正整数n（<10）。随后n行，每行按照“姓名 生日 电话号码”的格式给出一位朋友的信息，
 * 其中“姓名”是长度不超过10的英文字母组成的字符串，“生日”是yyyymmdd格式的日期，“电话号码”是不超过17位的数字及+、-组成的字符串。
 * <p>
 * 输出格式:
 * 按照年龄从大到小输出朋友的信息，格式同输出。
 * <p>
 * 输入样例:
 * 3
 * zhang 19850403 13912345678
 * wang 19821020 +86-0571-88018448
 * qian 19840619 13609876543
 * 输出样例:
 * wang 19821020 +86-0571-88018448
 * qian 19840619 13609876543
 * zhang 19850403 13912345678
 * Alke
 * 2020-11-08 14:00
 */
public class _1 {
    static String[] strs;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        strs = new String[n];
        for (int i = 0; i < strs.length; i++) {
            strs[i] = reader.readLine().trim();
        }
        quickSort(strs, 0, strs.length - 1);
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }
    }

    public static int change(String s) {
        String[] ss = s.split(" ");
        return Integer.valueOf(ss[1]);
    }

    public static void quickSort(String[] arr, int low, int high) {
        int i, j;
        String temp, t;
        if (low > high) {
            return;
        }
        i = low;
        j = high;
        temp = arr[low];
        while (i < j) {
            while (change(temp) <= change(arr[j]) && i < j) {
                j--;
            }
            while (change(temp) >= change(arr[i]) && i < j) {
                i++;
            }
            if (i < j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }

        }
        arr[low] = arr[i];
        arr[i] = temp;
        quickSort(arr, low, j - 1);
        quickSort(arr, j + 1, high);
    }
}




















