package leetcode;

public class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode() {
  }

  TreeNode(int val) {
    this.val = val;
  }

  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }

  @Override
  public String toString() {
    return "val=" + this.val //
        + (this.left != null ? ", left={ " + this.left.toString() + " }" : "") //
        + (this.right != null ? ", right={ " + this.right.toString() + " }" : "");
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this)
      return true;
    if (obj instanceof TreeNode) {
      TreeNode treeNode = (TreeNode) obj;
      if (this.val == treeNode.val) {
        if (this.left == null && treeNode.left == null) {
          if (this.right == null && treeNode.right == null) {
            return true;
          }
          if (this.right != null && treeNode.right != null && this.right.equals(treeNode.right)) {
            return true;
          }
        } else if (this.right == null && treeNode.right == null) {
          if (this.left == null && treeNode.left == null) {
            return true;
          }
          if (this.left != null && treeNode.left != null && this.left.equals(treeNode.left)) {
            return true;
          }
        } else if (this.left != null && treeNode.left != null && this.right != null && treeNode.right != null) {
          return this.left.equals(treeNode.left) && this.right.equals(treeNode.right);
        }
      }
    }
    return false;
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + val;
    result = 31 * result + (left != null ? left.hashCode() : 0) + (right != null ? right.hashCode() : 0);
    return result;
  }
}
