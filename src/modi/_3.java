package modi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * :
 * Alke
 * 2020-11-28 10:03
 */
public class _3 {
    static int[][] map = new int[11][11];
    static int n, e;
    static boolean[] visit = new boolean[11];

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] s1 = reader.readLine().split(" +");
        n = Integer.parseInt(s1[0]);
        e = Integer.parseInt(s1[1]);
        for (int i = 0; i < e; i++) {
            String[] s = reader.readLine().split(" +");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            map[a][b] = 1;
            map[b][a] = 1;
        }
        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
                System.out.print("{ ");
                dfs(i);
                System.out.println("}");
            }
        }

    }

    public static void dfs(int i) {
        System.out.print(i + " ");
        visit[i] = true;
        for (int j = 0; j < n; j++) {
            if (map[i][j] == 1 && (!visit[j])) dfs(j);
        }
    }
}
