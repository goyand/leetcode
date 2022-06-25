/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package leetcode;

public class ValidParentheses {
    public boolean isValid(String s) {
        String stack = "";
        if (s.length() % 2 == 1) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            switch (character) {
                case '(':
                    stack += ")";
                    break;
                case '{':
                    stack += "}";
                    break;
                case '[':
                    stack += "]";
                    break;
                case ')':
                case '}':
                case ']':
                    if (stack.length() == 0 || character != stack.charAt(stack.length() - 1)) {
                        return false;
                    }
                    stack = stack.substring(0, stack.length() - 1);
            }
        }
        return stack.equals("");
    }
}
