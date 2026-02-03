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
