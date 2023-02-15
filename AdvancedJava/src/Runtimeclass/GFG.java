package Runtimeclass;

// Java Program to Illustrate Runtime class
// Via exec() Method
public class GFG {

    public static void main(String[] args) {
        // Try block to check for exceptions
        try {

            // Creating a process and execute google-chrome
            Process process = Runtime.getRuntime().exec("google-chrome");
            System.out.println("Google Chrome successfully started");
        }

        // Catch block to handle the exceptions
        catch (Exception e) {
            // Display the exception on the console
            e.printStackTrace();
        }

        //Output:Google Chrome successfully started
    }
}
