// Problem: Implement Stack using Array
// Time Complexity: O(1)
// Space Complexity: O(n)

public class StackUsingArray {
    int[] stack;
    int top;
    int capacity;

    public StackUsingArray(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;
    }

    public void push(int x) {
        if (top == capacity - 1) return;
        stack[++top] = x;
    }

    public int pop() {
        if (top == -1) return -1;
        return stack[top--];
    }

    public int peek() {
        if (top == -1) return -1;
        return stack[top];
    }
}
