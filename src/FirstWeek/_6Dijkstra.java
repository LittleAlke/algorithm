package FirstWeek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * :7-6 城市间紧急救援
 * 作为一个城市的应急救援队伍的负责人，你有一张特殊的全国地图。在地图上显示有多个分散的城市和一些连接城市的快速道路。
 * 每个城市的救援队数量和每一条连接两个城市的快速道路长度都标在地图上。当其他城市有紧急求助电话给你的时候，
 * 你的任务是带领你的救援队尽快赶往事发地，同时，一路上召集尽可能多的救援队。
 * <p>
 * 输入格式:
 * 输入第一行给出4个正整数N、M、S、D，其中N（2≤N≤500）是城市的个数，顺便假设城市的编号为0 ~ (N−1)；M是快速道路的条数；
 * S是出发地的城市编号；D是目的地的城市编号。
 * <p>
 * 第二行给出N个正整数，其中第i个数是第i个城市的救援队的数目，数字间以空格分隔。随后的M行中，每行给出一条快速道路的信息，
 * 分别是：城市1、城市2、快速道路的长度，中间用空格分开，数字均为整数且不超过500。输入保证救援可行且最优解唯一。
 * <p>
 * 输出格式:
 * 第一行输出最短路径的条数和能够召集的最多的救援队数量。第二行输出从S到D的路径中经过的城市编号。数字间以空格分隔，
 * 输出结尾不能有多余空格。
 * <p>
 * 输入样例:
 * 4 5 0 3
 * 20 30 40 10
 * 0 1 1
 * 1 3 2
 * 0 3 3
 * 0 2 2
 * 2 3 2
 * 输出样例:
 * 2 60
 * 0 1 3
 * Alke
 * 2020-11-09 10:46
 */
public class _6Dijkstra {
    static int inf = Integer.MAX_VALUE;
    static int maxn = 550; //最大城市数量
    //思考整个过程需要哪些量
//首先明确输入的量有哪些
    static int n, m, s, e;//城市数量 道路条数 出发点 终点
    static int map[][] = new int[maxn][maxn]; //G两点间道路长度(无向路)
    static int[] weight = new int[maxn]; //  weight存储城市救援队数量
    //求解的量
    static int[] num = new int[maxn];//num源点到各点的路径条数
    static int[] w = new int[maxn];//w源点到各点能够召集最多的救援队数量
    static int[] pre = new int[maxn];
    //图中一般都需要的量
    static int[] d = new int[maxn];//d起始点到各点的最短距离
    static boolean[] vis = new boolean[maxn];//用于判断是否访问过


    public static void dijkstra(int s) {
        Arrays.fill(d, inf);//初始化距离表为无穷大
        d[s] = 0;//初始点到自己的距离为0
        w[s] = weight[s];
        num[s] = 1;//路径条数为1
        for (int i = 0; i < n; i++) {//遍历所有节点   循环n次是防止最坏的情况图为一条直线
            int u = -1, mnD = inf;
            for (int j = 0; j < n; j++) {//遍历所有节点到源点的d，找到最短的那一条
                if (!vis[j] && d[j] < mnD) {//如果没被访问且最短
                    mnD = d[j];
                    u = j;
                }
            }
            if (u == -1) return;
            vis[u] = true;//标记最短节点已访问
            for (int v = 0; v < n; v++) {//遍历所有v节点
                if (!vis[v] && map[u][v] != inf) {//v节点未被访问且v到u的距离不是极大值（即u到v有直接联通路径// ）
                    if (d[u] + map[u][v] < d[v]) {//如果刚刚确定的最短节点加上它可直接联通的节点v小于原点到v的距离
                        d[v] = d[u] + map[u][v];//更新d[v]的值
                        w[v] = w[u] + weight[v];//更新w[v]的值
                        pre[v] = u;//标记v的前一个节点为u
                        num[v] = num[u];//源点到u的路径数赋给源点到v的路径数，因为u到v可直接连接
                    } else if (d[u] + map[u][v] == d[v]) {//如果相等（）
                        if (w[u] + weight[v] > w[v]) {
                            w[v] = w[u] + weight[v];
                            pre[v] = u;
                        }
                        num[v] += num[u];//源点到v的路径条数加上到u的路径数
                    }
                }
            }
        }
    }

    static void printPath(int v) {
        if (v == s) {
            System.out.print(s);
            return;
        }
        printPath(pre[v]);
        System.out.print(" " + v);
    }

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < maxn; i++) {
            Arrays.fill(map[i], inf);
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] l1 = reader.readLine().split(" ");
        n = Integer.parseInt(l1[0]);
        m = Integer.parseInt(l1[1]);
        s = Integer.parseInt(l1[2]);
        e = Integer.parseInt(l1[3]);
        String[] l2 = reader.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            weight[i] = Integer.parseInt(l2[i]);
        }

        for (int i = 0; i < m; i++) {
            String l[] = reader.readLine().split(" +");
            int u = Integer.parseInt(l[0]);
            int v = Integer.parseInt(l[1]);
            map[u][v] = Integer.parseInt(l[2]);
            map[v][u] = map[u][v];
        }
        dijkstra(s);
        System.out.println(num[e] + " " + w[e]);
        printPath(e);
        System.out.println();
    }

}

















