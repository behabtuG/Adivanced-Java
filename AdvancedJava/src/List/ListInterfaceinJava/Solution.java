package List.ListInterfaceinJava;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        //creating an object of list interface implemented by the Arraylist class
        List<Integer> l1 = new ArrayList<>();

        //Adding elements to object of list interface custom inputs
        l1.add(0, 1);
        l1.add(1, 2);

        //print the element inside the object
        System.out.println(l1); //output: [1, 2]

        //Now creating another object of the list interface implemented Arraylist class
        //Declaring object of integer type
        List<Integer> l2 = new ArrayList<>();

        //Adding elements to object of list Interface custom inputs
        l2.add(1);
        l2.add(2);
        l2.add(3);
        System.out.println(l2); //output: [1, 2, 3]

        //will add list l2 from 1 index
        l1.addAll(1, l2);
        System.out.println(l1);//output [1, 1, 2, 3, 2]

        //remove element from index 1
        l1.remove(1);

        //printing the updated list 1
        System.out.println(l1); //output: [1, 2, 3, 2]

        //prints element at index 3 in list 1 using get() method
        System.out.println(l1.get(3));//output: 2

        //replace 0th element with 5 in list 1
        l1.set(0,5);

        //Again printing the updated  list 1
        System.out.println(l1);//output:[5, 2, 3, 2]
    }
}
