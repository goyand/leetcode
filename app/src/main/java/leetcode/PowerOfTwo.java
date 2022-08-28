/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package leetcode;

public class PowerOfTwo {
  public boolean isPowerOfTwo(int n) {
    if (n == 1) {
      return true;
    }
    if (n <= 0 || n % 2 == 1) {
      return false;
    }
    return isPowerOfTwo(n / 2) && n % 2 == 0;
  }
}