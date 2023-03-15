package Strings.StringClass.java.lang.ClassSet1;

import java.lang.reflect.TypeVariable;

// Java program to demonstrate getTypeParameters() method
public class Test15 {

    public static void main(String[] args) throws ClassNotFoundException {
        // returns the Class object for the class
        // with the specified name
        Class c = Class.forName("java.util.Set");

        // getting array of TypeVariable for myClass object
        // getTypeParameters method
        TypeVariable[] tv = c.getTypeParameters();

        System.out.println("TypeVariables in " + c.getName() + " class : ");

        // iterating through all TypeVariables
        for (TypeVariable typeVariable : tv) {
            System.out.println(typeVariable);
        }
        //output:TypeVariables in java.util.Set class :
        //E
    }

}
