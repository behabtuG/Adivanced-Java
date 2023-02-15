package HashSet.InitializingHashSetinJava;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

// Java code for initializing a Set
public class Solution {
    //Method 1: Using Constructors.Constructor:
    public static void main1(String[] args) {
        // creating and initializing an array (of non-primitive type)
        Integer arr[] = {5, 6, 7, 8, 1, 2, 3, 4, 3};

        // Set demonstration using HashSet Constructors.Constructor
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));

        // Duplicate elements are not printed in a set.
        System.out.println(set);
        // Output: [1, 2, 3, 4, 5, 6, 7, 8]
    }

    //Method 2 using Collections:
    public static void main2(String[] args) {
        // creating and initializing an array (of non-primitive type)
        Integer arr[] = {5, 6, 7, 8, 1, 2, 3, 4, 3};

        // Set demonstration using Collections.addAll
        Set<Integer> set = Collections.<Integer>emptySet();
        Collections.addAll(set =
                new HashSet<Integer>(Arrays.asList(arr)));

        // initializing set using Collections.unmodifiable set
        Set<Integer> set2 =
                Collections.unmodifiableSet(new HashSet<Integer>
                        (Arrays.asList(arr)));

        // Duplicate elements are not printed in a set.
        System.out.println(set);

        // output:  [1, 2, 3, 4, 5, 6, 7, 8]
    }

    //Method 3: using .add() each time
    public static void main(String[] args) {
        // Create a set
        Set<Integer> set = new HashSet<Integer>();

        // Add some elements to the set
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);

        // Adding a duplicate element has no effect
        set.add(3);
        System.out.println(set);
        //output: [1, 2, 3, 4, 5, 6, 7, 8]
    }
}
