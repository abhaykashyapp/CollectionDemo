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

/*A PriorityQueue is a special type of queue where elements are ordered based on their natural priority (lowest value first) or a custom Comparator. Unlike a standard queue, it doesn't just follow "first-in-first-out"; it follows "most-important-out."

Here are the methods available in PriorityQueue:

1. Adding Elements
add(E e) — Inserts element (throws exception if capacity is full).
offer(E e) — Inserts element (returns false if capacity is full).

2. Removing Elements
poll() — Removes and returns the head (highest priority). Returns null if empty.
remove() — Removes and returns the head. Throws exception if empty.
remove(Object o) — Removes a specific element if present.
clear() — Removes all elements.

3. Accessing Elements (Viewing Only)
peek() — Returns the head without removing it. Returns null if empty.
element() — Returns the head without removing it. Throws exception if empty.

4. Inspection & Size
size() — Returns number of elements.
isEmpty() — Checks if the queue is empty.
contains(Object o) — Checks if a specific element exists.

5. Conversion & Iteration
iterator() — Returns an iterator (Note: the iterator does not guarantee any specific order).
toArray() — Returns an array containing all elements.
toArray(T[] a) — Returns an array of a specific type.
spliterator() — (Java 8) Used for parallel processing.

6. Capacity & Sorting
comparator() — Returns the comparator used to order the elements (returns null if natural ordering is used).*/