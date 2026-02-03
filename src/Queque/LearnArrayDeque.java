package Queque;

import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();

        // --- 1. Using it as a QUEUE (FIFO: First-In, First-Out) ---
        deque.addLast("User1");
        deque.addLast("User2");
        deque.addLast("User3");

        System.out.println("Queue Front: " + deque.peekFirst()); // User1
        System.out.println("Processing: " + deque.pollFirst()); // Removes User1

        // --- 2. Using it as a STACK (LIFO: Last-In, First-Out) ---
        deque.push("Action1");
        deque.push("Action2");

        System.out.println("Top of Stack: " + deque.peek()); // Action2
        System.out.println("Popping: " + deque.pop());      // Removes Action2
    }
}