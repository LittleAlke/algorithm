package TEST;

import java.util.Scanner;

/**
 * :题目描述
 * 给出一个正整数N和长度L，找出一段长度大于等于L的连续非负整数，他们的和恰好为N。答案可能有多个，我我们需要找出长度最小的那个。
 * 例如 N = 18 L = 2：
 * 5 + 6 + 7 = 18
 * 3 + 4 + 5 + 6 = 18
 * 都是满足要求的，但是我们输出更短的 5 6 7
 * 输入描述:
 * 输入数据包括一行： 两个正整数N(1 ≤ N ≤ 1000000000),L(2 ≤ L ≤ 100)
 * 输出描述:
 * 从小到大输出这段连续非负整数，以空格分隔，行末无空格。如果没有这样的序列或者找出的序列长度大于100，则输出No
 * 示例1
 * 输入
 * 复制
 * 18 2
 * 输出
 * 复制
 * 5 6 7
 * Alke
 * 2021-03-10 17:15
 */
public class t1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        while (true){
            if ((2*n+l-(l*l))%(2*l)==0){
                int a0 = (2*n+l-(l*l))/(2*l);
                for (int i = 0; i < n; i++) {
                    if (i==a0){
                        myPrint(l,a0);
                        return;
                    }
                    if (i>a0)break;
                }
            }else {
                l++;
                if(l>100){
                    System.out.println("No");
                    return;
                }
            }
        }


//        while (true){
//            if (l>100){
//                System.out.println("No");
//                return;
//            }
//            int sum = 0;
//            for (int j = 0; j < l; j++) {//初始化最小和
//                sum += j;
//            }
//            for (int i = 0; i <= n; i++) {
//                if (sum==n){
//                    myPrint(l,i);
//                    return;
//                }
//                if (sum > n) break;
//                sum-=i;
//                sum+=i+l;
//            }
//            l++;//步长
//
//        }

    }
    static void myPrint(int step,int start){
        System.out.print(start);
        for (int i = 1; i < step; i++) {
            System.out.print(" "+(start+i));
        }
    }
}






















