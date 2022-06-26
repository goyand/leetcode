/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package leetcode;

public class MaxSubArray {

    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int curMax = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                continue;
            }

            curMax = Math.max(curMax + nums[i], nums[i]);
            res = Math.max(res, curMax);
        }
        return res;
    }
}
