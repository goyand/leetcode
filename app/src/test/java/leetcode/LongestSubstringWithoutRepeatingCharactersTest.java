package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharactersTest {

  @Test
  void example1() {
    LongestSubstringWithoutRepeatingCharacters solClass = new LongestSubstringWithoutRepeatingCharacters();
    String s = "abcabcbb";
    assertEquals(3, solClass.lengthOfLongestSubstring(s));
  }

  @Test
  void example2() {
    LongestSubstringWithoutRepeatingCharacters solClass = new LongestSubstringWithoutRepeatingCharacters();
    String s = "bbbbb";
    assertEquals(1, solClass.lengthOfLongestSubstring(s));
  }

  @Test
  void example3() {
    LongestSubstringWithoutRepeatingCharacters solClass = new LongestSubstringWithoutRepeatingCharacters();
    String s = "pwwkew";
    assertEquals(3, solClass.lengthOfLongestSubstring(s));
  }

  @Test
  void example4() {
    LongestSubstringWithoutRepeatingCharacters solClass = new LongestSubstringWithoutRepeatingCharacters();
    String s = "abcb";
    assertEquals(3, solClass.lengthOfLongestSubstring(s));
  }
}
