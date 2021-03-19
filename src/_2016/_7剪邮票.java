package _2016;

import java.lang.reflect.Array;
import java.util.*;

/**
 * :如【图1.jpg】, 有12张连在一起的12生肖的邮票。
 * 现在你要从中剪下5张来，要求必须是连着的。
 * （仅仅连接一个角不算相连）
 * 比如，【图2.jpg】，【图3.jpg】中，粉红色所示部分就是合格的剪取。
 * <p>
 * 请你计算，一共有多少种不同的剪取方法。
 * <p>
 * 请填写表示方案数目的整数。
 * 注意：你提交的应该是一个整数，不要填写任何多余的内容或说明性文字。
 * Alke
 * 2020-10-14 13:00
 */
public class _7剪邮票 {
    static int[] a = {1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0};
    static int sum = 0;

    public static void main(String[] args) {
        int[] path = new int[a.length];
        f(path, 0);
        System.out.println(sum);
    }

    //生成全排列
    static boolean[] vis = new boolean[a.length]; //标记是否用过这个元素

    private static void f(int path[], int k) {
        if (k == path.length) {
            //排列完毕
            if (check(path)) {
                sum++;
            }
        }
        for (int i = 0; i < path.length; i++) {
            if (i > 0 && a[i] == a[i - 1] && !vis[i - 1]) continue;//待选元素和上一个元素相同且上一个还没用过
            if (!vis[i]) {//未被用过的元素
                vis[i] = true;//标记已用了
                path[k] = a[i];//填入对应的元素
                f(path, k + 1);//递归
                vis[i] = false;//回溯
            }
        }
    }

    //判断
    private static boolean check(int[] path) {
        int[][] map = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (path[i * 4 + j] == 1) map[i][j] = 1;
                else map[i][j] = 0;
            }
        }
        int cut = 0;//连通块的数量
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (map[i][j] == 1) {
                    dfs(map, i, j);
                    cut++;
                }
            }
        }
        return cut == 1;
    }

    //联通检测，将检测过的都变为0
    private static void dfs(int map[][], int i, int j) {
        map[i][j] = 0;
        if (i - 1 >= 0 && map[i - 1][j] == 1) dfs(map, i - 1, j);
        if (i + 1 <= 2 && map[i + 1][j] == 1) dfs(map, i + 1, j);
        if (j - 1 >= 0 && map[i][j - 1] == 1) dfs(map, i, j - 1);
        if (j + 1 <= 3 && map[i][j + 1] == 1) dfs(map, i, j + 1);
    }

}
