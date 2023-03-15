package Strings.StringClass.java.lang.ClassSet1;

// Java program to demonstrate isAnnotation() method
// declaring an Annotation Type
@interface A {

    // Annotation element definitions
}

class Test11 {
    public static void main(String[] args) throws ClassNotFoundException {
        // returns the Class object associated with A annotation
        Class c1 = A.class;

        // returns the Class object associated with Test class
        Class c2 = Test11.class;

        // checking for annotation type
        // isAnnotation method
        boolean b1 = c1.isAnnotation();
        boolean b2 = c2.isAnnotation();

        System.out.println("is " + c1.toString() + " an annotation : " + b1);
        System.out.println("is " + c2.toString() + " an annotation : " + b2);

    }
    //output:
    //is interface StringClass.Java.lang.ClassSet1.A an annotation : true
    //is class StringClass.Java.lang.ClassSet1.Test11 an annotation : false

}
