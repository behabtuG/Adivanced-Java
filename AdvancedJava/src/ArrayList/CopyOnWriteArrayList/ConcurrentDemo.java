package ArrayList.CopyOnWriteArrayList;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

// Java program to illustrate CopyOnWriteArrayList class
public class ConcurrentDemo extends Thread {

    static CopyOnWriteArrayList<String> l = new CopyOnWriteArrayList<String>();

    public void run() {
        // Child thread trying to add new element in the Collection object
        l.add("D");
    }

    public static void main0(String[] args) throws InterruptedException {
        l.add("A");
        l.add("B");
        l.add("c");

        // We create a child thread that is going to modify ArrayList l.
        ConcurrentDemo t = new ConcurrentDemo();
        t.run();

        Thread.sleep(1000);

        // Now we iterate through the ArrayList and get exception.
        Iterator itr = l.iterator();
        while (itr.hasNext()) {
            String s = (String) itr.next();
            System.out.println(s);
            Thread.sleep(1000);
        }
        System.out.println(l);

        //output:
        //A
        //B
        //c
        //D
        //[A, B, c, D]
    }

    //Iterating over CopyOnWriteArrayList:
    // Java program to illustrate CopyOnWriteArrayList class

    public static void main(String[] args) {

        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        // Initial Iterator
        Iterator itr = list.iterator();
        list.add("GfG");
        System.out.println("List contains: ");
        while (itr.hasNext())
            System.out.println(itr.next());

        // iterator after adding an element
        itr = list.iterator();
        System.out.println("List contains:");
        while (itr.hasNext())
            System.out.println(itr.next());
        //output:
        // List contains:
        // List contains:
        //GfG
    }


}
