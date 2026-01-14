// Problem: First Non-Repeating Character in a String
// Approach: Frequency count
// Time Complexity: O(n)
// Space Complexity: O(1)

public class FirstNonRepeatingChar {
    public static char firstUniqueChar(String s) {
        int[] freq = new int[256];

        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        for (char c : s.toCharArray()) {
            if (freq[c] == 1) {
                return c;
            }
        }
        return '\0';
    }
}
