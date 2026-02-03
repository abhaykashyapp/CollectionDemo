package List;

import java.util.LinkedList;

public class LearnLinkedList {


    static void main(String[] args) {

        LinkedList<String> linkedlist = new LinkedList();


        linkedlist.add("Abhay");
        linkedlist.add("Prahlad");
        linkedlist.add("Ravi");
        linkedlist.add("Raja");
        linkedlist.add("Vishal");
        linkedlist.add("Vishwanath");

      linkedlist.forEach(System.out::println);
 }


}
/*
* 1. Adding Elements
add(E e)
add(int index, E element)
addAll(Collection<? extends E> c)
addAll(int index, Collection<? extends E> c)
addFirst(E e)
addLast(E e)
offer(E e)
offerFirst(E e)
offerLast(E e)

2. Removing Elements
remove()
remove(int index)
remove(Object o)
removeFirst()
removeLast()
removeFirstOccurrence(Object o)
removeLastOccurrence(Object o)
poll()
pollFirst()
pollLast()
clear()

3. Accessing Elements
get(int index)
getFirst()
getLast()
peek()
peekFirst()
peekLast()
set(int index, E element)

4. Search & Size
contains(Object o)
indexOf(Object o)
lastIndexOf(Object o)
size()

5. Stack Operations (LIFO)
push(E e)
pop()

6. Conversion & Iteration
toArray()
toArray(T[] a)
iterator()
descendingIterator()
listIterator(int index)
spliterator()

7. Internal / Utility
clone()
* */
