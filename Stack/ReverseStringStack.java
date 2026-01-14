// Problem: Reverse a string using Stack
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.Stack;

public class ReverseStringStack {
    public static String reverse(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            stack.push(c);
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.toString();
    }
}
