package DataStructures.Queue.PriorityQueue.PriorityQueues;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

    //the working of PriorityQueue
    public static void main0(String args[]) {
        // Creating empty priority queue
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

        // Adding items to the pQueue using add()
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);

        // Printing the top element of PriorityQueue
        System.out.println(pQueue.peek());//10

        // Printing the top element and removing it from the PriorityQueue container
        System.out.println(pQueue.poll());//10

        // Printing the top element again
        System.out.println(pQueue.peek());//15
    }

    //1.Adding Elements:
    public static void main1(String args[]) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < 3; i++) {
            pq.add(i);
            pq.add(1);
        }
        System.out.println(pq);//[0, 1, 1, 1, 2, 1]
        //We will not get sorted elements by printing PriorityQueue.
    }

    //and
    public static void main2(String args[]) {
        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.add("Geeks");
        pq.add("For");
        pq.add("Geeks");

        System.out.println(pq);//[For, Geeks, Geeks]
    }

    //2. Removing Elements:
    // Java program to remove elements from a PriorityQueue

    public static void main3(String args[]) {
        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.add("Geeks");
        pq.add("For");
        pq.add("Geeks");

        System.out.println("Initial PriorityQueue " + pq);//Initial PriorityQueue [For, Geeks, Geeks]

        // using the method
        pq.remove("Geeks");

        System.out.println("After Remove - " + pq);//After Remove - [For, Geeks]

        System.out.println("Poll Method - " + pq.poll());//Poll Method - For

        System.out.println("Final PriorityQueue - " + pq);//Final PriorityQueue -[Geeks]
    }

    //3. Accessing the elements:
    // Java program to access elements from a PriorityQueue

    public static void main4(String[] args) {

        // Creating a priority queue
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Geeks");
        pq.add("For");
        pq.add("Geeks");
        System.out.println("PriorityQueue: " + pq);//PriorityQueue: [For, Geeks, Geeks]

        // Using the peek() method
        String element = pq.peek();
        System.out.println("Accessed Element: " + element);//Accessed Element: For
    }

    //4. Iterating the PriorityQueue:
// to iterate elements to a PriorityQueue
    //Returns an iterator over the elements in this queue. The iterator does not return the elements in any particular order.
    public static void main(String args[]) {
        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.add("Geeks");
        pq.add("For");
        pq.add("Geeks");

        Iterator iterator = pq.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");//For Geeks Geeks
        }
    }

}

