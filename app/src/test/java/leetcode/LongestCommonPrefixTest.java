package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

  @Test
  void example1() {
    // setup
    LongestCommonPrefix sol = new LongestCommonPrefix();
    String[] given = { "flower", "flow", "flight" };
    // execute
    String actual = sol.longestCommonPrefix(given);
    // verify
    assertEquals("fl", actual);
  }

  @Test
  void example2() {
    // setup
    LongestCommonPrefix sol = new LongestCommonPrefix();
    String[] given = { "dog", "racecar", "car" };
    // execute
    String actual = sol.longestCommonPrefix(given);
    // verify
    assertEquals("", actual);
  }

  @Test
  void example3() {
    // setup
    LongestCommonPrefix sol = new LongestCommonPrefix();
    String[] given = { "ab", "a" };
    // execute
    String actual = sol.longestCommonPrefix(given);
    // verify
    assertEquals("a", actual);
  }

  @Test
  void example4() {
    // setup
    LongestCommonPrefix sol = new LongestCommonPrefix();
    String[] given = { "a", "b" };
    // execute
    String actual = sol.longestCommonPrefix(given);
    // verify
    assertEquals("", actual);
  }

  @Test
  void example5() {
    // setup
    LongestCommonPrefix sol = new LongestCommonPrefix();
    String[] given = { "abab", "aba", "" };
    // execute
    String actual = sol.longestCommonPrefix(given);
    // verify
    assertEquals("", actual);
  }
}
