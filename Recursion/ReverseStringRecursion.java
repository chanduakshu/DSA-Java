// Problem: Reverse a string using recursion
// Time Complexity: O(n)
// Space Complexity: O(n)

public class ReverseStringRecursion {
    public static String reverse(String s) {
        if (s.isEmpty())
            return s;

        return reverse(s.substring(1)) + s.charAt(0);
    }
}
