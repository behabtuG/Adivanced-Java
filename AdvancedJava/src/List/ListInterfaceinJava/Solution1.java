package List.ListInterfaceinJava;

import java.util.*;

//Operations in a List interface
public class Solution1 {
    //Operation 1:  Adding elements to List class using add() method
    public static void main1(String[] args) {

        //create an object of list interface implemented by Arraylist class
        List<String> a1 = new ArrayList<>();

        //adding elements to object of list interface custom elements
        a1.add("Geeks");
        a1.add(("geeks"));
        a1.add(1, "for");

        //print all the elements inside the list interface object
        System.out.println(a1); //output: [Geeks, for, geeks]
    }

    //Operation 2: Updating elements
    public static void main2(String[] args) {
        //creating an object of list interface
        List<String> a1 = new ArrayList<>();

        //Adding elements to object of list class
        a1.add("Geeks");
        a1.add("Geeks");
        a1.add(1, "Geeks");

        //Display the initial elements in list
        System.out.println("Initial ArrayList " + a1); //output: Initial ArrayList [Geeks, Geeks, Geeks]

        //setting(Updating) element at 1st index using set() method
        a1.set(1, "for");

        //print and display the updated list
        System.out.println("Updated ArrayList " + a1);//output: Updated ArrayList [Geeks, for, Geeks]
    }

    //Operation 3: Removing Elements
    public static void main3(String[] args) {
        List<String> a1 = new ArrayList<>();
        a1.add("Geeks");
        a1.add("Geeks");

        a1.add(1, "For");

        System.out.println("Initial ArrayList " + a1);//output: Initial ArrayList [Geeks, For, Geeks]
        a1.remove(1);
        System.out.println("After the removal " + a1);//output: After the removal [Geeks, Geeks]
        a1.remove("Geeks");
        System.out.println("After the object Removal " + a1); //output: After the object Removal [Geeks]

    }

    //Iterating over List
    public static void main4(String[] args) {
        List<String> a1 = new ArrayList<>();

        a1.add("Geeks");
        a1.add("Geeks");
        a1.add(1, "for");

        //using for loop for iteration
        for (int i = 0; i < a1.size(); i++) {
            System.out.println(a1.get(i) + ""); //output: Geeks for Geeks
        }

        //new line for better readability
        System.out.println();

        //using for-each loop for iteration
        for (String str : a1) {
            System.out.println(str + "");//output: Geeks for Geeks
        }
    }

    //Classes Association with a List Interface
    //Class 1: ArrayList
    public static void main5(String[] args) {

        //Size of ArrayList
        int n = 5;

        //Declaring the List with initial size n
        List<Integer> arrList = new ArrayList<Integer>(n);


        //appending the new elements at the end of the list
        for (int i = 1; i <= n; i++)
            arrList.add(i);

        System.out.println(arrList); //output:[1, 2, 3, 4, 5]

        //remove element at index 3
        arrList.remove(3);

        //Displaying the list after deletion
        System.out.println(arrList);//output: [1, 2, 3, 5]

        //printing elements one by one
        for (int i = 0; i < arrList.size(); i++)
            System.out.println(arrList.get(i) + ""); //output: 1 2 3  5
    }

    //Class 2: Vector
    public static void main6(String[] args) {
        int n = 5;

        List<Integer> v = new Vector<Integer>(n);

        for (int i = 1; i <= n; i++)
            v.add(i);
        System.out.println(v);//output: [1, 2, 3, 4, 5]

        v.remove(3); //remove 4
        System.out.println(v);//output: [1, 2, 3, 5]
        for (int i = 0; i < v.size(); i++)
            System.out.println(v.get(i) + "");//output: 1 2 3 5
    }

    //Class 3: Stack
    public static void main7(String[] args) {

        int n = 5;

        List<Integer> s = new Stack<Integer>();
        for (int i = 1; i <= n; i++)
            s.add(i);
        System.out.println(s);//output: [1, 2, 3, 4, 5]

        s.remove(3);
        System.out.println(s);//output: [1, 2, 3, 5]

        for (int i = 0; i < s.size(); i++)
            System.out.println(s.get(i) + "");//output: 1 2 3 5
    }

    //Class 4: LinkedList
    public static void main(String[] args) {

        int n = 5;

        List<Integer> l1 = new LinkedList<Integer>();
        for (int i = 1; i <= n; i++)
            l1.add(i);
        System.out.println(l1);//output: [1, 2, 3, 4, 5]

        l1.remove(3);
        System.out.println(l1);//output: [1, 2, 3, 5]

        for (int i = 0; i < l1.size(); i++)
            System.out.println(l1.get(i) + "");//output: 1 2 3 5
    }
}
