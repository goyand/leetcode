/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package leetcode;

public class SingleNumber {
  public int singleNumber(int[] nums) {
    int res = nums[0];
    for (int i = 1; i < nums.length; ++i) {
      res ^= nums[i];
    }
    return res;
  }
}
