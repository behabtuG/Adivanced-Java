package Modifiers.NonAccess;

public class final_gfg {

    String s1 = "geek1";
}

class extended_gfg extends final_gfg {

    String s2 = "geek2";
}

class GFG3 {
    public static void main(String[] args) {
        // creating object
        extended_gfg obj = new extended_gfg();

        System.out.println(obj.s1);
        System.out.println(obj.s2);
    }

    //output:
    // geek1
    //geek2
}
