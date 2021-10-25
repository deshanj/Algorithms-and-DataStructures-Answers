// Question
/*
 * Given an array of integers nums and an integer target, return indices of the
 * two numbers such that they add up to target.
 * 
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 * 
 * You can return the answer in any order.
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [2,7,11,15], target = 9 Output: [0,1] Output: Because nums[0] +
 * nums[1] == 9, we return [0, 1]. Example 2:
 * 
 * Input: nums = [3,2,4], target = 6 Output: [1,2] Example 3:
 * 
 * Input: nums = [3,3], target = 6 Output: [0,1]
 * 
 * Constraints: 2 <= nums.length <= 104 -109 <= nums[i] <= 109 -109 <= target <=
 * 109 Only one valid answer exists.
 */
public class TwoSums {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 5, 3 };
        int[] output = TwoSum(nums, 8);
        System.out.println(output[0]);
        System.out.println(output[1]);

    }

    public static int[] TwoSum(int[] nums, int target) {
        int[] output = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    if ((nums[i] + nums[j]) == target) {
                        output[0] = i;
                        output[1] = j;
                    }
                }
            }
        }
        return output;
    }
}
