package TEST;

import java.util.Scanner;
import java.util.Stack;

/**
 * :时间限制：C/C++ 1秒，其他语言2秒
 * <p>
 * 空间限制：C/C++ 32M，其他语言64M
 * <p>
 * 小Q最近遇到了一个难题：把一个字符串的大写字母放到字符串的后面，各个字符的相对位置不变，且不能申请额外的空间。
 * 你能帮帮小Q吗？
 * 输入描述:
 * 输入数据有多组，每组包含一个字符串s，且保证:1<=s.length<=1000.
 * 输出描述:
 * <p>
 * 对于每组数据，输出移位后的字符串。
 * 输入例子1:
 * AkleBiCeilD
 * <p>
 * 输出例子1:
 * kleieilABCD
 */
public class 字符移位 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            String str = scan.nextLine();
            System.out.println(getResult(str));
        }
    }
    public static String getResult(String str){
        return str.replaceAll("[A-Z]","")+str.replaceAll("[a-z]","");
    }


//
//    static boolean is(char c) {
//        if (c >= 'A' && c <= 'Z') return true;
//        else return false;
//    }
//
//    static void move(int start, int end, char[] c) {
//        char c0 = c[start];
//        for (int i = start; i < end; i++) {
//            c[i] = c[i+1];
//        }
//        c[end] = c0;
//    }
//
//    public static void main(String[] args) {
//        Stack<Integer> big = new Stack<>();
//        Scanner sc = new Scanner(System.in);
//        char[] cs = sc.nextLine().toCharArray();
//        //初始化指针
//        for (int i = 0; i < cs.length; i++) {
//            if (is(cs[i]) && i != cs.length-1) big.push(i);
//        }
//        for (int i = cs.length - 1; i >= 0; i--) {
//            if (big.size()==0)break;
//            if (!is(cs[i]) && big.peek()< i) move(big.pop(),i,cs);
//        }
//        String s = String.copyValueOf(cs);
//        System.out.println(s);
//    }
}

















