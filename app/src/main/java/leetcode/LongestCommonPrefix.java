package leetcode;

class LongestCommonPrefix {
  public String longestCommonPrefix(String[] strs) {
    String current = strs[0];
    for (int i = 1; i < strs.length; i++) {
      String str = strs[i];
      if (str.equals("")) {
        current = "";
        break;
      }
      for (int j = 0; j < Math.min(current.length(), str.length()); j++) {
        if (current.charAt(j) != (str.charAt(j))) {
          current = current.substring(0, j);
          break;
        }
        if (j == str.length() - 1) {
          current = str;
          break;
        }
      }
    }
    return current;
  }
}