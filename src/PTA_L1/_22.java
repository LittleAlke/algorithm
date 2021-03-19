package PTA_L1;

import java.util.Scanner;

/**
 * :
 * Alke
 * 2020-11-18 11:05
 */
public class _22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int ji = 0;
        int ou = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            if (a[i] % 2 == 0) {
                ou++;
            } else {
                ji++;
            }
        }
        System.out.println(ji + " " + ou);
    }
}
