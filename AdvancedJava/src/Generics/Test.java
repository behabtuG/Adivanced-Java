package Generics;

// Java program to show working of user defined Generic classes
// We use < > to specify Parameter type
public class Test<T> {

    // An object of type T is declared
    T obj;

    Test(T obj) {
        this.obj = obj;
    }

    // constructor
    public T getObject() {
        return this.obj;
    }
}
