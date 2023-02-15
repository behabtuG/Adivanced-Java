package AllPrograms.FindDuplicate;

import java.util.*;

public class Solution {


    public static int[] findDuplicateInArray(int[] arr) {
        Set<Integer> set = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!set.add(arr[i])) {
                duplicates.add(arr[i]);
            }
        }
        return duplicates.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String args[]) {
        // Your array
        int[] array = {3, 6, 8, 2, 5, 8, 10, 11, 6};
        /**
         // Step 1:
         // Create a HashSet
         HashSet<Integer> set = new HashSet<Integer>();

         // Step 2:
         // Iterate over the array
         for (int i : array) {
         // Step 3:
         // If same integer is already present then print duplicate
         if (set.contains(i)) {
         System.out.println("Duplicate element is : " + i);
         } else {
         // Else add element to HashSet
         set.add(i);
         System.out.println(set);
         }
         }
         */
        System.out.println(Arrays.toString(findDuplicateInArray(array)));
    }
}
