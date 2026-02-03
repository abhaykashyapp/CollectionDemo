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
