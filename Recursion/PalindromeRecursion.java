// Problem: Check if a string is palindrome using recursion
// Time Complexity: O(n)
// Space Complexity: O(n)

public class PalindromeRecursion {
    public static boolean isPalindrome(String s, int left, int right) {
        if (left >= right)
            return true;

        if (s.charAt(left) != s.charAt(right))
            return false;

        return isPalindrome(s, left + 1, right - 1);
    }
}
