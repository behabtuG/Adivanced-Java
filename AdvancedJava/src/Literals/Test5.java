package Literals;

// Java program to illustrate the behaviour of
// char literals and integer literals when
// we are performing addition
public class Test5 {

    public static void main(String[] args) {
        // ASCII value of 0 is 48
        int first = '0';

        // ASCII value of 7 is 55
        int second = '7';
        System.out.println("Geeks!" + first + '2' + second);
    }

    //output:Geeks!48255

    // Explanation: Whenever we are performing addition between a string and integer, the overall result is converted into a string.
    //The above program evaluation is done in the following way:
    //"Geeks!" + first + '2' + second
    //"Geeks! " + 48 + '2' + 55
    //"Geeks!48" + '2' + 55
    //"Geeks!482" + 55
    //"Geeks!48255"
}
