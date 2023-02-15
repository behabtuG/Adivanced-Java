package Methods.Overriding;

/* Java program to demonstrate overriding when
superclass method does not declare an exception
*/
public class Parent5 {

    void m1() {
        System.out.println("From parent m1()");
    }

    void m2() {
        System.out.println("From parent m2()");
    }
}

class Child5 extends Parent5 {
    @Override
        // no issue while throwing unchecked exception
    void m1() throws ArithmeticException {
        System.out.println("From child m1()");
    }

    // @Override
    // compile-time error issue while throwing checked exception
    //void m2() throws Exception {
    //    System.out.println("From child m2");
    // }

    //output:
    // error:m2() in Child cannot override m2() in Parent
    //void m2() throws Exception{ System.out.println("From child m2");}
    //       ^
   //overridden method does not throw Exception
}
