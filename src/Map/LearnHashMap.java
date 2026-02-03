package Map;

import java.util.HashMap;
import java.util.Map;

public class LearnHashMap {
    public static void main(String[] args) {
        // 1. Create a HashMap (Key: String, Value: Integer)
        HashMap<String, Integer> studentGrades = new HashMap<>();

        // 2. Add elements (Key, Value)
        studentGrades.put("Alice", 90);
        studentGrades.put("Bob", 85);
        studentGrades.put("Charlie", 92);

        // 3. Access a value using its key
        System.out.println("Alice's grade: " + studentGrades.get("Alice"));

        // 4. Remove an entry
        studentGrades.remove("Bob");

        // 5. Check size
        System.out.println("Number of students: " + studentGrades.size());

        // 6. Iterate through the map
        for (String name : studentGrades.keySet()) {
            System.out.println(name + " scored: " + studentGrades.get(name));
        }
    }
}
/*
* methods available in HashMap:

1. Basic Operations (Adding & Retrieving)
put(K key, V value) — Adds a key-value pair.
putAll(Map<? extends K, ? extends V> m) — Copies all mappings from another map.
get(Object key) — Returns the value for a key (or null).
getOrDefault(Object key, V defaultValue) — (Java 8) Returns value or a default if key is missing.

2. Removing & Clearing
remove(Object key) — Removes the entry for a key.
remove(Object key, Object value) — (Java 8) Only removes if the key is currently mapped to the specified value.
clear() — Removes all mappings.

3. Checking Status & Searching
containsKey(Object key) — Checks if a key exists.
containsValue(Object value) — Checks if a value exists (slower than containsKey).
size() — Returns number of key-value pairs.
isEmpty() — Checks if the map is empty.

4. Specialized Java 8 Functional Methods
These are the "powerhouse" methods added in Java 8 for functional programming:
putIfAbsent(K key, V value) — Adds only if key doesn't exist.
compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction)
computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction)
computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction)  
merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction)  
forEach(BiConsumer<? super K, ? super V> action)  
replaceAll(BiFunction<? super K, ? super V, ? extends V> function)

5. Views of the Map (Extracting Data)
These return a "view" of the data which allows you to iterate or convert to a Collection:
keySet() — Returns a Set of all keys.
values() — Returns a Collection of all values.
entrySet() — Returns a Set of all Key-Value entries (Map.Entry).

6. Internal / Utility
clone()
replace(K key, V value)
replace(K key, V oldValue, V newValue)
*
* */