package leetCode;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * 给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。

  

 示例 1：

 输入：nums1 = [1,3], nums2 = [2]
 输出：2.00000
 解释：合并数组 = [1,2,3] ，中位数 2
 示例 2：

 输入：nums1 = [1,2], nums2 = [3,4]
 输出：2.50000
 解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
 示例 3：

 输入：nums1 = [0,0], nums2 = [0,0]
 输出：0.00000
 示例 4：

 输入：nums1 = [], nums2 = [1]
 输出：1.00000
 示例 5：

 输入：nums1 = [2], nums2 = []
 输出：2.00000
  

 提示：

 nums1.length == m
 nums2.length == n
 0 <= m <= 1000
 0 <= n <= 1000
 1 <= m + n <= 2000
 -106 <= nums1[i], nums2[i] <= 106
  

 进阶：你能设计一个时间复杂度为 O(log (m+n)) 的算法解决此问题吗？


 */
public class 寻找两个正序数组中的中位数 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
        int len1 = nums1.length;
        int len2 = nums2.length;

        int i = 0;
        int j = 0;
        int k = 0;
        int[] newArr = new int[len1+len2];

        while (i!=len1 && j!=len2)
        {
            if(nums1[i]<=nums2[j])
                newArr[k++] = nums1[i++];
            else
                newArr[k++] = nums2[j++];
        }

        while (i!=len1)
            newArr[k++] = nums1[i++];
        while (j!=len2)
            newArr[k++] = nums2[j++];

        return (newArr[newArr.length/2] + newArr[(newArr.length-1)/2])*0.5;

    }

    public static void main(String[] args) {

    }
}
