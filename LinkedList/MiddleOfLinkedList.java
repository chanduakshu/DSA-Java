// Problem: Find Middle of Linked List
// Approach: Slow & Fast Pointer
// Time Complexity: O(n)
// Space Complexity: O(1)

public class MiddleOfLinkedList {
    public static ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
