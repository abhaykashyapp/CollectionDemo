package List;

    import java.util.Vector;
public class LearnVector {


        public static void main(String[] args) {
            // Creating a Vector
            Vector<String> animals = new Vector<>();

            // Adding elements
            animals.add("Lion");
            animals.add("Tiger");
            animals.add("Elephant");

            // Accessing by index
            System.out.println("At index 1: " + animals.get(1));

            // Vectors allow you to check capacity (unlike ArrayList)
            System.out.println("Current capacity: " + animals.capacity());
        }

}
