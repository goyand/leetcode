/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

class MergeSortedArrayTest {

    @ParameterizedTest
    @MethodSource("provider")
    void test(int[] nums1, int m, int[] nums2, int n, int[] expected) {
        // setup
        MergeSortedArray sol = new MergeSortedArray();
        // execute
        sol.merge(nums1, m, nums2, n);
        // verify
        assertArrayEquals(expected, nums1);
    }

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 1, 2, 3, 0, 0, 0 }, 3, new int[] { 2, 5, 6 }, 3,
                        new int[] { 1, 2, 2, 3, 5, 6 }), //
                Arguments.of(new int[] { 1 }, 1, new int[] {}, 0, new int[] { 1 }), //
                Arguments.of(new int[] { 0 }, 0, new int[] { 1 }, 1, new int[] { 1 }), //
                Arguments.of(new int[] { -1, 0, 0 }, 2, new int[] { 1 }, 1, new int[] { -1, 0, 1 }), //
                Arguments.of(new int[] { 0, 0 }, 1, new int[] { 0 }, 1, new int[] { 0, 0 }) //
        );
    }
}
