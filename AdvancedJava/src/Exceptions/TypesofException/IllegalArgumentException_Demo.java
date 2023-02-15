package Exceptions.TypesofException;

/*package whatever //do not write package name here */
public class IllegalArgumentException_Demo {


    public static void print(int a) {
        if (a >= 18) {
            System.out.println("Eligible for Voting");
        } else {

            throw new IllegalArgumentException("Not Eligible for Voting");

        }

    }

    public static void main(String[] args) {
        IllegalArgumentException_Demo.print(14);
    }

    //Output :
    //Exception in thread "main" java.lang.IllegalArgumentException: Not Eligible for Voting
    //at GFG.print(File.java:14)
    //at GFG.main(File.java:20)
}
