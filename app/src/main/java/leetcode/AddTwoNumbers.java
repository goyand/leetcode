package leetcode;

import java.util.ArrayList;
import java.util.List;

public class AddTwoNumbers {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    List<Integer> results = new ArrayList<>();
    boolean finished = false;
    boolean rankup = false;
    while (!finished) {
      int val1 = l1.val;
      int val2 = l2.val;

      int sum = val1 + val2;
      sum = rankup ? sum + 1 : sum;
      rankup = sum >= 10;
      results.add(sum % 10);

      if (l1.next == null && l2.next == null && !rankup) {
        finished = true;
      }

      l1 = l1.next == null ? new ListNode() : l1.next;
      l2 = l2.next == null ? new ListNode() : l2.next;
    }

    ListNode result = new ListNode();
    for (int i = results.size() - 1; i >= 0; i--) {
      result = i == results.size() - 1 ? new ListNode(results.get(i)) : new ListNode(results.get(i), result);
    }

    return result;
  }
}