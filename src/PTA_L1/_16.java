package PTA_L1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * :
 * L1-016 查验身份证 (15分)
 * 一个合法的身份证号码由17位地区、日期编号和顺序编号加1位校验码组成。校验码的计算规则如下：
 * <p>
 * 首先对前17位数字加权求和，权重分配为：{7，9，10，5，8，4，2，1，6，3，7，9，10，5，8，4，2}；然后将计算的和对11取模得到值Z；
 * 最后按照以下关系对应Z值与校验码M的值：
 * <p>
 * Z：0 1 2 3 4 5 6 7 8 9 10
 * M：1 0 X 9 8 7 6 5 4 3 2
 * Alke
 * 2020-11-08 10:50
 */
public class _16 {
    static int[] weight = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
    static int[] z = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    static char[] m = {'1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2'};
    static Map<Integer, Character> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < z.length; i++) {
            map.put(z[i], m[i]);
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] strs = new String[n];
        for (int i = 0; i < n; i++) {
            strs[i] = reader.readLine();
        }
        boolean ans = true;
        for (int i = 0; i < n; i++) {
            boolean checkk = check(strs[i]);
            ans = ans && checkk;
            if (!checkk)
                System.out.println(strs[i]);
        }
        if (ans) System.out.println("All passed");
    }

    public static boolean check(String s) {
        char[] cs = s.toCharArray();
        double sum = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (cs[i] < '0' || cs[i] > '9') return false;
            sum += weight[i] * Integer.valueOf(cs[i] + "");
        }
        return ("" + cs[cs.length - 1]).equals("" + map.get((int) sum % 11));
    }

}
