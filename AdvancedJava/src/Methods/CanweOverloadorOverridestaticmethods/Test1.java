package Methods.CanweOverloadorOverridestaticmethods;

// filename Test.java
public class Test1 {

    /**
     * public static void foo() {
     * System.out.println("Test.foo() called ");
     * }
     * <p>
     * public void foo() { // Compiler Error: cannot redefine foo()
     * System.out.println("Test.foo(int) called ");
     * }
     */
    public static void main(String args[]) {
        //Test1.foo();

        //output:Compiler Error, cannot redefine foo()
    }

}



