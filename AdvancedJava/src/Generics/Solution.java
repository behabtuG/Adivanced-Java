package Generics;

// Driver class to test above
public class Solution {

    public static void main(String[] args) {
        // instance of Integer type
        Test<Integer> iObj = new Test<Integer>(15);
        System.out.println(iObj.getObject());

        // instance of String type
        Test<String> sObj = new Test<String>("GeeksForGeeks");
        System.out.println(sObj.getObject());

        //output:
        // 15
        //GeeksForGeeks

        Tests<String, Integer> obj = new Tests<String, Integer>("GfG", 15);
        obj.print();

        //output:
        // GfG
        //15


        //Generic Types Differ Based on Their Type Arguments:
        // instance of Integer type
        Test<Integer> inObj = new Test<Integer>(15);
        System.out.println(inObj.getObject());

        // instance of String type
        Test<String> stObj = new Test<String>("GeeksForGeeks");
        System.out.println(stObj.getObject());
        //inObj = stObj; // This results an error

        //error:
        // incompatible types:
        // Test cannot be converted to Test

    }
}
