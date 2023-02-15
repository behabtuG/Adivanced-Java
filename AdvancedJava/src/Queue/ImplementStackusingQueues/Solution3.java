package Queue.ImplementStackusingQueues;

import java.util.LinkedList;
import java.util.Queue;

public class Solution3 {
    //Queue one
    static Queue<Integer> q1 = new LinkedList<>();

    static void push(int x) {
        //get previous size of queue
        int s = q1.size();

        //Push the current element
        q1.add(x);

        //Pop all the previous elements and put them after current element
        for (int i = 0; i < s; i++) {
            q1.add(q1.remove());
        }
    }

    static void pop() {
        //if no elements are there in q1
        if (q1.isEmpty())
            return;
        q1.remove();
    }

    int top() {
        if (q1.isEmpty())
            return -1;
        return q1.peek();
    }

    int size() {
        return q1.size();
    }

    public static void main(String[] args) {
        Solution3 s = new Solution3();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("Current size:" + s.size());
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
        System.out.println("current size: " + s.size());
        //output:
        // Current size:3
        //3
        //2
        //1
        //current size: 1
    }
}
