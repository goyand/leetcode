package leetcode;

class PalindromeNumber {
  public boolean isPalindrome(int x) {
    int original = x;
    int current = x;
    int reversed = 0;

    if (x < 0) {
      return false;
    }

    while (true) {
      int remaining = current % 10;
      current = current / 10;
      reversed = reversed * 10 + remaining;
      if (current == 0) {
        break;
      }
    }

    return original - reversed == 0;
  }
}