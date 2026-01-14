// Problem: First Non-Repeating Character in a Stream
// Approach: Queue + Frequency Array
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeatingStream {
    public static void findFirstNonRepeating(String stream) {
        int[] freq = new int[256];
        Queue<Character> q = new LinkedList<>();

        for (char ch : stream.toCharArray()) {
            freq[ch]++;
            q.add(ch);

            while (!q.isEmpty() && freq[q.peek()] > 1) {
                q.poll();
            }

            if (q.isEmpty())
                System.out.print("-1 ");
            else
                System.out.print(q.peek() + " ");
        }
    }
}
