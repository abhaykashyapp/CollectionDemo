package Set;
 import java.util.*;

public class LearnHashSet {


        public static void main(String[] args) {
            // 1. HashSet: No guaranteed order (fastest)
            Set<String> hashSet = new HashSet<>();

            // 2. LinkedHashSet: Remembers the order you inserted items
            Set<String> linkedHashSet = new LinkedHashSet<>();

            // 3. TreeSet: Orders elements naturally (Alphabetical/Numerical)
            Set<String> treeSet = new TreeSet<>();

            String[] names = {"Zebra", "Apple", "Mango", "Banana"};

            for (String name : names) {
                hashSet.add(name);
                linkedHashSet.add(name);
                treeSet.add(name);
            }

            System.out.println("HashSet (Random):       " + hashSet);
            System.out.println("LinkedHashSet (Input):  " + linkedHashSet);
            System.out.println("TreeSet (Sorted):       " + treeSet);

    }
}
/*A HashSet is the most commonly used implementation of the Set interface. It uses a HashMap internally to store its elements, which means it offers constant-time performance for basic operations. It does not guarantee any specific order of elements and does not allow duplicates.

Here are the methods available in HashSet:

1. Adding Elements
add(E e) — Adds the element if it is not already present.
addAll(Collection<? extends E> c) — Adds all elements from another collection (standard set union).

2. Removing Elements
remove(Object o) — Removes the specified element if it exists.
removeAll(Collection<?> c) — Removes all elements contained in the specified collection.
removeIf(Predicate<? super E> filter) — (Java 8) Removes all elements that satisfy the given predicate (Lambda).
clear() — Removes all elements.
retainAll(Collection<?> c) — Keeps only the elements contained in the specified collection (standard set intersection).

3. Checking Status & Searching
contains(Object o) — Returns true if the set contains the element.
containsAll(Collection<?> c) — Returns true if the set contains all elements of the specified collection.
isEmpty() — Returns true if the set is empty.
size() — Returns the number of elements.

4. Conversion & Iteration
iterator() — Returns an iterator over the elements (order is not guaranteed).
toArray() — Returns an array containing all elements.
toArray(T[] a) — Returns an array of a specific type.
spliterator() — (Java 8) Creates a late-binding and fail-fast spliterator for parallel processing.
forEach(Consumer<? super E> action) — (Java 8) Performs the given action for each element using a Lambda.

5. Internal / Utility
clone() — Returns a shallow copy of the HashSet.
*/