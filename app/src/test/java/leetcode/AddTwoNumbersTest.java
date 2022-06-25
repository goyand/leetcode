package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {

  @Test
  void example1() {
    // setup
    AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
    ListNode list1_3 = new ListNode(3);
    ListNode list1_2 = new ListNode(4, list1_3);
    ListNode list1_1 = new ListNode(2, list1_2);

    ListNode list2_3 = new ListNode(4);
    ListNode list2_2 = new ListNode(6, list2_3);
    ListNode list2_1 = new ListNode(5, list2_2);

    ListNode list3_3 = new ListNode(8);
    ListNode list3_2 = new ListNode(0, list3_3);
    ListNode list3_1 = new ListNode(7, list3_2);

    ListNode actual = addTwoNumbers.addTwoNumbers(list1_1, list2_1);

    assertEquals(list3_1.val, actual.val);
    assertEquals(list3_2.val, actual.next.val);
    assertEquals(list3_3.val, actual.next.next.val);
  }

  @Test
  void example2() {
    // setup
    AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
    ListNode list1_1 = new ListNode(0);

    ListNode list2_1 = new ListNode(0);

    ListNode list3_1 = new ListNode(0);

    ListNode actual = addTwoNumbers.addTwoNumbers(list1_1, list2_1);

    assertEquals(list3_1.val, actual.val);
  }

  @Test
  void example3() {
    // setup
    AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
    ListNode list1_7 = new ListNode(9);
    ListNode list1_6 = new ListNode(9, list1_7);
    ListNode list1_5 = new ListNode(9, list1_6);
    ListNode list1_4 = new ListNode(9, list1_5);
    ListNode list1_3 = new ListNode(9, list1_4);
    ListNode list1_2 = new ListNode(9, list1_3);
    ListNode list1_1 = new ListNode(9, list1_2);

    ListNode list2_4 = new ListNode(9);
    ListNode list2_3 = new ListNode(9, list2_4);
    ListNode list2_2 = new ListNode(9, list2_3);
    ListNode list2_1 = new ListNode(9, list2_2);

    ListNode list3_8 = new ListNode(1);
    ListNode list3_7 = new ListNode(0, list3_8);
    ListNode list3_6 = new ListNode(0, list3_7);
    ListNode list3_5 = new ListNode(0, list3_6);
    ListNode list3_4 = new ListNode(9, list3_5);
    ListNode list3_3 = new ListNode(9, list3_4);
    ListNode list3_2 = new ListNode(9, list3_3);
    ListNode list3_1 = new ListNode(8, list3_2);

    ListNode actual = addTwoNumbers.addTwoNumbers(list1_1, list2_1);

    assertEquals(list3_1.val, actual.val);
    assertEquals(list3_2.val, actual.next.val);
    assertEquals(list3_3.val, actual.next.next.val);
    assertEquals(list3_4.val, actual.next.next.next.val);
    assertEquals(list3_5.val, actual.next.next.next.next.val);
    assertEquals(list3_6.val, actual.next.next.next.next.next.val);
    assertEquals(list3_7.val, actual.next.next.next.next.next.next.val);
    assertEquals(list3_8.val, actual.next.next.next.next.next.next.next.val);
  }

}
