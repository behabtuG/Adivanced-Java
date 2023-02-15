package Exceptions.TypesofException;

/*package whatever //do not write package name here */
public class IllegalStateException_Demo {

    public static void print(int a, int b) {
        System.out.println("Addition of Positive Integers :" + (a + b));
    }

    public static void main(String[] args) {
        int n1 = 7;
        int n2 = -3;
        if (n1 >= 0 && n2 >= 0) {
            IllegalStateException_Demo.print(n1, n2);
        } else {
            throw new IllegalStateException("Either one or two numbers are not Positive Integer");
        }
    }
    //Output :
    //Exception in thread "main" java.lang.IllegalStateException: Either one or two numbers are not Positive Integer
    //at GFG.main(File.java:16)

}
