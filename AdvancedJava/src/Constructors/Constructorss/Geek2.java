package Constructors.Constructorss;

public class Geek2 {
// Java Program to illustrate constructor overloading
// using same task (addition operation ) for different types of arguments.

    // constructor with one argument
    Geek2(String name) {
        System.out.println("Constructors.Constructor with one " + "argument - String : " + name);
    }

    // constructor with two arguments
    Geek2(String name, int age) {

        System.out.println("Constructors.Constructor with two arguments : " + " String and Integer : " + name + " " + age);
    }

    // Constructors.Constructor with one argument but with different type than previous.
    Geek2(long id) {
        System.out.println("Constructors.Constructor with one argument : " + "Long : " + id);
    }
}

class GFG2 {
    public static void main(String[] args) {
        // Creating the objects of the class named 'Geek'
        // by passing different arguments

        // Invoke the constructor with one argument of
        // type 'String'.
        Geek2 geek2 = new Geek2("Behabtu");

        // Invoke the constructor with two arguments
        Geek2 geek3 = new Geek2("Kidest", 26);

        // Invoke the constructor with one argument of
        // type 'Long'.
        Geek2 geek4 = new Geek2(325614567);

        //output:
        //Constructors.Constructor with one argument - String : Behabtu
        //Constructors.Constructor with two arguments :  String and Integer : Kidest 26
        //Constructors.Constructor with one argument : Long : 325614567
    }
}

