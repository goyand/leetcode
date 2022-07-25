/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {
  public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    postorder(root, result);
    return result;
  }

  private void postorder(TreeNode root, List<Integer> list) {
    if (root == null) {
      return;
    }
    postorder(root.left, list);
    postorder(root.right, list);
    list.add(root.val);
  }
}
