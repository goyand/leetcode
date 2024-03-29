/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

class MinimumDepthOfBinaryTreeTest {
  @ParameterizedTest
  @MethodSource("provider")
  void test(TreeNode p, int expected) {
    // setup
    MinimumDepthOfBinaryTree sol = new MinimumDepthOfBinaryTree();
    // execute
    int actual = sol.minDepth(p);
    // verify
    assertEquals(expected, actual);
  }

  static Stream<Arguments> provider() {
    return Stream.of(
        Arguments.of(
            new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7))),
            2), //
        Arguments.of(
            new TreeNode(2, null, new TreeNode(3, null, new TreeNode(4, null, new TreeNode(5, null, new TreeNode(6))))),
            5), //
        Arguments.of(
            new TreeNode(1, new TreeNode(2), null),
            2), //
        Arguments.of(
            new TreeNode(1),
            1), //
        Arguments.of(
            null,
            0) //
    );
  }
}
