package Set;
    import java.util.*;

public class LearnSortedSet {

         void main(String[] args) {
            // We use SortedSet as the reference type
            SortedSet<Integer> numbers = new TreeSet<>();

            numbers.add(10);
            numbers.add(5);
            numbers.add(20);
            numbers.add(15);

            System.out.println("Full Set: " + numbers); // [5, 10, 15, 20]

            // Special SortedSet Methods:
            System.out.println("First element: " + numbers.first()); // 5
            System.out.println("Last element:  " + numbers.last());  // 20
            // Get elements less than 15
            System.out.println("Headset ( < 15): " + numbers.headSet(15)); // [5, 10]
        }

}
/*


Java, SortedSet is an interface, not a class. It extends the Set interface and adds methods to ensure that the elements are always maintained in an upward (ascending) order.

The most common implementation of this interface is TreeSet.

1. Finding the Extremes (Range Ends)
These methods let you grab the start and end of the set.

first() — Returns the first (lowest) element currently in the set.

last() — Returns the last (highest) element currently in the set.

2. Subset Operations (Range Views)
These methods return a "view" of a portion of your set.
subSet(E fromElement, E toElement) — Returns a view of the set from fromElement (inclusive) to toElement (exclusive).
headSet(E toElement) — Returns a view of the portion of the set strictly less than toElement.
tailSet(E fromElement) — Returns a view of the portion of the set greater than or equal to fromElement.

3. Comparator Access
comparator() — Returns the Comparator used to order the elements. If the set uses natural ordering (like numbers or strings), it returns null.

4. Inherited Methods (From Set/Collection)
Since it's a Set, it still has the standard tools:
add(E e)
remove(Object o)
contains(Object o)
size()
isEmpty()
clear()
iterator()

5. Java 8 Features (Inherited)
forEach(Consumer<? super E> action)
removeIf(Predicate<? super E> filter)
spliterator() — In a SortedSet, the spliterator is automatically marked as SORTED and DISTINCT.

*/
