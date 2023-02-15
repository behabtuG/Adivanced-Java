package Methods.Overriding;

// demonstrate multi-level overriding
// Base Class
public class Parent7 {

    void show() {
        System.out.println("Parent's show()");
    }
}

// Inherited class
class Child7 extends Parent7 {
    // This method overrides show() of Parent
    void show() {
        System.out.println("Child's show()");
    }
}

// Inherited class
class GrandChild extends Child7 {
    // This method overrides show() of Parent
    void show() {
        System.out.println("GrandChild's show()");
    }
}

// Driver class
class Main7 {
    public static void main(String[] args) {
        Parent7 obj1 = new GrandChild();
        obj1.show();


        //output:GrandChild's show()
    }
}

