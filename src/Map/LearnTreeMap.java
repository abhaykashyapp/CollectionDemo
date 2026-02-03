package Map;

import java.util.TreeMap;
import java.util.Map;

public class LearnTreeMap {
    public static void main(String[] args) {
        // Create a TreeMap (Keys will be sorted alphabetically)
        TreeMap<String, Integer> studentScores = new TreeMap<>();

        // Adding elements in random order
        studentScores.put("Zoe", 88);
        studentScores.put("Alice", 95);
        studentScores.put("Charlie", 91);
        studentScores.put("Bob", 84);

        // Printing elements - Output will be Alice, Bob, Charlie, Zoe
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Special TreeMap methods
        System.out.println("First Student (Lowest Key): " + studentScores.firstKey());
        System.out.println("Last Student (Highest Key): " + studentScores.lastKey());
    }
}


/*
* it implements the NavigableMap and SortedMap interfaces, it has many specialized methods for "navigation" that you won't find in other maps.

1. Basic Operations (Inherited)
put(K key, V value)
get(Object key)
remove(Object key)
containsKey(Object key)
containsValue(Object value)
size()
clear()

2. Finding the Extremes (SortedMap)
firstKey() — Returns the lowest key.
lastKey() — Returns the highest key.
firstEntry() — Returns the Key-Value pair for the lowest key.
lastEntry() — Returns the Key-Value pair for the highest key.

3. Navigation Methods (NavigableMap)
These are great for finding "closest matches":
lowerKey(K key) — Strictly less than.
floorKey(K key) — Less than or equal to.
ceilingKey(K key) — Greater than or equal to.
higherKey(K key) — Strictly greater than.
lowerEntry(K key), floorEntry(K key), ceilingEntry(K key), higherEntry(K key) — Same as above, but returns the full entry.

4. Polling Methods
pollFirstEntry() — Removes and returns the lowest entry.
pollLastEntry() — Removes and returns the highest entry.

5. Sub-Map Operations (Ranging)
subMap(K fromKey, K toKey) — Returns a view of the portion of the map.
headMap(K toKey) — Returns everything up to a certain key.
tailMap(K fromKey) — Returns everything from a certain key onwards.
descendingMap() — Returns a reverse-order view of the map.
descendingKeySet() — Returns a reverse-order set of keys.

6. Java 8 Functional Methods
forEach(BiConsumer<? super K, ? super V> action)
replace(K key, V value)
replaceAll(BiFunction<? super K, ? super V, ? extends V> function)
putIfAbsent(), compute(), merge() — Inherited from Map.
*
* */