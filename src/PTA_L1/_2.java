package PTA_L1;

import java.util.*;

/**
 * :
 * Alke
 * 2020-11-06 22:10
 */
public class _2 {
    static char c;
    static int maxl;
    static int sheng = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sheng = n % 2 == 0 ? 1 : 0;
        c = sc.next().toCharArray()[0];
        int a = (n - 1) / 2;
        int sum = 0;
        for (int i = 3; ; i += 2) {
            sum += i;
            if (sum >= a) {
                if (sum == a) {
                    maxl = i;
                }
                if (sum > a) {
                    maxl = i - 2;
                    sheng += (a - (sum - i)) * 2;
                }
                break;
            }
        }

        for (int j = maxl; j >= 3; j -= 2) {
            sys(j);
        }
        sys(1);
        for (int j = 3; j <= maxl; j += 2) {
            sys(j);
        }
        System.out.println(sheng);
    }

    public static void sys(int i) {
        int cha = (maxl - i) / 2;
        for (int j = 0; j < cha; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < i; j++) {
            System.out.print(c);
        }
        System.out.println();
    }
}
