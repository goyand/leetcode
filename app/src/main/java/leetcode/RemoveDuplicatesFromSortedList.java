/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package leetcode;

public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return null;

        ListNode dummy = new ListNode(-1, head);
        ListNode cur = dummy.next;
        while (true) {
            if (cur.next == null) {
                break;
            }
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return dummy.next;
    }
}
