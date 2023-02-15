package Stack.FindMaximuminStackinthoutUsingAdditionalStack;

public class Solution {

    static class Block {

        // A block has two elements
        // as components
        int value, localMax;
    }

    static class Stack {

        // Pointer of type block,
        // Will be useful later as the
        // size can be dynamically allocated
        Block S[];
        int size, top;


        Stack(int n) {

            // Setting size of stack and
            // initial value of top
            size = n;
            S = new Block[n];
            for (int i = 0; i < n; i++) S[i] = new Block();
            top = -1;
        }

        // Function to push an element to the stack
        void push(int n) {

            // Doesn't allow pushing elements
            // if stack is full
            if (top == size - 1) {
                System.out.print("Stack is full");
            } else {
                top++;

                // If the inserted element is the first element
                // then it is the maximum element, since no other
                // elements is in the stack, so the localMax
                // of the first element is the element itself
                if (top == 0) {
                    S[top].value = n;
                    S[top].localMax = n;
                } else {

                    // If the newly pushed element is
                    // less than the localMax of element below it,
                    // Then the over all maximum doesn't change
                    // and hence, the localMax of the newly inserted
                    // element is same as element below it
                    if (S[top - 1].localMax > n) {
                        S[top].value = n;
                        S[top].localMax = S[top - 1].localMax;
                    }

                    // Newly inserted element is greater than the localMax
                    // below it, hence the localMax of new element
                    // is the element itself
                    else {
                        S[top].value = n;
                        S[top].localMax = n;
                    }
                }

                System.out.println(n + " inserted in stack");
            }
        }

        // Function to remove an element
        // from the top of the stack
        void pop() {

            // If stack is empty
            if (top == -1) {
                System.out.println("Stack is empty");
            }

            // Remove the element if the stack
            // is not empty
            else {
                top--;
                System.out.println("Element popped");
            }
        }

        // Function to find the maximum
        // element from the stack
        void max() {

            // If stack is empty
            if (top == -1) {
                System.out.println("Stack is empty");
            } else {

                // The overall maximum is the local maximum
                // of the top element
                System.out.println("Maximum value in the stack: " +
                        S[top].localMax);
            }
        }
    }

    // Driver code
    public static void main(String args[]) {

        // Create stack of size 5
        Stack S1 = new Stack(5);

        S1.push(2);
        S1.max();
        S1.push(6);
        S1.max();
        S1.pop();
        S1.max();

        //output:
        // 2 inserted in stack
        //Maximum value in the stack: 2
        //6 inserted in stack
        //Maximum value in the stack: 6
        //Element popped
        //Maximum value in the stack: 2
    }
}


