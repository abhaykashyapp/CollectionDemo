package List;

import java.util.*;

public class LearnStack {
    public static void main(String[] args) {

        // --- THE OLD WAY (Legacy Stack) ---
        Stack<String> legacyStack = new Stack<>();
        legacyStack.push("Bottom Plate");
        legacyStack.push("Middle Plate");
        legacyStack.push("Top Plate");

        System.out.println("Popping from legacy: " + legacyStack.pop()); // Top Plate


        // --- THE MODERN WAY (ArrayDeque as a Stack) ---
        // Faster and not synchronized
        Deque<String> modernStack = new ArrayDeque<>();
        modernStack.push("Bottom Plate");
        modernStack.push("Middle Plate");
        modernStack.push("Top Plate");

        System.out.println("Popping from modern: " + modernStack.pop()); // Top Plate
    }
}