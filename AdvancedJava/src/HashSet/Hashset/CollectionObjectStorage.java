package HashSet.Hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionObjectStorage {

    public static void main1(String[] args) {
        // Instantiate an object of HashSet
        HashSet<ArrayList> set = new HashSet<>();

        // create ArrayList list1
        ArrayList<Integer> list1 = new ArrayList<>();

        // create ArrayList list2
        ArrayList<Integer> list2 = new ArrayList<>();

        // Add elements using add method
        list1.add(1);
        list1.add(2);
        list2.add(1);
        list2.add(2);
        set.add(list1);
        set.add(list2);

        // print the set size to understand the
        // internal storage of ArrayList in Set
        System.out.println(set.size());
        //output: 1
    }

    //Implementation:
    public static void main2(String[] args) {
        // Creating an empty HashSet
        HashSet<String> h = new HashSet<String>();

        // Adding elements into HashSet
        // using add() method
        h.add("India");
        h.add("Australia");
        h.add("South Africa");

        // Adding duplicate elements
        h.add("India");

        // Displaying the HashSet
        System.out.println(h);
        System.out.println("List contains India or not:"
                + h.contains("India"));

        // Removing items from HashSet
        // using remove() method
        h.remove("Australia");
        System.out.println("List after removing Australia:"
                + h);

        // Display message
        System.out.println("Iterating over list:");

        // Iterating over hashSet items
        Iterator<String> i = h.iterator();

        // Holds true till there is single element remaining
        while (i.hasNext())

            // Iterating over elements
            // using next() method
            System.out.println(i.next());

        //output:
        // [South Africa, Australia, India]
        //List contains India or not:true
        //List after removing Australia:[South Africa, India]
        //Iterating over list:
        //South Africa
        //India

    }

    //Performing Various Operations on HashSet
    // Operation 1: Adding Elements
    public static void main3(String[] args) {
        // Creating an empty HashSet of string entities
        HashSet<String> hs = new HashSet<String>();
        // Adding elements using add() method
        hs.add("Geek");
        hs.add("For");
        hs.add("Geeks");

        // Printing all string el=ntries inside the Set
        System.out.println("HashSet elements : " + hs);

        //output: HashSet elements : [Geek, For, Geeks]

    }

    //Operation 2: Removing Elements
    public static void main4(String[] args) {
        // Creating an empty HashSet of string entities
        HashSet<String> hs = new HashSet<String>();

        // Adding elements using add() method
        hs.add("Geek");
        hs.add("For");
        hs.add("Geeks");

        // Printing all string elements inside the Set
        System.out.println("HashSet elements : " + hs);

        //output:HashSet elements : [Geek, For, Geeks]
    }

    public static void main5(String[] args) {
        // Creating an

        HashSet<String> hs = new HashSet<String>();
        // Adding elements to above Set
        // using add() method
        hs.add("Geek");
        hs.add("For");
        hs.add("Geeks");
        hs.add("A");
        hs.add("B");
        hs.add("Z");

        // Printing the elements of HashSet elements
        System.out.println("Initial HashSet " + hs);

        // Removing the element B
        hs.remove("B");

        // Printing the updated HashSet elements
        System.out.println("After removing element " + hs);

        // Returns false if the element is not present
        System.out.println("Element AC exists in the Set : "
                + hs.remove("AC"));

        //output:
        // Initial HashSet [A, B, Geek, For, Geeks, Z]
        //After removing element [A, Geek, For, Geeks, Z]
        //Element AC exists in the Set : false
    }

    public static void main(String[] args) {

        // Creating an empty HashSet of string entries
        HashSet<String> hs = new HashSet<String>();

        // Adding elements to above Set using add() method
        hs.add("Geek");
        hs.add("For");
        hs.add("Geeks");
        hs.add("A");
        hs.add("B");
        hs.add("Z");

        // Iterating though the HashSet using iterators
        Iterator itr = hs.iterator();

        // Holds true till there is single element remaining in Set
        while (itr.hasNext())

            // Traversing elements and printing them
            System.out.print(itr.next() + ", ");
        System.out.println();

        // Using enhanced for loop for traversal
        for (String s : hs)

            // Traversing elements and printing them
            System.out.print(s + ", ");
        System.out.println();

        //output:
        // A, B, Geek, For, Geeks, Z,
        //A, B, Geek, For, Geeks, Z,
    }


}
