package Stack.Stacks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Solution {

    //pushing element on the top of the stack
    static void stack_push(Stack<Integer> stack) {
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
    }

    //popping element from the top of the stack
    static void stack_pop(Stack<Integer> stack) {
        System.out.println("Pop Operation");//Pop Operation
        for (int i = 0; i < 5; i++) {
            Integer y = (Integer) stack.pop();
            System.out.println(y);// 0 1 2 3 4
            //Pop Operation
            // 4
            // 3
            // 2
            // 1
        }
    }

    //Displaying element on the top of the stack
    static void stack_peek(Stack<Integer> stack) {

        Integer element = (Integer) stack.peek();
        System.out.println("Element on stack top: " + element);//Element on stack top: 4
    }

    //Searching element in the stack
    static void stack_search(Stack<Integer> stack, int element) {
        Integer pos = (Integer) stack.search(element);

        if (pos == -1)
            System.out.println("Element not found"); //Element not found
        else
            System.out.println("Element is found at position: " + pos);//Element is found at position: 3
    }

    public static void main1(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        stack_push(stack);
        stack_pop(stack);
        stack_push(stack);
        stack_peek(stack);
        stack_search(stack, 2);
        stack_search(stack, 6);
    }

    //1. Adding Elements
    public static void main2(String[] args) {

        //Default initialization of Stack
        Stack stack1 = new Stack();

        //Initialization of Stack using Generics
        Stack<String> stack2 = new Stack<String>();

        //pushing the elements
        stack1.push(4);
        stack1.push("All");
        stack1.push("Geeks");

        stack2.push("Geeks");
        stack2.push("For");
        stack2.push("Geeks");

        //printing the Stack Elements
        System.out.println(stack1);//[4, All, Geeks]
        System.out.println(stack2);//[Geeks, For, Geeks]

    }

    //2. Accessing the Element
    public static void main3(String[] args) {

        //Creating an Empty Stack
        Stack<String> stack = new Stack<String>();

        //Use push() to add elements into the Stack
        stack.push("Welcome");
        stack.push("To");
        stack.push("Geeks");
        stack.push("For");
        stack.push("Geeks");

        //Displaying the Stack
        System.out.println("Initial Stack: " + stack);//Initial Stack: [Welcome, To, Geeks, For, Geeks]

        //Fetching the element at the head of the Stack
        System.out.println("The element at the top of the stack is: " + stack.peek());//The element at the top of the stack is: Geeks

        //Displaying the Stack after the Operation
        System.out.println("Final Stack: " + stack);//Final Stack: [Welcome, To, Geeks, For, Geeks]
    }

    //3. Removing Elements:
    public static void main4(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(10);
        stack.push(15);
        stack.push(30);
        stack.push(20);
        stack.push(5);

        System.out.println("Initial Stack: " + stack);//Initial Stack: [10, 15, 30, 20, 5]
        System.out.println("Popped element: " + stack.pop());//Popped element: 5
        System.out.println("Popped element: " + stack.pop());//Popped element: 20
        System.out.println("Stack after pop operation: " + stack);//Stack after pop operation: [10, 15, 30]
    }

    //Note: Please note that the Stack class in Java is a legacy class and inherits from Vector in Java.
    public static void main(String[] args) {

        Deque<Character> stack = new ArrayDeque<Character>();
        stack.push('A');
        stack.push('B');
        System.out.println(stack.peek());//B
        System.out.println(stack.pop());//B
    }
}
