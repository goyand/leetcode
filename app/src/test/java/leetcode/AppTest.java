/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void example1() {
        // setup
        App sol = new App();
        // execute
        String actual = sol.getGreeting();
        // verify
        assertNotNull(actual, "app should have a greeting");
    }
}
