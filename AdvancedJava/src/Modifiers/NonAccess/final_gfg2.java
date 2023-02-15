package Modifiers.NonAccess;

public class final_gfg2 {
    void myMethod() {
        System.out.println("GeeksforGeeks");
    }
}

class override_final_gfg1 extends final_gfg2 {
    void myMethod() {
        System.out.println("Overrides GeeksforGeeks");
    }
}

class GFG011 {
    public static void main(String[] args) {
        override_final_gfg1 obj = new override_final_gfg1();
        obj.myMethod();
    }

    //Output: Overrides GeeksforGeeks
}

