package Literals;
// Java program to illustrate the
// application of String literals

public class Test3 {

    public static void main(String[] args) {
        String s = "Hello";

        // If we assign without "" then it treats
        // as a variable and causes compiler error
        //String s1 = :Hello;

        System.out.println(s);
        //System.out.println(s1);
    }

    //output:
    //Hello
    //error: cannot find symbol
    //symbol:   variable Hello
    //location: class Test
}


