package LoopsInJava.forloopandEnhancedforloop;

public class Solution {
//illustrate the use of for loop

    public static void main0(String[] args) {

        // 1st for-loop
        // Iteration ocer 5 elements using for loop
        for (int i = 1; i <= 5; i++) {

            // Print statement
            System.out.println("GFG!");
            //GFG!
            // GFG!
            // GFG!
            // GFG!
            //GFG!
        }

        // 2nd for-loop
        // Declaring and initialization a variable, so we will get compile time error
        // for (int i = 1; i <= 1; i++)
        //int x = 0;//prog.java:28: error: variable declaration not allowed here int x=0;

    }

    // Java Program to show usage of for-each loop

    public static void main(String[] args) {

        // Declaring and initializing the integer array Custom integer entries in an array
        int[] array = {1, 2, 3, 4, 5, 6};

        // Accessing the element of array using for-each loop
        for (int a : array) {
            // Print all elements of an array
            System.out.println(a);
            //output:
            //1
            //2
            //3
            //4
            //5
            //6
        }
    }


}

