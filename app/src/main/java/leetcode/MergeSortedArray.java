/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package leetcode;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int mergedLength = m + n;

        for (int i = mergedLength - 1; i >= 0; i--) {
            if (m == 0) {
                nums1[i] = nums2[n - 1];
                n--;
                continue;
            }
            if (n == 0) {
                nums1[i] = nums1[m - 1];
                m--;
                continue;
            }

            if (nums1[m - 1] >= nums2[n - 1]) {
                nums1[i] = nums1[m - 1];
                m--;
            } else {
                nums1[i] = nums2[n - 1];
                n--;
            }
        }
    }
}