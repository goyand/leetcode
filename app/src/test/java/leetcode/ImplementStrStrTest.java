/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImplementStrStrTest {
    @Test
    void example1() {
        // setup
        ImplementStrStr sol = new ImplementStrStr();
        String haystack = "hello", needle = "ll";
        // execute
        int actual = sol.strStr(haystack, needle);
        // verify
        assertEquals(2, actual);
    }

    @Test
    void example2() {
        // setup
        ImplementStrStr sol = new ImplementStrStr();
        String haystack = "aaaaa", needle = "bba";
        // execute
        int actual = sol.strStr(haystack, needle);
        // verify
        assertEquals(-1, actual);
    }

    @Test
    void example3() {
        // setup
        ImplementStrStr sol = new ImplementStrStr();
        String haystack = "aaaaa", needle = "";
        // execute
        int actual = sol.strStr(haystack, needle);
        // verify
        assertEquals(0, actual);
    }

    @Test
    void example4() {
        // setup
        ImplementStrStr sol = new ImplementStrStr();
        String haystack = "hellohelllo", needle = "ll";
        // execute
        int actual = sol.strStr(haystack, needle);
        // verify
        assertEquals(2, actual);
    }

    @Test
    void example5() {
        // setup
        ImplementStrStr sol = new ImplementStrStr();
        String haystack = "hellohelllo", needle = "lll";
        // execute
        int actual = sol.strStr(haystack, needle);
        // verify
        assertEquals(7, actual);
    }

    @Test
    void example6() {
        // setup
        ImplementStrStr sol = new ImplementStrStr();
        String haystack = "a", needle = "a";
        // execute
        int actual = sol.strStr(haystack, needle);
        // verify
        assertEquals(0, actual);
    }

    @Test
    void example7() {
        // setup
        ImplementStrStr sol = new ImplementStrStr();
        String haystack = "mississippi", needle = "issip";
        // execute
        int actual = sol.strStr(haystack, needle);
        // verify
        assertEquals(4, actual);
    }
}