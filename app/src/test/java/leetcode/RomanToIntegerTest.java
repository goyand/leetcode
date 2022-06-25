package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {

  @Test
  void example1() {
    // setup
    RomanToInteger sol = new RomanToInteger();
    String given = "III";
    // execute
    int actual = sol.romanToInt(given);
    // verify
    assertEquals(3, actual);
  }

  @Test
  void example2() {
    // setup
    RomanToInteger sol = new RomanToInteger();
    String given = "LVIII";
    // execute
    int actual = sol.romanToInt(given);
    // verify
    assertEquals(58, actual);
  }

  @Test
  void example3() {
    // setup
    RomanToInteger sol = new RomanToInteger();
    String given = "MCMXCIV";
    // execute
    int actual = sol.romanToInt(given);
    // verify
    assertEquals(1994, actual);
  }
}
