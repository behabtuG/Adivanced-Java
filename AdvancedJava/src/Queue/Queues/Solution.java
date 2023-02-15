package Queue.Queues;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

// Java program to demonstrate a Queue
public class Solution {


    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        // Adds elements {0, 1, 2, 3, 4} to the queue
        for (int i = 0; i < 5; i++)
            q.add(i);

        // Display contents of the queue.
        System.out.println("Elements of queue " + q);//Elements of queue [0,1,2,3,4]

        // To remove the head of queue.
        int removedele = q.remove();
        System.out.println("removed element-" + removedele);//removed element-0

        System.out.println(q);//[1,2,3,4]

        // To view the head of queue
        int head = q.peek();
        System.out.println("head of queue-" + head);//head of queue-1

        // Rest all methods of collection interface like size and contains
        // can be used with this implementation.
        int size = q.size();
        System.out.println("Size of queue-" + size);//Size of queue-4


        //1.Adding Elements:
        Queue<String> pq = new PriorityQueue<>();

        pq.add("Geeks");
        pq.add("For");
        pq.add("Geeks");
        System.out.println(pq);//[Geeks, For, Geeks]

        //2. Removing Elements:
        System.out.println("Initial Queue " + pq);//Initial Queue [Geeks, For, Geeks]
        pq.remove("Geeks");
        System.out.println("After Remove " + pq);//After Remove [For, Geeks]
        System.out.println("Poll Method " + pq.poll());//Poll Method [For]
        System.out.println("Final Queue " + pq);//Final Queue [Geeks]

        //3. Iterating the Queue:

        pq.add("Geeks");
        pq.add("For");
        // pq.add("Geeks");
        Iterator iterator = pq.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");//For Geeks Geeks
        }
    }


}
