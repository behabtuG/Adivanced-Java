package ArrayList.InitializeanArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    // Java code to illustrate initialization of ArrayList using add() method

    public static void main0(String args[]) {

        // create a ArrayList String type
        ArrayList<String> gfg = new ArrayList<String>();

        // Initialize an ArrayList with add()
        gfg.add("Geeks");
        gfg.add("for");
        gfg.add("Geeks");

        // print ArrayList
        System.out.println("ArrayList : " + gfg);

        //output: ArrayList : [Geeks, for, Geeks]
    }

    //Examples: Using shorthand version of this method
    // Java code to illustrate initialization of ArrayList using add() method
    public static void main1(String args[]) {

        // create a ArrayList String type
        // and Initialize an ArrayList with add()
        ArrayList<String> gfg = new ArrayList<String>() {
            {
                add("Geeks");
                add("for");
                add("Geeks");
            }
        };

        // print ArrayList
        System.out.println("ArrayList : " + gfg);

        //output:ArrayList : [Geeks, for, Geeks]

    }

    // 2. Initialization using asList()
    // Java code to illustrate initialization of ArrayList using asList method

    public static void main2(String args[]) {

        // create a ArrayList String type and Initialize an ArrayList with asList()
        ArrayList<String> gfg = new ArrayList<String>(
                Arrays.asList("Geeks",
                        "for",
                        "Geeks"));

        // print ArrayList
        System.out.println("ArrayList : " + gfg);

        //output: ArrayList : [Geeks, for, Geeks]
    }

    //3. Initialization using List.of() method
    // Java code to illustrate initialization of ArrayList using List.of() method

    public static void main4(String args[]) {

        // create a ArrayList String type and Initialize an ArrayList with List.of()
        List<String> gfg = new ArrayList<>(
                List.of("Geeks",
                        "for",
                        "Geeks"));
        // print ArrayList
        System.out.println("ArrayList : " + gfg);

        //output: ArrayList : [Geeks, for, Geeks]
    }

    //4. Initialization using another Collection
    // Java code to illustrate initialization of ArrayList using another collection

    public static void main(String args[]) {

        // create another collection
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        // create a ArrayList Integer type and Initialize an ArrayList with arr
        List<Integer> gfg = new ArrayList<Integer>(arr);

        // print ArrayList
        System.out.println("ArrayList : " + gfg);

    //output: ArrayList : [1, 2, 3, 4, 5]
    }


}

