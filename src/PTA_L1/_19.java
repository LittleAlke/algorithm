package PTA_L1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * :
 * Alke
 * 2020-11-15 10:06
 */
public class _19 {
    static int[][] map;
    static int a, b;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] jiuliang = reader.readLine().split(" +");
        a = Integer.parseInt(jiuliang[0]);
        b = Integer.parseInt(jiuliang[1]);
        int a0 = a;
        int b0 = b;
        int lun = Integer.parseInt(reader.readLine());
        map = new int[lun][4];
        for (int i = 0; i < lun; i++) {
            String[] onelun = reader.readLine().split(" +");
            for (int j = 0; j < 4; j++) {
                map[i][j] = Integer.parseInt(onelun[j]);
            }
        }

        int i = -1;
        while (a >= 0 && b >= 0) {
            i++;
            if (map[i][0] + map[i][2] == map[i][1] && map[i][0] + map[i][2] == map[i][3]) {
                a--;
                b--;
                continue;
            }
            if (map[i][0] + map[i][2] == map[i][1])
                a--;
            else if (map[i][0] + map[i][2] == map[i][3])
                b--;
        }

        if (a <= 0) {
            System.out.println("A");
            System.out.println(b0 - b);
        } else {
            System.out.println("B");
            System.out.println(a0 - a);
        }

    }
}
