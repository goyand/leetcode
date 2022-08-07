/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

class NumberOf1BitsTest {

  @ParameterizedTest
  @MethodSource("provider")
  void test(int input, int expected) {
    // setup
    NumberOf1Bits sol = new NumberOf1Bits();
    // execute
    int actual = sol.hammingWeight(input);
    // verify
    assertEquals(expected, actual);
  }

  static Stream<Arguments> provider() {
    return Stream.of( //
        Arguments.of(11, 3), //
        Arguments.of(128, 1), //
        Arguments.of(-3, 31) //
    );
  }
}
