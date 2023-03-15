package Strings.StringClass.java.lang.ClassSet1;

import java.lang.reflect.Method;

// Java program to demonstrate getMethods() method
public class Test23 {

    public static void main(String[] args)
            throws SecurityException, ClassNotFoundException {
        // returns the Class object for the class
        // with the specified name
        Class c1 = Class.forName("java.lang.Object");

        // getMethods method on c1
        // it returns array of methods of Object class
        Method M[] = c1.getMethods();

        System.out.println("Below are the methods of Object class : ");

        // iterating through all methods of Object class
        for (Method method : M) {
            System.out.println(method);
        }
    }
   //output:
    //Below are the methods of Object class :
    //public final void java.lang.Object.wait(long,int) throws java.lang.InterruptedException
    //public final void java.lang.Object.wait() throws java.lang.InterruptedException
    //public final native void java.lang.Object.wait(long) throws java.lang.InterruptedException
    //public boolean java.lang.Object.equals(java.lang.Object)
    //public java.lang.String java.lang.Object.toString()
    //public native int java.lang.Object.hashCode()
    //public final native java.lang.Class java.lang.Object.getClass()
    //public final native void java.lang.Object.notify()
    //public final native void java.lang.Object.notifyAll()
}
