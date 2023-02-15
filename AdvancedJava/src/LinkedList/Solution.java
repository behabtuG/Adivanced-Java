package LinkedList;

import java.util.LinkedList;

public class Solution {

    public static void main1(String[] args) {

        LinkedList<String> l1 = new LinkedList<String>();
        l1.add("A");
        l1.add("B");
        l1.addLast("C");
        l1.addFirst("D");
        l1.add(2, "E");
        System.out.println(l1); //output: [D, A, E, B, C]

        l1.remove("B");
        l1.remove(3);
        l1.removeFirst();
        l1.removeLast();
        System.out.println(l1);//output: [A]
    }

    //Operation 1: Adding Elements
    public static void main2(String[] args) {
        LinkedList<String> l1 = new LinkedList<>();

        l1.add("Geeks");
        l1.add("Geeks");
        l1.add(1, "For");

        System.out.println(l1);//output: [Geeks, For, Geeks]
    }

    //Operation 2: Changing Elements
    public static void main3(String[] args) {
        LinkedList<String> l1 = new LinkedList<>();

        l1.add("Geeks");
        l1.add("Geeks");
        l1.add(1, "Geeks");

        System.out.println("Initial LinkedList: " + l1);//Initial LinkedList: [Geeks, Geeks,Geeks]

        l1.set(1, "For");
        System.out.println("Updated LinkedList: " + l1);//Updated LinkedList: [Geeks, For, Geeks]
    }

    //Operation 3: Removing Elements
    public static void main4(String[] args) {

        LinkedList<String> ll = new LinkedList<>();

        ll.add("Geeks");
        ll.add("Geeks");
        ll.add(1, "For");

        System.out.println("Initial LinkedList " + ll);//Initial LinkedList [Geeks, For, Geeks]

        // Function call
        ll.remove(1);

        System.out.println("After the Index Removal " + ll);//After the Index Removal [Geeks, Geeks]

        ll.remove("Geeks");

        System.out.println("After the Object Removal "
                + ll); //After the Object Removal [Geeks]
    }

    //Operation 4: Iterating the LinkedList
    public static void main5(String args[]) {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("Geeks");
        ll.add("Geeks");
        ll.add(1, "For");

        // Using the Get method and the
        // for loop
        for (int i = 0; i < ll.size(); i++) {

            System.out.print(ll.get(i) + " ");//Geeks For Geeks
        }

        System.out.println();

        // Using the for each loop
        for (String str : ll)
            System.out.print(str + " ");//Geeks For Geeks
    }

    //Operation 4:  Linked list to  Array by using  toArray();
    public static void main6(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(123);
        list.add(12);
        list.add(11);
        list.add(1134);
        System.out.println("LinkedList: " + list);//LinkedList: [123, 12, 11, 1134]
        Object[] a = list.toArray(); //converting LinedList to Array
        System.out.print("After converted LinkedList to Array: ");//After converted LinkedList to Array: 123 12 11 1134
        for (Object element : a)
            System.out.print(element + " ");//
    }

    //Operation 5-size();
    public static void main7(String args[]) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Geeks for Geeks ");
        list.add("is best ");
        // Displaying the size of the list
        System.out.println("The size of the linked list is: " + list.size());//The size of the linked list is: 2
    }

    //Operation 6 – removeFirst();
    public static void main8(String args[]) {

        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("LinkedList:" + list);  //LinkedList:[10, 20, 30]
        System.out.println("The  remove first element is: " + list.removeFirst()); //The  remove first element is: 10
        // Displaying the final list
        System.out.println("Final LinkedList:" + list); //Final LinkedList:[20, 30]

    }

    //Operation 7- removelast();
    public static void main(String args[]) {

        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("LinkedList:" + list);//LinkedList:[10, 20, 30]
        // Remove the tail using removeLast()
        System.out.println("The last element is removed: " + list.removeLast());//The last element is removed: 30
        // Displaying the final list
        System.out.println("Final LinkedList:" + list);//Final LinkedList:[10, 20]
        // Remove the tail using removeLast()
        System.out.println("The last element is removed: " + list.removeLast());//The last element is removed: 20
        // Displaying the final list
        System.out.println("Final LinkedList:" + list); //Final LinkedList:[10]


    }
}
