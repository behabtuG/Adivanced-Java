package Modifiers.NonAccess;

// This class is final
final class final_gfg1 {

    String s1 = "geek1";
}

// We are trying to inherit a final
/**
class extended_gfg1 extends final_gfg1 {

    String s2 = "geek2";
}

class GFG11 {
    public static void main(String[] args) {
        // creating object
        extended_gfg1 obj = new extended_gfg1();

        System.out.println(obj.s1);
        System.out.println(obj.s2);
    }
*/
    //output:D:\project\AdvancedJava\src\Modifiers\NonAccess\final_gfg1.java:10:29 java:
    // cannot inherit from final Modifiers.NonAccess.final_gfg1
//}


