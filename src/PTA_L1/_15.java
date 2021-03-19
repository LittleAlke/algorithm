package PTA_L1;

import java.util.Scanner;

/**
 * :
 * Alke
 * 2020-11-08 10:44
 */
public class _15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int hang = n % 2 == 0 ? n / 2 : n / 2 + 1;
        char c = sc.next().charAt(0);
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
