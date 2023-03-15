package DataStructures.Queue.PriorityQueue.MaximizearraysumafterKnegationsSet1;

import java.util.Arrays;

public class Solution {
// Java program to maximize array sum after k operations.

    // This function does k operations on array in a way that maximize the array sum. index --> stores the
    // index of current minimum element for j'th operation
    static int maximumSum(int arr[], int n, int k) {
        // Modify array K number of times
        for (int i = 1; i <= k; i++) {
            int min = +2147483647;
            int index = -1;

            // Find minimum element in array for current
            // operation and modify it i.e; arr[j] --> -arr[j]
            for (int j = 0; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    index = j;
                }
            }

            // this the condition if we find 0 as minimum
            // element, so it will useless to replace 0 by
            // -(0) for remaining operations
            if (min == 0)
                break;

            // Modify element of array
            arr[index] = -arr[index];
        }

        // Calculate sum of array
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += arr[i];
        return sum;
    }

    // Driver code
    public static void main0(String arg[]) {
        int arr[] = {-2, 0, 5, -1, 2};
        int k = 4;
        int n = arr.length;
        System.out.print(maximumSum(arr, n, k));

        //output:10
    }

    //Time Complexity: O(k*n)
    //Auxiliary Space: O(1)
    //Approach 2(Using Sort):When there is a need to negate at most k elements.to find maximum array sum after at most k negations.

    static int sol(int arr[], int k) {
        // Sorting given array using in-built java sort
        // function
        Arrays.sort(arr);
        int sum = 0;

        int i = 0;
        while (k > 0) {
            // If we find a 0 in our sorted array, we stop
            if (arr[i] >= 0)
                k = 0;
            else {
                arr[i] = (-1) * arr[i];
                k = k - 1;
            }
            i++;
        }

        // Calculating sum
        for (int j = 0; j < arr.length; j++)
            sum += arr[j];
        return sum;
    }

    // Driver Code
    public static void main1(String[] args) {
        int arr[] = {-2, 0, 5, -1, 2};
        System.out.println(sol(arr, 4));

        //output:10
    }

    //Time Complexity: O(n*logn)
    //Auxiliary Space: O(1)
    // Approach 3(Using Sort):
    // Java program to find maximum array sum after at most k negations.

    // Function to calculate sum of the array
    static int sumArray(int[] arr, int n) {
        int sum = 0;
        // Iterate from 0 to n - 1
        for (int i = 0; i < n; i++)
            sum += arr[i];
        return sum;
    }

    // Function to maximize sum
    static int maximizeSum(int arr[], int n, int k) {
        Arrays.sort(arr);
        int i = 0;

        // Iterate from 0 to n - 1
        for (i = 0; i < n; i++) {
            if (k != 0 && arr[i] < 0) {
                arr[i] *= -1;
                k--;
                continue;
            }
            break;
        }
        if (i == n)
            i--;

        if (k == 0 || k % 2 == 0)
            return sumArray(arr, n);

        if (i != 0 && Math.abs(arr[i]) >= Math.abs(arr[i - 1]))
            i--;

        arr[i] *= -1;
        return sumArray(arr, n);
    }

    // Driver Code
    public static void main(String args[]) {
        int n = 5;
        int arr[] = {-2, 0, 5, -1, 2};
        int k = 4;
        // Function Call
        System.out.print(maximizeSum(arr, n, k));

        //output:10
    }

    //Time Complexity: O(n*logn)
    //Auxiliary Space: O(1)

    //Maximize array sum after K negations | Set 2
}




