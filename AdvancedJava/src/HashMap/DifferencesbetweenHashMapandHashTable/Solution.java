package HashMap.DifferencesbetweenHashMapandHashTable;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

// Java program to demonstrate HashMap and HashTable
public class Solution {

    // Name of the class has to be "Main" only if the class is public
    public static void main(String args[]) {
        //----------hashtable -------------------------
        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
        ht.put(101, " Behabtu");
        ht.put(101, "Kidest");
        ht.put(102, "Yonas");
        ht.put(103, "Marta");
        System.out.println("-------------Hash table--------------");
        for (Map.Entry m : ht.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        //----------------hashmap--------------------------------
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(100, "behabtu");
        hm.put(104, "Marta");
        hm.put(101, "Kidest");
        hm.put(102, "yonas");
        System.out.println("-----------Hash map-----------");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        //output:
        // -------------Hash table--------------
        //103 Marta
        //102 Yonas
        //101 Kidest
        //-----------Hash map-----------
        //100 behabtu
        //101 Kidest
        //102 yonas
        //104 Marta
    }
}


