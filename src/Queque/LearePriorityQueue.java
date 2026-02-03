package Queque;

import java.util.PriorityQueue;

public class LearePriorityQueue {
    public static void main(String[] args) {
        // Create a PriorityQueue (Default: Min-Heap)
        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        // Adding elements in random order
        numbers.add(45);
        numbers.add(10);
        numbers.add(30);
        numbers.add(5);

        // Accessing the head without removing it
        System.out.println("Head of queue (smallest): " + numbers.peek());

        // Removing elements one by one
        System.out.println("Processing elements:");
        while (!numbers.isEmpty()) {
            // poll() retrieves and removes the highest priority element
            System.out.println(numbers.poll());
        }
    }
}

