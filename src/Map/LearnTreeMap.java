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