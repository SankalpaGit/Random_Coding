package Day7;

// Queue.java

import java.util.Scanner;

public class Queue {
    private int[] arr;
    private int front, rear, capacity, count;

    // Constructor to initialize the queue
    public Queue(int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    // Method to add an element to the queue
    public void enqueue(int x) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = x;
        count++;
    }

    // Method to remove an element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int x = arr[front];
        front = (front + 1) % capacity;
        count--;
        return x;
    }

    // Method to get the front element of the queue
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return count == 0;
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return count == capacity;
    }

    // Method to print the queue
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Queue elements: ");
            for (int i = 0; i < count; i++) {
                System.out.print(arr[(front + i) % capacity] + " ");
            }
            System.out.println();
        }
    }

    // Main method to test Queue functionality
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of Queue: ");
        int queueSize = sc.nextInt();
        Queue queue = new Queue(queueSize);

        System.out.println("Queue Operations: ");
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.printQueue();

        System.out.println("Dequeued from queue: " + queue.dequeue());
        System.out.println("Peek of queue: " + queue.peek());
        queue.printQueue();
    }
}
