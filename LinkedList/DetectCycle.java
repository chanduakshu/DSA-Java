// Problem: Detect Cycle in Linked List
// Approach: Floyd’s Cycle Detection (Tortoise & Hare)
// Time Complexity: O(n)
// Space Complexity: O(1)

public class DetectCycle {
    public static boolean hasCycle(ListNode head) {
        if (head == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) return true;
        }
        return false;
    }
}
