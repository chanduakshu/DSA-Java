// Problem: Reverse a String
// Approach: Two-pointer
// Time Complexity: O(n)
// Space Complexity: O(1)

public class ReverseString {
    public static String reverse(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }
}
