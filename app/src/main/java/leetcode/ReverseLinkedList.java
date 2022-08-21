/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package leetcode;

public class ReverseLinkedList {

  // Method 1
  public ListNode reverseList(ListNode head) {
    if (head == null) {
      return null;
    }
    ListNode result = new ListNode(head.val);
    head = head.next;
    while (head != null) {
      result = new ListNode(head.val, result);
      head = head.next;
    }
    return result;
  }
}
