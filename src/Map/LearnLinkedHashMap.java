package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LearnLinkedHashMap {
    public static void main(String[] args) {
        // Create a LinkedHashMap
        LinkedHashMap<String, String> fruitColors = new LinkedHashMap<>();

        // Adding elements
        fruitColors.put("Apple", "Red");
        fruitColors.put("Banana", "Yellow");
        fruitColors.put("Grape", "Purple");
        fruitColors.put("Orange", "Orange");

        // Iterating - This will ALWAYS print in the order added
        for (Map.Entry<String, String> entry : fruitColors.entrySet()) {
            System.out.println(entry.getKey() + " is " + entry.getValue());
        }
    }
}
/*
* it extends HashMap, it has all the methods HashMAp has, but it adds some specific behavior for ordering.

1. Basic Operations (Inherited from HashMap)
put(K key, V value)
get(Object key)
getOrDefault(Object key, V defaultValue)
remove(Object key)
clear()
containsKey(Object key)
containsValue(Object value)
size()
isEmpty()

2. View Methods (Ordered Views)
These return the keys, values, or entries in the order they were inserted:
keySet()
values()
entrySet()

3. Java 8 Functional Methods (Inherited)
forEach(BiConsumer<? super K, ? super V> action)
replaceAll(BiFunction<? super K, ? super V, ? extends V> function)
putIfAbsent(K key, V value)
compute(), computeIfAbsent(), computeIfPresent()
merge()

4. Specialized Internal Methods
These are often overridden or used for building specialized caches:
removeEldestEntry(Map.Entry<K,V> eldest) —
*   Important: You can override this to create a "Least Recently Used" (LRU) cache.
replace(K key, V value)
replace(K key, V oldValue, V newValue)
*
* */