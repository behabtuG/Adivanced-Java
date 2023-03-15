package DataStructures.Stack.SortstringofcharactersusingStack;

import java.util.Stack;

// Java program to sort string of characters using stack
public class Solution {


    // Function to print the characters in sorted order
    public static void printSorted(String s, int l) {

        // Primary stack
        Stack<Character> stack = new Stack<Character>();

        // Secondary stack
        Stack<Character> tempstack = new Stack<Character>();

        // Append first character
        stack.push(s.charAt(0));

        // Iterate for all character in string
        for (int i = 1; i < l; i++) {

            // i-th character ASCII
            int a = s.charAt(i);

            // Stack's top element ASCII
            int b = (int) ((char) stack.peek());

            // If greater or equal to top element
            // then push to stack
            if ((a - b) >= 1 || (a == b)) {
                stack.push(s.charAt(i));
            }

            // If smaller, then push all element
            // to the temporary stack
            else if ((b - a) >= 1) {

                // Push all greater elements
                while ((b - a) >= 1) {

                    // Push operation
                    tempstack.push(stack.peek());
                    stack.pop();

                    // Push till the stack is not-empty
                    if (stack.size() > 0) {
                        b = (int) ((char) stack.peek());
                    } else {
                        break;
                    }
                }

                // Push the i-th character
                stack.push(s.charAt(i));

                // Push the tempstack back to stack
                while (tempstack.size() > 0) {
                    stack.push(tempstack.peek());
                    tempstack.pop();
                }
            }
        }

        // Print the stack in reverse order
        String answer = "";
        while (stack.size() > 0) {
            answer = stack.peek() + answer;
            stack.pop();
        }
        System.out.println(answer);
    }

    // Driver Code
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        int l = s.length();

        printSorted(s, l);

        //output: eeeefggkkorss

    }
}



