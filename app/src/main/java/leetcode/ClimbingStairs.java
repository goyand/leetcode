/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package leetcode;

public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        int x = 1, y = 1, tmp = 0, i = 1;
        while (i < n) {
            tmp = x;
            x = y;
            y = x + tmp;
            i++;
        }
        return y;
    }
}
