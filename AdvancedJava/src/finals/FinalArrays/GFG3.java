package finals.FinalArrays;

// Java Program to Illustrate Members in Final Array
// Can be Modified
public class GFG3 {

    // Main driver method
    public static void main(String args[]) {
        // Declaring a final array
        final int arr1[] = {1, 2, 3, 4, 5};

        // Declaring normal integer array
        int arr2[] = {10, 20, 30, 40, 50};

        // Assigning values to each other
        arr2 = arr1;
       // arr1 = arr2;

        // Now iterating over normal integer array
        for (int i = 0; i < arr2.length; i++)

            // Printing the elements of above array
            System.out.println(arr2[i]);
    }

    //output:D:\project\AdvancedJava\src\finals\FinalArrays\GFG3.java:17:9
    //java: cannot assign a value to final variable arr1

}
