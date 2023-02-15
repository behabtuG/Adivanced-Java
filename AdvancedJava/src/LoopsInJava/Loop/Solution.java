package LoopsInJava.Loop;

import java.util.ArrayList;

public class Solution {
    public static void main0(String[] args) {
        int i = 0;
        //while loop
        System.out.println("While Loop--");
        while (i <= 10) {
            System.out.println(+i);
            i++;
        }

        //output:
        //While Loop--
        //0
        //1
        //2
        //3
        //4
        //5
        //6
        //7
        //8
        //9
        //10

        //for loop
        System.out.println("for Loop--");
        for (int j = 0; j <= 10; j++) {
            System.out.println(+j);
        }
        //output:
        //for Loop--
        //0
        //1
        //2
        //3
        //4
        //5
        //6
        //7
        //8
        //9
        //10

        //do while loop
        System.out.println("do While Loop--");
        int k = 0;
        do {
            System.out.println(k);
            k++;
        } while (k <= 10);

        //output:
        //do While Loop--
        //0
        //1
        //2
        //3
        //4
        //5
        //6
        //7
        //8
        //9
        //10

        //

    }


    public static void main1(String[] args) {
        //Infinite for loop :
        //for (; ; ) {
        // }

        //infinite while loop:
        while (true) // statement
        {
            // statement
        }
    }

    //Java program to illustrate various pitfalls.
    public static void main(String[] args) {

        // infinite loop because condition is not apt condition should have been i>0.
        for (int i = 5; i != 0; i -= 2) {
            System.out.println(i);
        }
        int x = 5;

        // infinite loop because update statement is not provided.
        while (x == 5) {
            System.out.println("In the loop");
        }
    }

    //Java program for out of memory exception.
    public static void main3(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            ar.add(i);
        }

   //output:
        // Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
        //at java.util.Arrays.copyOf(Unknown Source)
        //at java.util.Arrays.copyOf(Unknown Source)
        //at java.util.ArrayList.grow(Unknown Source)
        //at java.util.ArrayList.ensureCapacityInternal(Unknown Source)
        //at java.util.ArrayList.add(Unknown Source)
        //at article.Integer1.main(Integer1.java:9)
    }
}

