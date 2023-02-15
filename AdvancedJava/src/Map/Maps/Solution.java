package Map.Maps;

import java.util.HashMap;
import java.util.Map;

// Java Program to Demonstrate Working of Map interface
public class Solution {


    public static void main0(String args[]) {
        // Creating an empty HashMap
        Map<String, Integer> hm = new HashMap<String, Integer>();

        // Inserting pairs in above Map using put() method
        hm.put("a", new Integer(100));
        hm.put("b", new Integer(200));
        hm.put("c", new Integer(300));
        hm.put("d", new Integer(400));

        // Traversing through Map using for-each loop
        for (Map.Entry<String, Integer> me :
                hm.entrySet()) {

            // Printing keys
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }

        //output:
        //a:100
        //b:200
        //c:300
        //d:400
    }

    //Class 1: HashMap
    // Java Program to illustrate the Hashmap Class

    public static void main(String[] args) {

        // Creating an empty HashMap
        Map<String, Integer> map = new HashMap<>();

        // Inserting entries in the Map using put() method
        map.put("Behabtu", 10);
        map.put("Kidest", 30);
        map.put("Husband", 20);

        // Iterating over Map
        for (Map.Entry<String, Integer> e : map.entrySet())

            // Printing key-value pairs
            System.out.println(e.getKey() + " " + e.getValue());

        //output:
        //Husband 20
        //Kidest 30
        //Behabtu 10

    }


}


