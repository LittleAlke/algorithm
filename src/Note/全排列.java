package Note;

/**
 * :
 * Alke
 * 2020-10-03 12:45
 */
public class 全排列 {
    static int arr2[] = {1, 1, 2, 3, 4, 4};

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //不带重复的
        f(arr, 0);

        //有重复的
        int[] path = new int[arr2.length];
        f2(path, 0);
    }

    //带重复元素的全排列
    static boolean[] vis = new boolean[arr2.length]; //标记是否用过这个元素

    private static void f2(int path[], int k) {
        if (k == path.length) {
            //排列完毕
//            if(check(path)){
//        }
        }
        for (int i = 0; i < path.length; i++) {
            if (i > 0 && path[i] == path[i - 1] && !vis[i - 1]) continue;//待选元素和上一个元素相同且上一个还没用过
            if (!vis[i]) {//未被用过的元素
                vis[i] = true;//标记已用了
                path[i] = arr2[i];//填入对应的元素
                f(path, k + 1);//递归
                vis[i] = false;//回溯
            }
        }
    }

    //没有重复的全排列
    private static void f(int[] arr, int k) {
        if (k == arr.length) {
            //排列完毕，可以开始进行判断
        }
        for (int i = k; i < arr.length; i++) {
            int t = arr[i];
            arr[i] = arr[k];
            arr[k] = t;

            f(arr, k + 1);

            t = arr[i];
            arr[i] = arr[k];
            arr[k] = t;

        }
    }
}
