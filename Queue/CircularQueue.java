// Problem: Implement Circular Queue
// Approach: Array + Modulo
// Time Complexity: O(1)
// Space Complexity: O(n)

public class CircularQueue {
    int[] arr;
    int front, rear, size, capacity;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean enqueue(int value) {
        if (size == capacity) return false;

        rear = (rear + 1) % capacity;
        arr[rear] = value;
        size++;
        return true;
    }

    public int dequeue() {
        if (size == 0) return -1;

        int val = arr[front];
        front = (front + 1) % capacity;
        size--;
        return val;
    }
}
