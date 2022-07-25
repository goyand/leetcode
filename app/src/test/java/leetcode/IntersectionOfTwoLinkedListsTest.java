/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionOfTwoLinkedListsTest {

  @Test
  void example1() {
    // setup
    IntersectionOfTwoLinkedLists intersectionOfTwoLinkedLists = new IntersectionOfTwoLinkedLists();
    ListNode common = new ListNode(8, new ListNode(4, new ListNode(5)));
    ListNode listNodeA = new ListNode(4, new ListNode(1, common));
    ListNode listNodeB = new ListNode(5, new ListNode(6, new ListNode(1, common)));

    ListNode actual = intersectionOfTwoLinkedLists.getIntersectionNode(listNodeA, listNodeB);

    assertEquals(common, actual);
  }

  @Test
  void example2() {
    // setup
    IntersectionOfTwoLinkedLists intersectionOfTwoLinkedLists = new IntersectionOfTwoLinkedLists();
    ListNode common = new ListNode(2, new ListNode(4));
    ListNode listNodeA = new ListNode(1, new ListNode(9, new ListNode(1, common)));
    ListNode listNodeB = new ListNode(5, new ListNode(3, common));

    ListNode actual = intersectionOfTwoLinkedLists.getIntersectionNode(listNodeA, listNodeB);

    assertEquals(common, actual);
  }

  @Test
  void example3() {
    // setup
    IntersectionOfTwoLinkedLists intersectionOfTwoLinkedLists = new IntersectionOfTwoLinkedLists();
    ListNode common = null;
    ListNode listNodeA = new ListNode(2, new ListNode(6, new ListNode(4, common)));
    ListNode listNodeB = new ListNode(1, new ListNode(5, common));

    ListNode actual = intersectionOfTwoLinkedLists.getIntersectionNode(listNodeA, listNodeB);

    assertEquals(common, actual);
  }

  @Test
  void example4() {
    // setup
    IntersectionOfTwoLinkedLists intersectionOfTwoLinkedLists = new IntersectionOfTwoLinkedLists();
    ListNode common = new ListNode(8, new ListNode(4, new ListNode(5)));
    ListNode listNodeA = new ListNode(4, new ListNode(1, common));
    ListNode listNodeB = common;

    ListNode actual = intersectionOfTwoLinkedLists.getIntersectionNode(listNodeA, listNodeB);

    assertEquals(common, actual);
  }

  @Test
  void example5() {
    // setup
    IntersectionOfTwoLinkedLists intersectionOfTwoLinkedLists = new IntersectionOfTwoLinkedLists();
    ListNode common = new ListNode(8);
    ListNode listNodeA = common;
    ListNode listNodeB = common;

    ListNode actual = intersectionOfTwoLinkedLists.getIntersectionNode(listNodeA, listNodeB);

    assertEquals(common, actual);
  }
}
