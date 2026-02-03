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