package DataStructures.Queue.ImplementStackusingQueues;

import java.util.LinkedList;
import java.util.Queue;

public class Solution2 {

    static Queue<Integer> q1 = new LinkedList<>(), q2 = new LinkedList<>();

    static void remove() {
        if (q1.isEmpty())
            return;

        // Leave one element in q1 and push others in q2.
        while (q1.size() != 1) {
            q2.add(q1.peek());
            q1.remove();
        }

        // Pop the only left element from q1
        q1.remove();

        // swap the names of two queues
        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
    }

    static void add(int x) {
        q1.add(x);
    }

    int top() {
        if (q1.isEmpty())
            return -1;
        while (q1.size() != 1) {
            q2.add(q1.peek());
            q1.remove();
        }

        // last pushed element
        int temp = q1.peek();

        // to empty the auxiliary queue after last operation
        q1.remove();

        // push last element to q2
        q2.add(temp);

        // swap the two queues names
        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
        return temp;
    }

    int size() {
        return q1.size();
    }


    // Driver code
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        s.add(1);
        s.add(2);
        s.add(3);

        System.out.println("current size: " + s.size());
        System.out.println(s.top());
        s.remove();
        System.out.println(s.top());
        s.remove();
        System.out.println(s.top());
        System.out.println("current size: " + s.size());

        //output:
        // current size: 3
        //3
        //2
        //1
        //current size: 1
    }

}
