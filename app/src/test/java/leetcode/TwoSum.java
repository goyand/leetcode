package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

  @Test
  void example1() {
    TwoSum twoSum = new TwoSum();
    int[] nums = { 2, 7, 11, 15 };
    int target = 9;
    int[] expected = { 0, 1 };
    assertEquals(expected, twoSum.twoSum(nums, target));
  }

  @Test
  void example2() {
    TwoSum twoSum = new TwoSum();
    int[] nums = { 3, 2, 4 };
    int target = 6;
    int[] expected = { 1, 2 };
    assertEquals(expected, twoSum.twoSum(nums, target));
  }

  @Test
  void example3() {
    TwoSum twoSum = new TwoSum();
    int[] nums = { 3, 3 };
    int target = 6;
    int[] expected = { 0, 1 };
    assertEquals(expected, twoSum.twoSum(nums, target));
  }
}
