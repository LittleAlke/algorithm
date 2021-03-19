package PTA_L1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * :
 * Alke
 * 2020-11-07 22:12
 */
public class _10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        String s = a[0] + "->" + a[1] + "->" + a[2];
        System.out.println(s);
    }
}
