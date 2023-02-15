package Runtimeclass;

// Java Program to Illustrate Runtime class Via availableProcessors() Method, exit() Method
public class GFG1 {

    // Main driver method
    public static void main(String[] args) {

        // Method 1: availableProcessors()
        // Check the number of processors available
        // and printing alongside
        System.out.println("" + Runtime.getRuntime().availableProcessors());

        // Method 2: exit()
        // Making program to exit
        Runtime.getRuntime().exit(0);

        // Nothing will run now
        System.out.println("Program Running Check");

        // Note: here we will notice that there will be no
        // output generated on console

    }


}
