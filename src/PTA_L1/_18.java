package PTA_L1;

import java.util.Scanner;

/**
 * :
 * Alke
 * 2020-11-08 13:52
 */
public class _18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] strs = s.split(":");
        int hour = Integer.valueOf(strs[0]);
        int minute = Integer.valueOf(strs[1]);
        if (hour >= 0 && hour < 12) {
            System.out.println("Only " + s + ".  Too early to Dang.");
        } else if (hour == 12 && minute == 0) {
            System.out.println("Only " + s + ".  Too early to Dang.");
        } else {
            if (minute == 0) {
                for (int i = 12; i < hour; i++) {
                    System.out.print("Dang");
                }
            } else {
                for (int i = 12; i < hour + 1; i++) {
                    System.out.print("Dang");
                }
            }
            System.out.println();
        }
    }
}

