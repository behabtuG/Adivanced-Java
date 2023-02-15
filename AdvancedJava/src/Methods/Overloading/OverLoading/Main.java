package Methods.Overloading.OverLoading;

/*package whatever //do not write package name here */
public class Main {

    //Can we overload methods on return type?
    //We cannot overload by return type in Java.

    /**
     * public int foo() {
     * return 10;
     * }
     * <p>
     * // compiler error: foo() is already defined
     * public char foo() {
     * return 'a';
     * }
     */

    // However, Overloading methods on return type are possible in cases where the data type of the function being called is explicitly specified.
    //Look at the examples below:
    public static int foo(int a) {
        return 10;
    }

    public static char foo(int a, int b) {
        return 'a';
    }

    public static void main(String args[]) {
        System.out.println(foo(1));
        System.out.println(foo(1, 2));

        //output:
        // 10
        //a
    }
}


