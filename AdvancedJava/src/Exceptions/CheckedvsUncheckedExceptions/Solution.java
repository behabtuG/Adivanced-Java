package Exceptions.CheckedvsUncheckedExceptions;

public class Solution {// Java Program to Illustrate Checked Exceptions
// Where FileNotFoundException occurred

    // Main driver method
    public static void main(String[] args)  {
     /**
        // Reading file from path in local directory
        FileReader file = new FileReader("C:\\test\\a.txt");

        // Creating object as one of ways of taking input
        BufferedReader fileInput = new BufferedReader(file);

        // Printing first 3 lines of file "C:\test\a.txt"
        for (int counter = 0; counter < 3; counter++)
            System.out.println(fileInput.readLine());

        // Closing file connections
        // using close() method
        fileInput.close();
     */
    //output:java: unreported exception java.io.FileNotFoundException; must be caught or declared to be thrown
    }
}

