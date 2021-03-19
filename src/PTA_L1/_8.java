package PTA_L1;

import java.util.Scanner;

/**
 * :
 * Alke
 * 2020-11-07 17:39
 */
public class _8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        int hang = (b - a + 1) % 5 == 0 ? (b - a + 1) / 5 : (b - a + 1) / 5 + 1;
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < 5; j++) {
                if (a > b) break;
                System.out.print(String.format("%5d", a));
                a++;
            }
            System.out.println("");
        }
        System.out.print("Sum = " + sum);
    }
}
