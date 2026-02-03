package List;

import java.util.ArrayList;
import java.util.List;

public class LearnArrayList {



/*
* 1. Dynamic Resizing
* 2. Ordered Collection
* 3. Random Access'
* 4. Allows Duplicates and Nulls
* 5. Non-Primitive Storage
* 6. Not Thread-Safe

*
* */
    public static void main(String[] args) {

    ArrayList  <String> fruit = new ArrayList();
      fruit.add("Apple");
        fruit.add("Orange");
        fruit.add("Pineapple");
        fruit.add("Banana");
        fruit.add("Cherry");

        fruit.add(0,"Strawberry");


    fruit.forEach(System.out::println);

    }

}
