package Set;

import java.util.LinkedHashSet;
public class LearnLinkedHashSet {


        public static void main(String[] args) {
            // Create a LinkedHashSet of Strings
            LinkedHashSet<String> fruits = new LinkedHashSet<>();

            // Add elements to the set
            fruits.add("Apple");
            fruits.add("Banana");
            fruits.add("Orange");
            fruits.add("Mango");

            // Try adding a duplicate element (it will be ignored)
            fruits.add("Apple");

            // Print the elements
            // The output order will be the same as the insertion order: Apple, Banana, Orange, Mango
            System.out.println("Elements in the LinkedHashSet (insertion order preserved): " + fruits);

            // Check if an element exists
            System.out.println("Does the set contain 'Orange'? " + fruits.contains("Orange"));

            // Remove an element
            fruits.remove("Banana");
            System.out.println("After removing 'Banana': " + fruits);

            // Iterate through the elements using a for-each loop
            System.out.println("Iterating through the set:");
            for (String fruit : fruits) {
                System.out.println(fruit);
            }

    }

}
/*A LinkedHashSet is the ordered version of a HashSet. It maintains a doubly-linked list across all its elements, which ensures that when you iterate through the set, the elements come out in the exact order they were inserted.

Since it extends HashSet, it shares almost all the same methods, but its internal behavior is different.

1. Adding Elements
add(E e) — Adds the element only if it’s not already present (maintains insertion order).
addAll(Collection<? extends E> c) — Adds multiple elements.

2. Removing Elements
remove(Object o) — Removes the specific element.
removeAll(Collection<?> c) — Removes all elements found in another collection.
removeIf(Predicate<? super E> filter) — (Java 8) Removes elements based on a condition (Lambda).
clear() — Wipes the set clean.
retainAll(Collection<?> c) — Only keeps elements found in the specified collection.

3. Checking & Size
contains(Object o) — Checks if an element exists.
containsAll(Collection<?> c) — Checks for multiple elements.
isEmpty() — Returns true if the set is empty.
size() — Returns the number of elements.

4. Conversion & Iteration (Ordered)
Unlike HashSet, these will always follow the order you added the items:
iterator() — Returns an iterator that follows insertion order.
forEach(Consumer<? super E> action) — (Java 8) Iterates in order using a Lambda.
toArray() — Converts to an ordered array.
toArray(T[] a) — Converts to a typed ordered array.
spliterator() — (Java 8) Returns a spliterator that reports the ORDERED characteristic.

5. Internal / Utility
clone() — Creates a shallow copy.*/