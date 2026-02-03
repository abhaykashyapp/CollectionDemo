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
/*
* A Vector is very similar to an ArrayList, but with one major difference:
* it is synchronized. This means it is thread-safe but generally slower.
* It’s part of the legacy classes but was retrofitted to fully support the Collections Framework.

methods available in Vector:

1. Core Modification (Adding)
add(E e)
add(int index, E element)
addAll(Collection<? extends E> c)
addAll(int index, Collection<? extends E> c)
addElement(E obj) (Legacy)
insertElementAt(E obj, int index) (Legacy)

2. Core Modification (Removing)
remove(int index)
remove(Object o)
removeAll(Collection<?> c)
removeElement(Object obj) (Legacy)
removeElementAt(int index) (Legacy)
removeAllElements() (Legacy)
removeIf(Predicate<? super E> filter) (Java 8)
clear()

3. Accessing & Searching
get(int index)
elementAt(int index) (Legacy)
firstElement()
lastElement()
indexOf(Object o)
lastIndexOf(Object o)
contains(Object o)
containsAll(Collection<?> c)

4. Capacity & Size Management
size()
isEmpty()
capacity()
ensureCapacity(int minCapacity)
setSize(int newSize)
trimToSize()

5. Conversion & Iteration
toArray()
toArray(T[] a)
elements() (Returns an Enumeration—legacy style)
iterator()
listIterator()
forEach(Consumer<? super E> action) (Java 8)

6. Sorting & Replacing
sort(Comparator<? super E> c) (Java 8)
replaceAll(UnaryOperator<E> operator) (Java 8)
set(int index, E element)

setElementAt(E obj, int index) (Legacy)
*
* */