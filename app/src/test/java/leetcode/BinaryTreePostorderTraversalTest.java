/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.google.common.collect.Lists;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.stream.Stream;

class BinaryTreePostorderTraversalTest {
  @ParameterizedTest
  @MethodSource("provider")
  void test(TreeNode root, List<Integer> expected) {
    // setup
    BinaryTreePostorderTraversal sol = new BinaryTreePostorderTraversal();
    // execute
    List<Integer> actual = sol.postorderTraversal(root);
    // verify
    assertEquals(expected, actual);
  }

  static Stream<Arguments> provider() {
    return Stream.of(
        Arguments.of(
            new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null)),
            Lists.newArrayList(3, 2, 1)), //
        Arguments.of(
            null,
            Lists.newArrayList()), //
        Arguments.of(
            new TreeNode(1),
            Lists.newArrayList(1)), //
        Arguments.of(
            new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(2, new TreeNode(3), new TreeNode(4))),
            Lists.newArrayList(3, 4, 2, 3, 4, 2, 1)) //
    );
  }
}