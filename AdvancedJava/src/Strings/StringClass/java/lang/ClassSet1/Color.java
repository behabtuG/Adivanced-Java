package Strings.StringClass.java.lang.ClassSet1;

// Java program to demonstrate isEnum() method
public enum Color {

    RED, GREEN, BLUE;
}

class Test10 {
    public static void main(String[] args) {
        // returns the Class object associated with Color(an enum class)
        Class c1 = Color.class;

        // returns the Class object associated with Test class
        Class c2 = Test10.class;

        // checking for Enum class
        // isEnum method
        boolean b1 = c1.isEnum();
        boolean b2 = c2.isEnum();

        System.out.println("is " + c1.toString() + " an Enum class : " + b1);
        System.out.println("is " + c2.toString() + " an Enum class : " + b2);
    }
    //output:
    //is class StringClass.Java.lang.ClassSet1.Color an Enum class : true
    //is class StringClass.Java.lang.ClassSet1.Test10 an Enum class : false
}
