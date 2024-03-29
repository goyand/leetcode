/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

class IsomorphicStringsTest {

  @ParameterizedTest
  @MethodSource("provider")
  void test(String s, String t, boolean expected) {
    // setup
    IsomorphicStrings sol = new IsomorphicStrings();
    // execute
    boolean actual = sol.isIsomorphic(s, t);
    // verify
    assertEquals(expected, actual);
  }

  static Stream<Arguments> provider() {
    return Stream.of( //
        Arguments.of("add", "egg", true), //
        Arguments.of("foo", "bar", false), //
        Arguments.of("paper", "title", true), //
        Arguments.of("paper", "title", true), //
        Arguments.of("badc", "baba", false) //
    );
  }
}
