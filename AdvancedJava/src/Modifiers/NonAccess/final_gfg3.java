package Modifiers.NonAccess;

public class final_gfg3 {

    final void myMethods() {
        System.out.println("GeeksforGeeks");
    }
}

class override_final_gfg2 extends final_gfg3 {
    // trying to override the method available on final_gfg class
   //// void myMethods() {
       //// System.out.println("Overrides GeeksforGeeks");
   //// }
}

class GFG121 {
    public static void main(String[] args) {
        override_final_gfg2 obj = new override_final_gfg2();
        obj.myMethods();
    }

    //output:
    //java: myMethod() in Modifiers.NonAccess.override_final_gfg1 cannot override myMethod() in Modifiers.NonAccess.final_gfg3
    //overridden method is final

}


