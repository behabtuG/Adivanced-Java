package Modifiers.Access;

// Java program to illustrate error while
// using class from different package with
// private modifier
public class A {

    private void display() {
        System.out.println("GeeksforGeeks");
    }
}

class B {
    public static void main(String args[]) {
        A obj = new A();
        // Trying to access private method
        // of another class
      //  obj.display();
    }
    //Output:
    //error: display() has private access in A
    //obj.display();

}
