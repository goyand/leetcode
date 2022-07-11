/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

class SymmetricTreeTest {
  @ParameterizedTest
  @MethodSource("provider")
  void test(TreeNode root, boolean expected) {
    // setup
    SymmetricTree sol = new SymmetricTree();
    // execute
    boolean actual = sol.isSymmetric(root);
    // verify
    assertEquals(expected, actual);
  }

  static Stream<Arguments> provider() {
    return Stream.of(
        Arguments.of(
            new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(2, new TreeNode(4), new TreeNode(3))),
            true), //
        Arguments.of(
            new TreeNode(1, new TreeNode(2, null, new TreeNode(3)), new TreeNode(2, null, new TreeNode(3))),
            false), //
        Arguments.of(
            new TreeNode(1, new TreeNode(2), new TreeNode(2)),
            true), //
        Arguments.of(
            new TreeNode(1, new TreeNode(2), new TreeNode(3)),
            false), //
        Arguments.of(
            new TreeNode(0),
            true) //
    );
  }
}
