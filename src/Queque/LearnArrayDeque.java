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

/*
* An ArrayDeque (Array Double-Ended Queue) is a high-performance, resizable array implementation of the Deque interface. It is faster than Stack when used as a stack and faster than LinkedList when used as a queue because it has no overhead of node objects.

It does not allow null elements.
1. Adding Elements (Head & Tail)
addFirst(E e) — Inserts at the front (throws exception if full).
addLast(E e) — Inserts at the end (throws exception if full).
offerFirst(E e) — Inserts at the front (returns false if full).
offerLast(E e) — Inserts at the end (returns false if full).
add(E e) — Same as addLast.
offer(E e) — Same as offerLast.

2. Removing Elements (Head & Tail)
removeFirst() — Removes from front (throws exception if empty).
removeLast() — Removes from end (throws exception if empty).
pollFirst() — Removes from front (returns null if empty).
pollLast() — Removes from end (returns null if empty).
remove() — Same as removeFirst.
poll() — Same as pollFirst.
clear() — Removes all elements.

* 3. Accessing Elements (Viewing)
getFirst() — Inspects front (throws exception if empty).

getLast() — Inspects end (throws exception if empty).
peekFirst() — Inspects front (returns null if empty).
peekLast() — Inspects end (returns null if empty).
peek() — Same as peekFirst.
element() — Same as getFirst.

4. Stack Operations (LIFO)
These methods make ArrayDeque a perfect replacement for the legacy Stack class:
push(E e) — Same as addFirst.
pop() — Same as removeFirst.

5. Search & Size
size() — Returns number of elements.
isEmpty() — Returns true if empty.
contains(Object o) — Returns true if element is present.
removeFirstOccurrence(Object o) — Removes the first match from head to tail.
removeLastOccurrence(Object o) — Removes the first match from tail to head.

6. Conversion & Iteration
iterator() — Standard head-to-tail iterator.
descendingIterator() — Reverse tail-to-head iterator.
toArray() — Converts to array.
spliterator() — (Java 8) For parallel processing.
forEach(Consumer<? super E> action) — (Java 8) Iterates using a Lambda.*/