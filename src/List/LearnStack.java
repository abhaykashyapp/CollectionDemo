package List;

import java.util.*;

public class LearnStack {
    public static void main(String[] args) {

        // --- THE OLD WAY (Legacy Stack) ---
        Stack<String> legacyStack = new Stack<>();
        legacyStack.push("Bottom Plate");
        legacyStack.push("Middle Plate");
        legacyStack.push("Top Plate");

        System.out.println("Popping from legacy: " + legacyStack.pop()); // Top Plate


        // --- THE MODERN WAY (ArrayDeque as a Stack) ---
        // Faster and not synchronized
        Deque<String> modernStack = new ArrayDeque<>();
        modernStack.push("Bottom Plate");
        modernStack.push("Middle Plate");
        modernStack.push("Top Plate");

        System.out.println("Popping from modern: " + modernStack.pop()); // Top Plate
    }
}
/*
* 1. Core Stack Operations
push(E item) — Pushes an item onto the top of the stack.
pop() — Removes and returns the object at the top.
peek() — Looks at the object at the top without removing it.
empty() — Checks if the stack is empty (returns boolean).
search(Object o) — Returns the 1-based position from the top of the stack.

2. Inherited Methods (From Vector/List)
Since Stack is a subclass of Vector, you also have access to
these (though using them often defeats the purpose of a Stack):
add(E e)
get(int index)
remove(int index)
size()
clear()
contains(Object o)
iterator()

forEach(Consumer<? super E> action) (Java 8)

* */