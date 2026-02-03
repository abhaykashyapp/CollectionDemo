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
