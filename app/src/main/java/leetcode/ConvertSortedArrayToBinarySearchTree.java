/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package leetcode;

public class ConvertSortedArrayToBinarySearchTree {
  public TreeNode sortedArrayToBST(int[] nums) {
    return getTree(0, nums.length - 1, nums);
  }

  private TreeNode getTree(int startIndex, int endIndex, int[] nums) {
    int centerIndex = (startIndex + endIndex) / 2;
    return new TreeNode(nums[centerIndex],
        startIndex == centerIndex ? null : getTree(startIndex, centerIndex - 1, nums),
        endIndex == centerIndex ? null : getTree(centerIndex + 1, endIndex, nums));
  }
}
