package day21collections;

    /*
        1)ArrayList and LinkedList are the child classes of List interface
        2)ArrayList is successful in search operations, but not successful in adding and removing operations
        3)LinkedList is not successful in search operations, but successful in adding and removing operations
        4)LinkedList has "node"s not elements.
          "Node"s have 2 parts i)Data Part and ii)Pointer Part
          First node is pointed by "Head", last "node"(Tail) points null
     */

import java.util.LinkedList;

public class C01LinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();


        linkedList.add(6);// [6]
        linkedList.add(1, 12);// [6, 12]
        linkedList.add(2, 5);
        linkedList.addLast(2);
        System.out.println(linkedList);// [6, 12, 5, 2]

        //if you want to remove an integer "node", convert it to wrapper class then put it inside the remove() parenthesis like
        //the example below. If you put integer directly inside remove() parenthesis Java will accept it as index.
        linkedList.remove((Integer)12);
        System.out.println(linkedList);// [6, 5, 2]

        System.out.println(linkedList.remove());//Retrieves and removes the first element of this list - Like "cut+paste"
        System.out.println(linkedList);// [5, 2]

        int removedNode = linkedList.removeFirst();// Removes and returns the first element from this list - Like "cut+paste"
        System.out.println(removedNode);// 5
        System.out.println(linkedList);// [2]

        linkedList.add(10);
        linkedList.add(5);
        linkedList.add(10);
        linkedList.add(10);
        linkedList.add(13);
        System.out.println(linkedList);// [2, 10, 5, 10, 10, 13]

        linkedList.removeFirstOccurrence(10);
        System.out.println(linkedList);// [2, 5, 10, 10, 13]

        linkedList.removeLastOccurrence(10);
        System.out.println(linkedList);// [2, 5, 10, 13]

        LinkedList<Integer> myList = new LinkedList<>();
        myList.add(5);
        myList.add(100);
        myList.add(2);
        System.out.println(myList);// [5, 100, 2]

        linkedList.removeAll(myList);
        System.out.println(linkedList);// [10, 13]
    }
}