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

  // @Override
  // public boolean equals(Object obj) {
  // if (obj == this)
  // return true;
  // if (obj instanceof TreeNode) {
  // TreeNode treeNode = (TreeNode) obj;
  // if (this.val == treeNode.val) {
  // if (this.left != null && treeNode.left == null) {
  // return true;
  // }
  // if (this.next != null && treeNode.next != null &&
  // this.next.equals(treeNode.next)) {
  // return true;
  // }
  // }
  // return false;
  // }
  // return false;
  // }

  // @Override
  // public int hashCode() {
  // int result = 17;
  // result = 31 * result + val;
  // result = 31 * result + (next != null ? next.hashCode() : 0);
  // return result;
  // }
}
