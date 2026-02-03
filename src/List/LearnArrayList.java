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
/** Methods of ArrayList
 * 1. Adding Elements
 * add(E e)
 * * add(int index, E element)
 * * addAll(Collection<? extends E> c)
 * * addAll(int index, Collection<? extends E> c)
 *
 * 2. Removing Elements
 * remove(int index)
 * * remove(Object o)
 * * removeAll(Collection<?> c)
 * * removeIf(Predicate<? super E> filter)
 * * clear()
 * * retainAll(Collection<?> c)
 *
 * 3. Accessing & Modifying
 * get(int index)
 * * set(int index, E element)
 * * subList(int fromIndex, int toIndex)
 *
 * 4. Searching & Checking
 * contains(Object o)
 * * indexOf(Object o)
 * * lastIndexOf(Object o)
 * * isEmpty()
 * * size()
 *
 * * 5. Conversion & Iteration
 toArray()
 * * toArray(T[] a)
 * * iterator()
 * listIterator()
 * * listIterator(int index)
 * * forEach(Consumer<? super E> action)
 * * spliterator()
 *
 * 6. Capacity Management
 * ensureCapacity(int minCapacity)
 * * trimToSize()
 *
 * * 7. Sorting & Replacement
 * sort(Comparator<? super E> c)
 * * replaceAll(UnaryOperator<E> operator)
 *
 * 8. Internal/Utility
 * clone()
 */
