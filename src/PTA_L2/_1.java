package PTA_L2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * :
 * Alke
 * 2020-11-21 23:11
 */
public class _1 {
    static int n, m, s, e, maxD = 500, inf = Integer.MAX_VALUE;
    static int[][] map = new int[maxD][maxD];
    static int[] weight = new int[maxD];

    static int[] w = new int[maxD];
    static int[] pre = new int[maxD];
    static int[] num = new int[maxD];//源点到各点的路径条数

    static boolean[] vis = new boolean[maxD];
    static int[] d = new int[maxD];

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < maxD; i++) {
            Arrays.fill(map[i], inf);
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] ss = reader.readLine().split(" +");
        n = Integer.parseInt(ss[0]);
        m = Integer.parseInt(ss[1]);
        s = Integer.parseInt(ss[2]);
        e = Integer.parseInt(ss[3]);
        String[] lw = reader.readLine().split(" +");
        for (int i = 0; i < lw.length; i++) {
            weight[i] = Integer.parseInt(lw[i]);
        }
        for (int i = 0; i < m; i++) {
            String[] sss = reader.readLine().split(" +");
            int a = Integer.parseInt(sss[0]);
            int b = Integer.parseInt(sss[1]);
            map[a][b] = Integer.parseInt(sss[2]);
            map[b][a] = map[a][b];
        }
        dijkstra(s);
        System.out.println(num[e] + " " + w[e]);
        printPath(e);
        System.out.println();
    }

    static void printPath(int v) {
        if (v == s) {
            System.out.print(s);
            return;
        }
        printPath(pre[v]);
        System.out.print(" " + v);
    }

    static class Poir {
        int d, index;

        Poir(int d, int index) {
            this.d = d;
            this.index = index;
        }
    }

    static PriorityQueue<Poir> p = new PriorityQueue<>(new Comparator<Poir>() {
        @Override
        public int compare(Poir o1, Poir o2) {
            return o1.d - o2.d;
        }
    });

    public static void dijkstra(int s) {
        Arrays.fill(d, inf);
        d[s] = 0;
        p.add(new Poir(0, s));
        w[s] = weight[s];
        num[s] = 1;
        while (p.size() != 0) {
            Poir poir = p.poll();
            int i = poir.index;
            if (vis[i]) continue;
            vis[i] = true;
            for (int j = 0; j < n; j++) {
                if (map[j][i] != inf) {
                    if (d[i] + map[i][j] < d[j]) {
                        d[j] = d[i] + map[i][j];
                        w[j] = w[i] + weight[j];
                        pre[j] = i;
                        num[j] = num[i];
                        p.add(new Poir(d[j], j));
                    } else if (d[i] + map[i][j] == d[j]) {
                        if (w[i] + weight[j] > w[j]) {
                            w[j] = w[i] + weight[j];
                            pre[j] = i;
                        }
                        num[j] += num[i];
                    }
                }
            }
        }
    }

}

