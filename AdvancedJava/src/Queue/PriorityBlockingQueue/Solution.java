package Queue.PriorityBlockingQueue;

import java.util.Comparator;
import java.util.Vector;
import java.util.concurrent.PriorityBlockingQueue;

public class Solution {

    //to demonstrate PriorityBlockingQueue() constructor
    public static void main0(String[] args) {

        // create object of PriorityBlockingQueue using PriorityBlockingQueue() constructor
        PriorityBlockingQueue<Integer> pbq = new PriorityBlockingQueue<Integer>();

        // add numbers
        pbq.add(1);
        pbq.add(2);
        pbq.add(3);
        pbq.add(4);
        pbq.add(5);

        // print queue
        System.out.println("PriorityBlockingQueue:" + pbq);//output:PriorityBlockingQueue:[1, 2, 3, 4, 5]
    }

    //2. PriorityBlockingQueue(Collection<? extends E> c)
    // Java program to demonstrate PriorityBlockingQueue(Collection c) constructor

    public static void main1(String[] args) {

        // Creating a Collection
        Vector<Integer> v = new Vector<Integer>();
        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);
        v.addElement(5);

        // create object of PriorityBlockingQueue using PriorityBlockingQueue(Collection c)
        // constructor
        PriorityBlockingQueue<Integer> pbq = new PriorityBlockingQueue<Integer>(v);

        // print queue
        System.out.println("PriorityBlockingQueue:" + pbq);//PriorityBlockingQueue:[1, 2, 3, 4, 5]
    }
    //3. PriorityBlockingQueue(int initialCapacity)
// PriorityBlockingQueue(int initialCapacity) constructor

    public static void main2(String[] args) {
        // define capacity of PriorityBlockingQueue
        int capacity = 15;

        // create object of PriorityBlockingQueue using PriorityBlockingQueue(int initialCapacity)
        // constructor
        PriorityBlockingQueue<Integer> pbq = new PriorityBlockingQueue<Integer>(capacity);

        // add numbers
        pbq.add(1);
        pbq.add(2);
        pbq.add(3);

        // print queue
        System.out.println("PriorityBlockingQueue:" + pbq);//PriorityBlockingQueue:[1, 2, 3]
    }

    // 4. PriorityBlockingQueue(int initialCapacity, Comparator<? super E> comparator)
    // PriorityBlockingQueue(int initialCapacity, Comparator comparator) constructor


    public static void main(String[] args) {
        // define capacity of PriorityBlockingQueue
        int capacity = 15;

        // create object of PriorityBlockingQueue
        PriorityBlockingQueue<Integer> pbq = new PriorityBlockingQueue<Integer>(
                capacity, Comparator.reverseOrder());

        // add numbers
        pbq.add(1);
        pbq.add(2);
        pbq.add(3);

        // print queue
        System.out.println("PriorityBlockingQueue:" + pbq);//PriorityBlockingQueue:[3, 1, 2]
    }

}

