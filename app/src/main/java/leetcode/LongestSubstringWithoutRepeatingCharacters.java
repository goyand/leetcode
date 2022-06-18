package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LongestSubstringWithoutRepeatingCharacters {

  private static final List<String> PATTERNS = new ArrayList<>(
      Arrays.asList("(", ")", "*", "+", "?", "[", "]", "\\", "{", "}"));

  public int lengthOfLongestSubstring(String s) {
    // 1. 文字列の途中で、2つのcharに挟まれており、重複する文字列がない
    // 2. 文頭からcharの重複を許さずに取得できる最長文字列
    // 3. 文末からcharの重複を許さずに取得できる最長文字列

    // change string to char list.
    Set<Character> chars = s.chars().mapToObj(item -> (char) item).collect(Collectors.toSet());

    int maxLength = 0;

    // 1.
    for (Character c : chars) {
      String letter = Character.toString(c);
      if (PATTERNS.contains(letter)) {
        letter = "\\" + Character.toString(c);
      }

      maxLength = Math.max(maxLength, longestUniqueWordCountBetweenChars(letter, s));
    }

    List<Character> charList = s.chars().mapToObj(item -> (char) item).collect(Collectors.toList());
    // 2.
    maxLength = Math.max(maxLength, longestFromLeft(charList));
    // 3.
    maxLength = Math.max(maxLength, longestFromRight(charList));

    return maxLength;
  }

  public int longestFromLeft(List<Character> characters) {
    Set<Character> charSet = new HashSet<>();
    for (int i = 0; i < characters.size(); i++) {
      if (charSet.contains(characters.get(i))) {
        break;
      }
      charSet.add(characters.get(i));
    }
    return charSet.size();
  }

  public int longestFromRight(List<Character> characters) {
    Set<Character> charSet = new HashSet<>();
    for (int i = characters.size() - 1; i >= 0; i--) {
      if (charSet.contains(characters.get(i))) {
        break;
      }
      charSet.add(characters.get(i));
    }
    return charSet.size();
  }

  public int longestUniqueWordCountBetweenChars(String letter, String str) {
    List<String> splitWords = Arrays.asList(str.split(letter));
    if (splitWords.size() == 0) {
      return 1;
    }

    int maxLength = 1;
    for (int i = 0; i < splitWords.size(); i++) {
      List<Character> wordChars = splitWords.get(i).chars().mapToObj(item -> (char) item).collect(Collectors.toList());
      if (i != 0) {
        maxLength = Math.max(maxLength, longestFromLeft(wordChars) + 1);
      }
      if (i != splitWords.size() - 1) {
        maxLength = Math.max(maxLength, longestFromRight(wordChars) + 1);
      }
      if (wordChars.size() != wordChars.stream().distinct().count()) {
        // 重複チェック
        continue;
      }
      maxLength = Math.max(maxLength, wordChars.size() + 1);
    }
    return maxLength;
  }
}