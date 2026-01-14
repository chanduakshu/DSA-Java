// Problem: Print numbers from 1 to N using recursion
// Time Complexity: O(n)
// Space Complexity: O(n)

public class Print1ToN {
    public static void print(int n) {
        if (n == 0)
            return;

        print(n - 1);
        System.out.print(n + " ");
    }
}
