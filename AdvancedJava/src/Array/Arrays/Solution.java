package Array.Arrays;

public class Solution {

    //2. Access elements in Array:
    public static void main0(String[] args) {
        int[] arr = {1, 2, 3, 4};

        // accessing element at index 2
        System.out.println(arr[2]);

        //output: 3
    }

    //3. Searching in Array:

    public static void main(String args[]) {

        int[] arr = new int[4];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //output:
        //1
        //2
        //3
        //4
    }


}





