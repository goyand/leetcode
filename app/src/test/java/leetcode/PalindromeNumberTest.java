package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {

  @Test
  void example1() {
    // setup
    PalindromeNumber sol = new PalindromeNumber();
    int given = 121;
    // execute
    boolean actual = sol.isPalindrome(given);
    // verify
    assertTrue(actual);
  }

  @Test
  void example2() {
    // setup
    PalindromeNumber sol = new PalindromeNumber();
    int given = -121;
    // execute
    boolean actual = sol.isPalindrome(given);
    // verify
    assertFalse(actual);
  }

  @Test
  void example3() {
    // setup
    PalindromeNumber sol = new PalindromeNumber();
    int given = 10;
    // execute
    boolean actual = sol.isPalindrome(given);
    // verify
    assertFalse(actual);
  }

  @Test
  void example4() {
    // setup
    PalindromeNumber sol = new PalindromeNumber();
    int given = 1221;
    // execute
    boolean actual = sol.isPalindrome(given);
    // verify
    assertTrue(actual);
  }

  @Test
  void example5() {
    // setup
    PalindromeNumber sol = new PalindromeNumber();
    int given = (int) Math.pow(2, 31) - 1;
    // execute
    boolean actual = sol.isPalindrome(given);
    // verify
    assertFalse(actual);
  }
}
