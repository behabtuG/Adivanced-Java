package List.InitializingaListinJava;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    //1. Using List.add() method
    public static void main(String args[]) {

        // For ArrayList
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        System.out.println("ArrayList : " + list.toString());
        // For LinkedList
        List<Integer> llist = new LinkedList<Integer>();
        llist.add(2);
        llist.add(4);
        System.out.println("LinkedList : " + llist.toString());

        // For Stack
        List<Integer> stack = new Stack<Integer>();
        stack.add(3);
        stack.add(1);
        System.out.println("Stack : " + stack.toString());
        //output
        // ArrayList : [1, 3]
        // LinkedList : [2, 4]
        // Stack : [3, 1]
    }

    public static void main1(String args[]) {
        // For ArrayList
        List<Integer> list = new ArrayList<Integer>() {
            {
                add(1);
                add(3);
            }
        };
        System.out.println("ArrayList : " + list.toString());

        // For LinkedList
        List<Integer> llist = new LinkedList<Integer>() {
            {
                add(2);
                add(4);
            }
        };
        System.out.println("LinkedList : " + llist.toString());
        // For Stack
        List<Integer> stack = new Stack<Integer>() {
            {
                add(3);
                add(1);
            }
        };
        System.out.println("Stack : " + stack.toString());
        //output
        // ArrayList : [1, 3]
        //LinkedList : [2, 4]
        //Stack : [3, 1]
    }

    //2. Using Arrays.asList()
    //. Creating Immutable List
    public static void main2(String args[]) {

        // Instantiating List using Arrays.asList()
        List<Integer> list = Arrays.asList(1, 2, 3);

        // Print the list
        System.out.println("List : " + list.toString());
        // Output List : [1, 2, 3]
    }

    // . Creating Mutable List
    public static void main3(String args[]) {

        // Creating a mutable list using Arrays.asList()
        List<Integer> list = new ArrayList<>(
                Arrays.asList(1, 2, 3));

        // Print the list
        System.out.println("List : " + list.toString());

        list.add(5);

        // Print the list
        System.out.println("Modified list : " + list.toString());
        //  output
        //  List : [1, 2, 3]
        //  Modified list : [1, 2, 3, 5]
    }

    // 3. Using Collections class methods
    // 1.Using Collections.addAll()
    public static void main4(String args[]) {

        // Create an empty list
        List<Integer> list = new ArrayList<Integer>();

        // Instantiating list using Collections.addAll()
        Collections.addAll(list, 1, 2, 3, 4);
        // Print the list
        System.out.println("List : " + list.toString());

        //  Output: List : [1, 2, 3, 4]

    }

    //2.Using Collections.unmodifiableList()
    public static void main5(String args[]) {

        // Creating the list
        List<Integer> list = Collections.unmodifiableList(
                Arrays.asList(1, 2, 3));
        // Print the list
        System.out.println("List : " + list.toString());
        //Output: List : [1, 2, 3]
    }

    public static void main6(String args[]) {
        try {
            // Creating the list
            List<Integer> list = Collections.unmodifiableList(
                    Arrays.asList(1, 2, 3));
            // Print the list
            System.out.println("List : " + list.toString());
            // Trying to modify the list
            System.out.println("Trying to modify the list");
            list.set(0, list.get(0));
        } catch (Exception e) {
            System.out.println("Exception : " + e);
        }
        //Output:
        // List : [1, 2, 3]
        //Trying to modify the list
        //Exception : java.lang.UnsupportedOperationException
    }

    //3. Using Collections.singletonList()
    public static void main7(String args[]) {

        // Creating the list
        List<Integer> list = Collections.singletonList(2);
        // Print the list
        System.out.println("List : " + list.toString());
        //Output: List : [2]
    }

    //4. Using Java 8 Stream
    public static void main8(String args[]) {

        // Creating a List using Syntax 1
        List<Integer> list1 = Stream.of(1, 2, 3)
                .collect(Collectors.toList());

        // Printing the list
        System.out.println("List using Syntax 1: "
                + list1.toString());

        // Creating a List using Syntax 2
        List<Integer> list2 = Stream
                .of(3, 2, 1)
                .collect(
                        Collectors
                                .toCollection(ArrayList::new));

        // Printing the list
        System.out.println("List using Syntax 2: "
                + list2.toString());

        // Creating a List using Syntax 3
        List<Integer> list3 = Stream
                .of(1, 2, 3, 4)
                .collect(
                        Collectors
                                .collectingAndThen(
                                        Collectors.toList(),
                                        Collections::unmodifiableList));

        // Printing the list
        System.out.println("List using Syntax 3: "
                + list3.toString());
        //Output
        // List using Syntax 1: [1, 2, 3]
        //List using Syntax 2: [3, 2, 1]
        //List using Syntax 3: [1, 2, 3, 4]
    }

    //9. Using Java 9 List.of()
    public static void main9(String args[]) {

        // Creating a list using List.of()
        List<Integer> unmodifiableList = List.of(1, 2, 3);

        // Printing the List
        System.out.println("List : "
                + unmodifiableList.toString());
        //OUTPUT: List : [1, 2, 3]
    }

}
