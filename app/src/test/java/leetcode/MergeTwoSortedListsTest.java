/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListsTest {
    @Test
    void example1() {
        // setup
        MergeTwoSortedLists sol = new MergeTwoSortedLists();
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode expected = new ListNode(1,
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))));
        // execute
        ListNode actual = sol.mergeTwoLists(list1, list2);
        // verify
        assertEquals(expected, actual);
    }

    @Test
    void example2() {
        // setup
        MergeTwoSortedLists sol = new MergeTwoSortedLists();
        ListNode list1 = null;
        ListNode list2 = null;
        ListNode expected = null;
        // execute
        ListNode actual = sol.mergeTwoLists(list1, list2);
        // verify
        assertEquals(expected, actual);
    }

    @Test
    void example3() {
        // setup
        MergeTwoSortedLists sol = new MergeTwoSortedLists();
        ListNode list1 = null;
        ListNode list2 = new ListNode(0);
        ListNode expected = new ListNode(0);
        // execute
        ListNode actual = sol.mergeTwoLists(list1, list2);
        // verify
        assertEquals(expected, actual);
    }
}
