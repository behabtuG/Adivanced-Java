package Queue.Deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDequeDemo {
    // Java program to demonstrate the addition of elements in deque
    //1. Adding Elements:
    public static void main0(String[] args) {
        // Initializing an deque
        Deque<String> dq = new ArrayDeque<String>();

        // add() method to insert
        dq.add("For");
        dq.addFirst("Geeks");
        dq.addLast("Geeks");

        System.out.println(dq);

        //output: [Geeks, For, Geeks]
    }

    //2. Removing Elements:
    // Java program to demonstrate the removal of elements in deque

    public static void main1(String[] args) {
        // Initializing an deque
        Deque<String> dq = new ArrayDeque<String>();

        // add() method to insert
        dq.add("For");
        dq.addFirst("Geeks");
        dq.addLast("Geeks");

        System.out.println(dq);   // [Geeks, For, Geeks]

        System.out.println(dq.pop()); //Geeks

        System.out.println(dq.poll());//For

        System.out.println(dq.pollFirst()); //Geeks

        System.out.println(dq.pollLast()); //null
        System.out.println(dq); // []

        //output:
        // [Geeks, For, Geeks]
        //Geeks
        //For
        //Geeks
        //null
    }

    //output:3. Iterating through the Deque:
    // Java program to demonstrate the iteration of elements in deque

    public static void main2(String[] args) {
        // Initializing an deque
        Deque<String> dq = new ArrayDeque<String>();

        // add() method to insert
        dq.add("For");
        dq.addFirst("Geeks");
        dq.addLast("Geeks");
        dq.add("is so good");

        for (Iterator itr = dq.iterator();
             itr.hasNext(); ) {
            System.out.print(itr.next() + " ");
        }

        System.out.println();

        for (Iterator itr = dq.descendingIterator();
             itr.hasNext(); ) {
            System.out.print(itr.next() + " ");
        }

        //output:
        // Geeks For Geeks is so good
        //is so good Geeks For Geeks
    }

    //The class which implements the Deque interface is ArrayDeque.
    // Java program to demonstrate the creation of deque object using the ArrayDeque class in Java


    public static void main(String[] args) {
        // Initializing an deque
        Deque<Integer> de_que = new ArrayDeque<Integer>(10);

        // add() method to insert
        de_que.add(10);
        de_que.add(20);
        de_que.add(30);
        de_que.add(40);
        de_que.add(50);

        System.out.println(de_que);

        // clear() method
        de_que.clear();

        // addFirst() method to insert the
        // elements at the head
        de_que.addFirst(564);
        de_que.addFirst(291);

        // addLast() method to insert the
        // elements at the tail
        de_que.addLast(24);
        de_que.addLast(14);

        System.out.println(de_que);

        //output:
        //[10, 20, 30, 40, 50]
        //[291, 564, 24, 14]
    }
}




