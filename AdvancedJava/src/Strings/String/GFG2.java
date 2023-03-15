package Strings.String;

// Java Program to demonstrate Immutable String in Java
public class GFG2 {

    public static void main(String[] args) {
        String s = "Behabtu";

        // concat() method appends
        // the string at the end
        s.concat(" Kidest");

        // This will print Behabtu
        // because strings are
        // immutable objects
        System.out.println(s);
    }

    //output:Behabtu

}
