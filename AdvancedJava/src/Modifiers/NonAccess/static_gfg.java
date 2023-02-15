package Modifiers.NonAccess;

// static variable
public class static_gfg {

    static String s = "GeeksforGeeks";
}

class GFG {
    public static void main(String[] args) {
        // No object required
        System.out.println(static_gfg.s);
    }

    //Output:GeeksforGeeks

}
