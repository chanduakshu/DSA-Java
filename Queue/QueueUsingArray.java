// Problem: Implement Queue using Array
// Approach: Circular Queue
// Time Complexity: O(1) for enqueue & dequeue
// Space Complexity: O(n)

public class QueueUsingArray {
    int[] arr;
    int front, rear, size, capacity;

    public QueueUsingArray(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int data) {
        if (size == capacity) return;

        rear = (rear + 1) % capacity;
        arr[rear] = data;
        size++;
    }

    public int dequeue() {
        if (size == 0) return -1;

        int val = arr[front];
        front = (front + 1) % capacity;
        size--;
        return val;
    }
}
