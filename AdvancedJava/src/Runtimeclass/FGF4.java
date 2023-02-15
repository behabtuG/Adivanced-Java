package Runtimeclass;

import java.io.File;

public class FGF4 {
    // Java Program to Illustrate exec()
// Method of Runtime class
    // Main driver method
    public static void main(String[] args) {

        // Try block to check for exceptions
        try {

            // Declaring a string array
            String[] cmd = new String[2];

            // Initializing elements of string array
            cmd[0] = "atom";
            cmd[1] = "File.java";

            // Creating a file with directory from local systems
            //File dir = new File("/Users/GLory/Desktop");
            File dirs = new File("C:\\Users\\Glory\\Desktop");

            // Creating a process by creating Process class object
            // and execute above array using exec() method
            Process process = Runtime.getRuntime().exec(cmd, null);

            // Display message on console for successful execution
            System.out.println("File.java opening.");
        }

        // Catch block to handle exceptions
        catch (Exception e) {

            // Display exceptions with line number
            // using printStackTrace() method
            e.printStackTrace();
        }
    }
}

