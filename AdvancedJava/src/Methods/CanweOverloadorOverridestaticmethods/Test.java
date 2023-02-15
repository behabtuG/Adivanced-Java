package Methods.CanweOverloadorOverridestaticmethods;

// filename Test.java
public class Test {

    public static void foo() {
        System.out.println("Test.foo() called ");
    }

    public static void foo(int a) {
        System.out.println("Test.foo(int) called ");
    }

    public static void main(String args[]) {
        Test.foo();
        Test.foo(10);


        //output:
        // Test.foo() called
        //Test.foo(int) called
    }
}

