package ArrayList.VectorvsArrayListinJava;

import java.util.*;

public class Solution {
    public static void main1(String[] args) {
        /** public static List SynchronizedList (list1)
         // non synchronized
         ArrayList l1 = new ArrayList();
         // Synchronized
         List l = Collections.SynchronizedList(l1);
         */
    }

    public static void main(String[] args) {
        // creating an ArrayList
        ArrayList<String> al = new ArrayList<String>();

        // adding object to arraylist
        al.add("Practice.GeeksforGeeks.org");
        al.add("www.GeeksforGeeks.org");
        al.add("code.GeeksforGeeks.org");
        al.add("contribute.GeeksforGeeks.org");

        // traversing elements using Iterator'
        System.out.println("ArrayList elements are:");
        Iterator it = al.iterator();
        while (it.hasNext())
            System.out.println(it.next());

        // creating Vector
        Vector<String> v = new Vector<String>();
        v.addElement("Practice");
        v.addElement("quiz");
        v.addElement("code");

        // traversing elements using Enumeration
        System.out.println("\nVector elements are:");
        Enumeration e = v.elements();
        while (e.hasMoreElements())
            System.out.println(e.nextElement());
        //output:
        // ArrayList elements are:
        //Practice.GeeksforGeeks.org
        //www.GeeksforGeeks.org
        //code.GeeksforGeeks.org
        //contribute.GeeksforGeeks.org
        //
        //Vector elements are:
        //Practice
        //quiz
        //code
        //
        //Process finished with exit code 0
    }
}
