package Exceptions.CheckedvsUncheckedExceptions;

import java.io.*;

// Java Program to Illustrate Checked Exceptions
// Where FileNotFoundException does not occur
public class GFG {

    // Main driver method
    public static void main(String[] args)
            throws IOException {

        // Creating a file and reading from local repository
        FileReader file = new FileReader("C:\\test\\a.txt");

        // Reading content inside a file
        BufferedReader fileInput = new BufferedReader(file);

        // Printing first 3 lines of file "C:\test\a.txt"
        for (int counter = 0; counter < 3; counter++)
            System.out.println(fileInput.readLine());

        // Closing all file connections using close() method
        // Good practice to avoid any memory leakage
        fileInput.close();

        //output:
        //Exception in thread "main" java.io.FileNotFoundException: C:\test\a.txt (The system cannot find the path specified)
        //	at java.base/java.io.FileInputStream.open0(Native Method)
        //	at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
        //	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
        //	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:111)
        //	at java.base/java.io.FileReader.<init>(FileReader.java:60)
        //	at Exceptions.CheckedvsUncheckedExceptions.GFG.main(GFG.java:14)
    }
}
