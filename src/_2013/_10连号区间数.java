package _2013;


import java.util.Scanner;

/**
 * :小明这些天一直在思考这样一个奇怪而有趣的问题：
 * <p>
 * 在1~N的某个全排列中有多少个连号区间呢？这里所说的连号区间的定义是：
 * <p>
 * 如果区间[L, R] 里的所有元素（即此排列的第L个到第R个元素）递增排序后能得到一个长度为R-L+1的“连续”数列，则称这个区间连号区间。
 * <p>
 * 当N很小的时候，小明可以很快地算出答案，但是当N变大的时候，问题就不是那么简单了，现在小明需要你的帮助。
 * <p>
 * 输入格式：
 * 第一行是一个正整数N (1 <= N <= 50000), 表示全排列的规模。
 * 第二行是N个不同的数字Pi(1 <= Pi <= N)， 表示这N个数字的某一全排列。
 * <p>
 * 输出格式：
 * 输出一个整数，表示不同连号区间的数目。
 * <p>
 * 示例：
 * 用户输入：
 * 4
 * 3 2 4 1
 * <p>
 * 程序应输出：
 * 7
 * <p>
 * 用户输入：
 * 5
 * 3 4 2 5 1
 * <p>
 * 程序应输出：
 * 9
 * <p>
 * 解释：
 * 第一个用例中，有7个连号区间分别是：[1,1], [1,2], [1,3], [1,4], [2,2], [3,3], [4,4]
 * 第二个用例中，有9个连号区间分别是：[1,1], [1,2], [1,3], [1,4], [1,5], [2,2], [3,3], [4,4], [5,5]
 * <p>
 * <p>
 * 资源约定：
 * 峰值内存消耗（含虚拟机） < 64M
 * CPU消耗  < 5000ms
 * Alke
 * 2020-10-03 18:07
 */
public class _10连号区间数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int max = arr[i];
            int min = arr[i];
            for (int j = i; j < arr.length; j++) {
                max = arr[j] > max ? arr[j] : max;
                min = arr[j] < min ? arr[j] : min;
                if (j == i) ans++;
                else {
                    if (max - min == j - i) ans++;
                }
            }
        }
        System.out.println(ans);

    }
}
