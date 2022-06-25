package leetcode;

import java.util.HashMap;
import java.util.Map;

class RomanToInteger {

  /**
   * map roman char to integer
   */
  private final Map<Character, Integer> romanMap = new HashMap<>() {
    {
      put('I', 1);
      put('V', 5);
      put('X', 10);
      put('L', 50);
      put('C', 100);
      put('D', 500);
      put('M', 1000);
    }
  };

  /**
   * map roman char and subsequent roman char as total should be substracted
   */
  private final Map<Character, Character> minusCharMap = new HashMap<>() {
    {
      put('I', ' ');
      put('V', 'I');
      put('X', 'I');
      put('L', 'X');
      put('C', 'X');
      put('D', 'C');
      put('M', 'C');
    }
  };

  public int romanToInt(String s) {
    int result = 0;
    for (int i = s.length() - 1; i >= 0; i--) {
      char character = s.charAt(i);
      if (i != s.length() - 1) {
        char prevCharacter = s.charAt(i + 1);
        if (minusCharMap.get(prevCharacter).equals(character)) {
          result = result - romanMap.get(character);
          continue;
        }
      }
      result = result + romanMap.get(character);
    }
    return result;
  }
}