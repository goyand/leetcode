package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LongestSubstringWithoutRepeatingCharacters {
  public int lengthOfLongestSubstring(String s) {
    // list of chars in input string.
    Set<Character> chars = s.chars().mapToObj(item -> (char) item).collect(Collectors.toSet());

    Set<String> words = new HashSet<>();
    words.add(s);
    System.out.println(chars);

    for (Character separator : chars) {
      words = split(words, separator);
      System.out.println(words);
    }

    if (words.size() == 0) {
      return 0;
    }
    return words.stream().max(Comparator.comparingInt(String::length)).get().length();
  }

  public Set<String> split(Set<String> input, Character separator) {
    Set<String> result = new HashSet<>();
    List<String> splitStr = null;
    for (String word : input) {
      System.out.println(result);
      if (!hasMoreThanOneChar(word, separator)) {
        result.add(word);
        continue;
      }
      splitStr = new ArrayList<>(Arrays.asList(word.split(Character.toString(separator))));
      if (splitStr.size() == 0) {
        result.add(Character.toString(separator));
        continue;
      }

      result.addAll(splitStr.stream()
          .map(chunk -> chunk + Character.toString(separator)).collect(Collectors.toSet()));
    }
    return result;
  }

  public boolean hasMoreThanOneChar(String str, Character ch) {
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == ch) {
        count++;
      }
      if (count > 1) {
        return true;
      }
    }
    return false;
  }
}