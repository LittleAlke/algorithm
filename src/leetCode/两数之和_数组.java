package leetCode;

/**
 * :
 * Alke
 * 2021-02-09 17:15
 */
public class 两数之和_数组 {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= target) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (j < nums.length && nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(twoSum(new int[]{2, 7, 11, 15}, 9)[0]);
        System.out.println(twoSum(new int[]{2, 7, 11, 15}, 9)[1]);
    }
}
