package Strings.StringClass.java.lang.ClassSet1;

// Java program to demonstrate isAnonymousClass() ,isLocalClass
// and isMemberClass() method
public class Test9 {

    // any Member class of Test9
    class A {
    }

    public static void main(String[] args) {
        // declaring an anonymous class
        Test9 t1 = new Test9() {
            // class definition of anonymous class
        };

        // returns the Class object associated with t1 object
        Class c1 = t1.getClass();

        // returns the Class object associated with Test9 class
        Class c2 = Test9.class;

        // returns the Class object associated with A class
        Class c3 = A.class;

        // checking for Anonymous class
        // isAnonymousClass method
        boolean b1 = c1.isAnonymousClass();
        System.out.println("is " + c1.toString() + " an anonymous class : " + b1);

        // checking for Local class
        // isLocalClass method
        boolean b2 = c2.isLocalClass();
        System.out.println("is " + c2.toString() + " a local class : " + b2);

        // checking for Member class
        // isMemberClass method
        boolean b3 = c3.isMemberClass();
        System.out.println("is " + c3.toString() + " a member class : " + b3);

    }
    //output:
    //is class StringClass.Java.lang.ClassSet1.Test9$1 an anonymous class : true
    //is class StringClass.Java.lang.ClassSet1.Test9 a local class : false
    //is class StringClass.Java.lang.ClassSet1.Test9$A a member class : true

}
