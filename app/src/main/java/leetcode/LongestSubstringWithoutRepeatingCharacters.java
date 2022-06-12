package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LongestSubstringWithoutRepeatingCharacters {
  public int lengthOfLongestSubstring(String s) {
    // list of chars in input string.
    List<Character> charList = s.chars().mapToObj(item -> (char) item).collect(Collectors.toList());
    List<Character> maxLengthWord = new ArrayList<>();

    for (int i = 0; i < charList.size(); i++) {
      List<Character> subList = charList.subList(i, charList.size());
      List<Character> foundList = findLongestWord(subList);
      if (foundList.size() > maxLengthWord.size()) {
        maxLengthWord = foundList;
      }
    }

    return maxLengthWord.size();
  }

  public List<Character> findLongestWord(List<Character> input) {
    List<Character> maxLengthWord = new ArrayList<>();
    List<Character> output = new ArrayList<>();
    for (Character chr : input) {
      if (output.contains(chr)) {
        if (output.size() >= maxLengthWord.size()) {
          maxLengthWord = output;
        }
        output = new ArrayList<>();
        continue;
      }
      output.add(chr);
    }
    return maxLengthWord.size() == 0 ? output : maxLengthWord;
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