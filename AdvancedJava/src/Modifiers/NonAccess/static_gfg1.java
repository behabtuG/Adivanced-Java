package Modifiers.NonAccess;

public class static_gfg1 {

    // static variable
    static int count = 0;

    void myMethod() {
        count++;
        System.out.println(count);
    }
}

class GFG1 {
    public static void main(String[] args) {
        // first object creation
        static_gfg1 obj1 = new static_gfg1();

        // method calling of first object
        obj1.myMethod();

        // second object creation
        static_gfg1 obj2 = new static_gfg1();

        // method calling of second object
        obj2.myMethod();
    }
}


