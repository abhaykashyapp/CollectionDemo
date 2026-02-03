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