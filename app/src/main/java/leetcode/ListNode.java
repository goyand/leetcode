package leetcode;

public class ListNode {
  int val;
  ListNode next;

  ListNode() {
  }

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  @Override
  public String toString() {
    return "val=" + this.val + (this.next != null ? ", " + this.next.toString() : "");
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this)
      return true;
    if (obj instanceof ListNode) {
      ListNode listNode = (ListNode) obj;
      if (this.val == listNode.val) {
        if (this.next == null && listNode.next == null) {
          return true;
        }
        if (this.next != null && listNode.next != null && this.next.equals(listNode.next)) {
          return true;
        }
      }
      return false;
    }
    return false;
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + val;
    result = 31 * result + (next != null ? next.hashCode() : 0);
    return result;
  }
}
