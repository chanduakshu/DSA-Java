// Problem: Find nth Fibonacci number
// Approach: Recursion
// Time Complexity: O(2^n)
// Space Complexity: O(n)

public class Fibonacci {
    public static int fib(int n) {
        if (n <= 1)
            return n;

        return fib(n - 1) + fib(n - 2);
    }
}
