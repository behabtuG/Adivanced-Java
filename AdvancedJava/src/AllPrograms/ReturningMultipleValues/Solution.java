package AllPrograms.ReturningMultipleValues;

//import javafx.util.Pair;

import java.util.Arrays;
import java.util.List;

public class Solution {
    // A Java program to demonstrate that a method can return multiple values of same type by returning an array
    // Returns an array such that first element of array is a+b, and second element is a-b

    //If all returned elements are of same type
    static int[] getSumAndSub(int a, int b) {
        int[] ans = new int[2];
        ans[0] = a + b;
        ans[1] = a - b;

        // returning array of elements
        return ans;
    }

    // Driver method
    public static void main0(String[] args) {
        int[] ans = getSumAndSub(100, 50);
        System.out.println("Sum = " + ans[0]);
        System.out.println("Sub = " + ans[1]);

        //output:
        // Sum = 150
        //Sub = 50

    }

    //If returned elements are of different types
    // A Java program to demonstrate that a method can return multiple values of same type by returning an array
    // Returns an array such that first element of array is a+b, and second element is a-b Returning a pair of values from a function

    //public static Pair<Integer, String> getTwo() {
    // return new Pair<Integer, String>(10, "GeeksforGeeks");
    //   }

    // Return multiple values from a method in Java 8
    // public static void main(String[] args) {
    //   Pair<Integer, String> p = getTwo();
    // System.out.println(p.getKey() + " " + p.getValue());
    //}

    //If there are more than two returned values


    static MultiDivAdd getMultDivAdd(int a, int b) {
        // Returning multiple values of different types by returning an object
        return new MultiDivAdd(a * b, (double) a / b, (a + b));
    }

    // Driver code
    public static void main1(String[] args) {
        MultiDivAdd ans = getMultDivAdd(10, 20);
        System.out.println("Multiplication = " + ans.mul);
        System.out.println("Division = " + ans.div);
        System.out.println("Addition = " + ans.add);

        //output:
        // Multiplication = 200
        //Division = 0.5
        //Addition = 30
    }

    // Java program to demonstrate return of multiple values from a function using list Object class.
    public static List<Object> getDetails() {
        String name = "Geek";
        int age = 35;
        char gender = 'M';

        return Arrays.asList(name, age, gender);
    }

    // Driver code
    public static void main(String[] args) {
        List<Object> person = getDetails();
        System.out.println(person);

        //output:[Geek, 35, M]
    }
}








