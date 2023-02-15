package Runtimeclass;

public class GFG3 {
    // Java program to illustrate halt() method of Runtime class

    public static void main(String[] args) {
        // halt this process
        Runtime.getRuntime().halt(0);

        // print a string, just to see if its process is halted
        System.out.println("Process is still running.");

        //output:
        //From above output it is made clear above program compiled  successfully and run. There is no print statement is
        // executed as we have used halt() method which terminates the further execution of operations.
    }
}
