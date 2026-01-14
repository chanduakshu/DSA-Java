// Problem: Generate Binary Numbers from 1 to N
// Approach: Queue
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumbers {
    public static void generateBinary(int n) {
        Queue<String> q = new LinkedList<>();
        q.add("1");

        for (int i = 1; i <= n; i++) {
            String curr = q.poll();
            System.out.print(curr + " ");

            q.add(curr + "0");
            q.add(curr + "1");
        }
    }
}
