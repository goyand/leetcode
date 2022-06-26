/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package leetcode;

public class MaxSubArray {
    int max;

    public int maxSubArray(int[] nums) {
        this.max = nums[0];
        findMax(nums, nums.length - 1);
        return this.max;
    }

    public int findMax(int[] nums, int k) {
        if (k == 0) {
            return nums[0];
        }

        int curMax = findMax(nums, k - 1) + nums[k];
        int ans = Math.max(curMax, nums[k]);
        this.max = Math.max(this.max, ans);
        return ans;
    }
}
