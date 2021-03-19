package PTA_L1;

import java.util.Scanner;

/**
 * :
 * Alke
 * 2020-11-08 10:38
 */
public class _13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = n; i > 0; i--) {
            int cheng = 1;
            for (int j = i; j > 0; j--) {
                cheng *= j;
            }
            sum += cheng;
        }
        System.out.println(sum);
    }
}
