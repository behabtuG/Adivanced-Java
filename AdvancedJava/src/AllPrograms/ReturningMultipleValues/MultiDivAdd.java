package AllPrograms.ReturningMultipleValues;

// A Java program to demonstrate that we can return multiple values of different types by making a class and returning an object of class.
// A class that is used to store and return three members of different types
//We can encapsulate all returned types into a class and then return an object of that class.
public class MultiDivAdd {
    int mul; // To store multiplication
    double div; // To store division
    int add; // To store addition

    MultiDivAdd(int m, double d, int a) {
        mul = m;
        div = d;
        add = a;
    }
}
