package List.AbstractSequentialList;

import java.util.AbstractSequentialList;
import java.util.LinkedList;

// Java code to illustrate AbstractSequentialList
public class AbstractSequentialListDemo {


    public static void main0(String[] args) {
        // Creating an instance of the AbstractSequentialList
        AbstractSequentialList<Integer> absl = new LinkedList<>();

        // adding elements to absl
        absl.add(5);
        absl.add(6);
        absl.add(7);

        // Printing the list
        System.out.println(absl);

        //output: [5, 6, 7]
    }

    // Java code to illustrate methods of AbstractSequentialList
    public static void main(String args[]) {

        // Creating an empty AbstractSequentialList
        AbstractSequentialList<String> absqlist = new LinkedList<String>();

        // Using add() method to add elements in the list
        absqlist.add("Geeks");
        absqlist.add("for");
        absqlist.add("Geeks");
        absqlist.add("10");
        absqlist.add("20");

        // Output the list
        System.out.println("AbstractSequentialList: " + absqlist);

        // Remove the head using remove()
        absqlist.remove(3);

        // Print the final list
        System.out.println("Final List: " + absqlist);

        // Fetching the specific element from the list using get() method
        System.out.println("The element is: " + absqlist.get(2));

        //output:
        //AbstractSequentialList: [Geeks, for, Geeks, 10, 20]
        //Final List: [Geeks, for, Geeks, 20]
        //The element is: Geeks
    }


}

