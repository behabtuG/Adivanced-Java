package DataStructures.Queue.QueueusingStacks;

import java.util.Stack;

public class QOneStack {

    //class of queue having two stacks
    static class Queue {
        Stack<Integer> stack1;
        Stack<Integer> stack2;
    }

    //function to push an item to stack
    static void push(Stack<Integer> top_ref, int new_data) {

        //put the data
        top_ref.push(new_data);
    }

    //function to top pop an item from stack
    static int pop(Stack<Integer> top_ref) {


        //if stack is empty then error
        if (top_ref == null) {
            System.out.println("Stack Underflow");
            System.exit(0);
        }
        //return element from stack
        return top_ref.pop();
    }

    //function to enqueue an item to queue
    static void enQueue(Queue q, int x) {
        push(q.stack1, x);
    }

    //function to deQueue an item from queue
    static int deQueue(Queue q) {
        int x, res = 0;
        //if the stacks is empty then error
        if (q.stack1.isEmpty()) {
            System.out.println("Q is Empty");
            System.exit(0);
        }

        //Check if it is a last element of stack
        else if (q.stack1.size() == 1) {
            return pop(q.stack1);
        } else {
            //pop an item from the stack1
            x = pop(q.stack1);
            //store the last deQueued item
            res = deQueue(q);

            //push everything back to stack1
            push(q.stack1, x);
            return res;
        }
        return 0;
    }

    public static void main(String[] args) {
        // create a queue with item 1 2 3
        Queue q = new Queue();
        q.stack1 = new Stack<>();

        enQueue(q, 1);
        enQueue(q, 2);
        enQueue(q, 3);

        //Dequeue items
        System.out.println(deQueue(q) + "");
        System.out.println(deQueue(q) + "");
        System.out.println(deQueue(q) + "");

        //output:
        // 1
        //2
        //3
    }
}
