package Methods.Default;

// A simple program to Test Interface default
// methods in java
public interface TestInterface {

    // abstract method
    public void square(int a);

    // default method
    default void show() {
        System.out.println("Default Method Executed");
    }
}

class TestClass implements TestInterface {
    // implementation of square abstract method
    public void square(int a) {
        System.out.println(a * a);
    }

    public static void main(String args[]) {
        TestClass d = new TestClass();
        d.square(4);

        // default method executed
        d.show();
    }
    //output:
    //16
    //Default Method Executed

}
