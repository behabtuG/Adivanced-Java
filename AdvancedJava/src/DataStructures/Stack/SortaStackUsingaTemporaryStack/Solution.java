package DataStructures.Stack.SortaStackUsingaTemporaryStack;

import java.util.Stack;

public class Solution {
    //Sort a stack
    public static Stack<Integer> sortStack(Stack<Integer> input) {

        Stack<Integer> tmpStack = new Stack<Integer>();
        while (!input.isEmpty()) {

            //pop out the first element
            int tmp = input.pop();

            //while temporary stack is not empty and top of stack is greater than temp
            while (!tmpStack.isEmpty() && tmpStack.peek() > tmp) {

                //pop from temporary stack and push it to the input stack
                input.push(tmpStack.pop());
            }

            //push temp in temporary of stack
            tmpStack.push(tmp);
        }
        return tmpStack;
    }

    public static void main(String[] args) {

        Stack<Integer> input = new Stack<Integer>();
        input.add(34);
        input.add(3);
        input.add(31);
        input.add(98);
        input.add(92);
        input.add(23);

        //This is the temporary stack
        Stack<Integer> tmpStack = sortStack(input);
        System.out.println("Sorted numbers are: ");//
        while (!tmpStack.isEmpty()) {
            System.out.println(tmpStack.pop() + "");
        }
        //Sorted numbers are:
        // 98 92 34 31 23 3
        
    }
}
