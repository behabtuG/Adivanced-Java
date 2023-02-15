package Array.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

// Java program to Implement ArrayDeque in Java Importing utility classes
// ArrayDequeDemo
public class Solution {

    public static void main0(String[] args) {
        // Creating and initializing deque Declaring object of integer type
        Deque<Integer> de_que = new ArrayDeque<Integer>(10);

        // Operations 1 add() method

        // Adding custom elements using add() method to insert
        de_que.add(10);
        de_que.add(20);
        de_que.add(30);
        de_que.add(40);
        de_que.add(50);

        // Iterating using for each loop
        for (Integer element : de_que) {
            // Print the corresponding element
            System.out.println("Element : " + element);
        }

        // Operation 2 clear() method
        System.out.println("Using clear() ");

        // Clearing all elements using clear() method
        de_que.clear();

        // Operations 3 addFirst() method

        // Inserting at the start
        de_que.addFirst(564);
        de_que.addFirst(291);

        // Operation 4 addLast() method Inserting at end
        de_que.addLast(24);
        de_que.addLast(14);

        // Display message
        System.out.println("Above elements are removed now");

        // Iterators
        // Display message
        System.out.println("Elements of deque using Iterator :");

        for (Iterator itr = de_que.iterator();
             itr.hasNext(); ) {
            System.out.println(itr.next());
        }

        // descendingIterator() To reverse the deque order
        System.out.println("Elements of deque in reverse order :");

        for (Iterator dItr = de_que.descendingIterator();
             dItr.hasNext(); ) {
            System.out.println(dItr.next());
        }

        // Operation 5 element() method : to get Head element
        System.out.println("\n Head Element using element(): " + de_que.element());

        // Operation 6 getFirst() method : to get Head element
        System.out.println("Head Element using getFirst(): " + de_que.getFirst());

        // Operation 7 getLast() method : to get last element
        System.out.println("Last Element using getLast(): " + de_que.getLast());

        // Operation 8 toArray() method :
        Object[] arr = de_que.toArray();
        System.out.println("\n Array Size : " + arr.length);

        System.out.print("Array elements : ");

        for (int i = 0; i < arr.length; i++)
            System.out.print(" " + arr[i]);

        // Operation 9 peek() method : to get head
        System.out.println("\n Head element : " + de_que.peek());

        // Operation 10 poll() method : to get head
        System.out.println("Head element poll : " + de_que.poll());

        // Operation 11 push() method
        de_que.push(265);
        de_que.push(984);
        de_que.push(2365);

        // Operation 12 remove() method : to get head
        System.out.println("Head element remove : " + de_que.remove());

        System.out.println("The final array is: " + de_que);

        //output:Element :
        // 10
        //Element : 20
        //Element : 30
        //Element : 40
        //Element : 50
        //Using clear()
        //Above elements are removed now
        //Elements of deque using Iterator :
        //291
        //564
        //24
        //14
        //Elements of deque in reverse order :
        //14
        //24
        //564
        //291
        //
        // Head Element using element(): 291
        //Head Element using getFirst(): 291
        //Last Element using getLast(): 14
        //
        // Array Size : 4
        //Array elements :  291 564 24 14
        // Head element : 291
        //Head element poll : 291
        //Head element remove : 2365
        //The final array is: [984, 265, 564, 24, 14]

    }

    //Operation 1: Adding Elements
    // Java program to Illustrate Addition of elements in ArrayDeque

    public static void main1(String[] args) {
        // Initializing a deque since deque is an interface it is assigned the ArrayDeque class
        Deque<String> dq = new ArrayDeque<String>();

        // add() method to insert
        dq.add("The");
        dq.addFirst("To");
        dq.addLast("Geeks");

        // offer() method to insert
        dq.offer("For");
        dq.offerFirst("Welcome");
        dq.offerLast("Geeks");

        // Printing Elements of ArrayDeque to the console
        System.out.println("ArrayDeque : " + dq);

        //output: ArrayDeque : [Welcome, To, The, Geeks, For, Geeks]
    }

    //Operation 2: Accessing the Elements
    // Java program to Access Elements of ArrayDeque Importing required classes
    // AccessingElementsOfArrayDeque

    public static void main2(String args[]) {
        // Creating an empty ArrayDeque
        ArrayDeque<String> de_que = new ArrayDeque<String>();

        // Using add() method to add elements into the Deque
        // Custom input elements
        de_que.add("Welcome");
        de_que.add("To");
        de_que.add("Geeks");
        de_que.add("4");
        de_que.add("Geeks");

        // Displaying the ArrayDeque
        System.out.println("ArrayDeque: " + de_que);

        // Displaying the First element
        System.out.println("The first element is: " + de_que.getFirst());

        // Displaying the Last element
        System.out.println("The last element is: " + de_que.getLast());

        //output:
        // ArrayDeque: [Welcome, To, Geeks, 4, Geeks]
        //The first element is: Welcome
        //The last element is: Geeks
    }

    //Operation 3. Removing Elements
    // Java program to Illustrate Removal Elements in Deque Importing all utility classes
    // RemoveElementsOfArrayDeque
    public static void main3(String[] args) {
        // Initializing a deque
        Deque<String> dq = new ArrayDeque<String>();

        // add() method to insert
        dq.add("One");

        // addFirst inserts at the front
        dq.addFirst("Two");

        // addLast inserts at the back
        dq.addLast("Three");

        // print elements to the console
        System.out.println("ArrayDeque : " + dq);

        // remove element as a stack from top/front
        System.out.println(dq.pop());

        // remove element as a queue from front
        System.out.println(dq.poll());

        // remove element from front
        System.out.println(dq.pollFirst());

        // remove element from back
        System.out.println(dq.pollLast());

        //output:
        // ArrayDeque : [Two, One, Three]
        //Two
        //One
        //Three
        //null
    }

    //Operation 4: Iterating through the Deque
    // Java program to Illustrate Iteration of Elements in Deque
    // Importing all utility classes IterateArrayDeque
    public static void main(String[] args) {
        // Declaring and initializing an deque
        Deque<String> dq = new ArrayDeque<String>();

        // Adding elements at the back using add() method
        dq.add("For");

        // Adding element at the front using addFirst() method
        dq.addFirst("Geeks");

        // add element at the last using addLast() method
        dq.addLast("Geeks");
        dq.add("is so good");

        // Iterate using Iterator interface from the front of the queue
        for (Iterator itr = dq.iterator(); itr.hasNext(); ) {

            // Print the elements
            System.out.print(itr.next() + " ");
        }

        // New line
        System.out.println();

        // Iterate in reverse sequence in a queue
        for (Iterator itr = dq.descendingIterator();
             itr.hasNext(); ) {

            System.out.print(itr.next() + " ");
        }

        //output:
        // Geeks For Geeks is so good
        //is so good Geeks For Geeks
    }


}




