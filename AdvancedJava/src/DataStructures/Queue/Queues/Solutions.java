package DataStructures.Queue.Queues;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class Solutions {
    //the creation of queue object using the PriorityQueue class
    public static void main0(String args[]) {
        // Creating empty priority queue
        Queue<Integer> pQueue = new PriorityQueue<Integer>();

        // Adding items to the pQueue using add()
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);

        // Printing the top element of the PriorityQueue
        System.out.println(pQueue.peek());//10

        // Printing the top element and removing it from the PriorityQueue container
        System.out.println(pQueue.poll());//10

        // Printing the top element again
        System.out.println(pQueue.peek());//15
    }
    //2. LinkedList:
    // creation of queue object using the LinkedList class

    public static void main1(String args[]) {
        // Creating empty LinkedList
        Queue<Integer> ll = new LinkedList<Integer>();

        // Adding items to the ll
        // using add()
        ll.add(10);
        ll.add(20);
        ll.add(15);

        // Printing the top element of the LinkedList
        System.out.println(ll.peek());//10

        // Printing the top element and removing it from the LinkedList container
        System.out.println(ll.poll());//10

        // Printing the top element again
        System.out.println(ll.peek());//20
    }

    //3. PriorityBlockingQueue:
    // creation of queue object using the PriorityBlockingQueue class

    public static void main(String args[]) {
        // Creating empty priority blocking queue
        Queue<Integer> pbq = new PriorityBlockingQueue<Integer>();

        // Adding items to the pbq using add()
        pbq.add(10);
        pbq.add(20);
        pbq.add(15);

        // Printing the top element of the PriorityBlockingQueue
        System.out.println(pbq.peek());//10

        // Printing the top element and removing it from the PriorityBlockingQueue
        System.out.println(pbq.poll());//10

        // Printing the top element again
        System.out.println(pbq.peek());//15
    }
}
