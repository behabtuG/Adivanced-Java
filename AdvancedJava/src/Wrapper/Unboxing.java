package Wrapper;

import java.util.ArrayList;

// Java program to demonstrate Unboxing
public class Unboxing {

    public static void main(String[] args) {
        Character ch = 'a';

        // unboxing - Character object to primitive conversion
        char a = ch;

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(24);

        // unboxing because get method returns an Integer object
        int num = arrayList.get(0);

        // printing the values from primitive data types
        System.out.println(num);
    }

    //Output:24
}


