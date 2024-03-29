/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package leetcode;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (!addupOne(digits, i)) {
                break;
            }
            if (i == 0) {
                return slideDigits(digits);
            }
        }
        return digits;
    }

    private boolean addupOne(int[] digits, int index) {
        if (digits[index] == 9) {
            digits[index] = 0;
            return true;
        } else {
            digits[index] = digits[index] + 1;
            return false;
        }
    }

    private int[] slideDigits(int[] digits) {
        int[] newDigits = new int[digits.length + 1];
        for (int i = 0; i < newDigits.length; i++) {
            if (i == 0) {
                newDigits[i] = 1;
            } else {
                newDigits[i] = digits[i - 1];
            }
        }
        return newDigits;
    }
}
