package Abstract.Abstracts.Observation7;

public class D extends B {
    class E extends B.C {
        // implementing the abstract method
        void myAbstractMethod() {
            System.out.println("Inside abstract method implementation");
        }
    }

    public static void main(String args[]) {
        // Instantiating the outer class
        D outer = new D();

        // Instantiating the inner class
        D.E inner = outer.new E();
        inner.myAbstractMethod();
        //output: Inside abstract method implementation
    }
}
