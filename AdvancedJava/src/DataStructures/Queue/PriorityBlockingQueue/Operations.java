package DataStructures.Queue.PriorityBlockingQueue;

import java.util.Comparator;
import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;

public class Operations {

    //1. Adding Elements to the PriorityBlockingQueue
    public static void main0(String[] args) {
        // define capacity of PriorityBlockingQueue
        int capacity = 15;

        // create object of PriorityBlockingQueue
        PriorityBlockingQueue<Integer> pbq = new PriorityBlockingQueue<Integer>(capacity);

        // add numbers
        pbq.add(1);
        pbq.add(2);
        pbq.add(3);

        // print queue
        System.out.println("PriorityBlockingQueue:" + pbq);//PriorityBlockingQueue:[1, 2, 3]
    }

    //2. removing elements from the PriorityBlockingQueue

    public static void main1(String[] args) {
        // define capacity of PriorityBlockingQueue
        int capacity = 15;

        // create object of PriorityBlockingQueue
        PriorityBlockingQueue<Integer> pbq = new PriorityBlockingQueue<Integer>(capacity);

        // add numbers
        pbq.add(1);
        pbq.add(2);
        pbq.add(3);

        // print queue
        System.out.println("PriorityBlockingQueue:" + pbq);//PriorityBlockingQueue:[1, 2, 3]

        // remove all the elements
        pbq.clear();

        // print queue
        System.out.println("PriorityBlockingQueue:" + pbq);//PriorityBlockingQueue:[]
    }

    //3.accessing elements of PriorityBlockingQueue

    public static void main2(String[] args) {
        // define capacity of PriorityBlockingQueue
        int capacityOfQueue = 5;

        // create object of PriorityBlockingQueue
        PriorityBlockingQueue<Integer> PrioQueue = new PriorityBlockingQueue<Integer>(capacityOfQueue);

        // Add elements to PriorityBlockingQueue
        PrioQueue.add(464161);
        PrioQueue.add(416165);

        // print PrioQueue
        System.out.println("PrioQueue: " + PrioQueue);//PrioQueue: [416165, 464161]

        // get head of PriorityBlockingQueue
        int head = PrioQueue.peek();

        // print head of PriorityBlockingQueue
        System.out.println("Head of Queue: " + head);//Head of Queue: 416165
    }

    //4.iterating over PriorityBlockingQueue
    public static void main3(String[] args) {
        // define capacity of PriorityBlockingQueue
        int capacityOfQueue = 5;

        // create object of PriorityBlockingQueue
        PriorityBlockingQueue<String> names
                = new PriorityBlockingQueue<String>(
                capacityOfQueue);

        // Add names of students of girls college
        names.add("Geeks");
        names.add("forGeeks");
        names.add("A");
        names.add("Computer");
        names.add("Portal");

        // Call iterator() method of PriorityBlockingQueue
        Iterator iteratorVals = names.iterator();

        // Print elements of iterator
        // created from PriorityBlockingQueue
        System.out.println("The Names are:");

        while (iteratorVals.hasNext()) {
            System.out.println(iteratorVals.next());
        }

        //output:
        //The Names are:
        //A
        //Computer
        //Geeks
        //forGeeks
        //Portal
    }
//5. comparator() method and passing Comparator to PriorityBlockingQueue

    public static void main(String[] args) throws InterruptedException {

        // create object of PriorityBlockingQueue
        PriorityBlockingQueue<Integer> PrioQueue = new PriorityBlockingQueue<Integer>(
                10, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return a - b;
            }
        });

        // Add numbers to PriorityBlockingQueue
        PrioQueue.put(45815616);
        PrioQueue.put(4981561);
        PrioQueue.put(4594591);
        PrioQueue.put(9459156);

        // get String representation of PriorityBlockingQueue
        String str = PrioQueue.toString();

        // Creating a comparator using comparator()
        Comparator comp = PrioQueue.comparator();

        // Displaying the comparator values
        System.out.println("Comparator value: " + comp);

        if (comp == null)
            System.out.println(
                    "PriorityBlockingQueue follows natural ordering");
        else
            System.out.println(
                    "PriorityBlockingQueue follows : " + comp);

        //output:
        //Comparator value: Queue.PriorityBlockingQueue.Operations$1@6d311334
        //PriorityBlockingQueue follows : Queue.PriorityBlockingQueue.Operations$1@6d311334
    }


}



