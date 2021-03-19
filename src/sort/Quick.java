package sort;

import java.util.Arrays;

/**
 * 快速排序
 * Alke
 * 2021-03-12 17:45
 */
public class Quick {
    public static void quick(int[] arr,int l,int r){
        if (l>=r) return;
        int left = l;
        int right = r;
        int p = arr[left];
        while (left<right){
            while (left<right&&arr[right]>=p){
                right--;
            }
            if (left<right){
                arr[left] = arr[right];
            }
            while (left<right&&arr[left]<=p){
                left++;
            }
            if (left<right){
                arr[right] = arr[left];
            }
            if (left>=right){
                arr[left] = p;
            }
        }
        quick(arr,l,right-1);
        quick(arr,right+1,r);
    }

    public static void main(String[] args) {
        int[] a = new int[]{5,6,1,53,8,8,46,18,87,654,64,5,5,6554,554,1,51};
        System.out.println(Arrays.toString(a));
        quick(a,0,a.length-1);
        System.out.println(Arrays.toString(a));

    }
}
