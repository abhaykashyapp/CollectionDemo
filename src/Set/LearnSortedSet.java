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
