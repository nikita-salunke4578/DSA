//Problem Statement: Given an array of N integers, left rotate the array by one place.
//Optimize Solution :
// Here Time Complexity= O(n) and Space Complexity : O(n) bcoz we have take another array temp;
package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LeftRotateByOne_optimize {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        LeftRotateByOne_fun(arr);

    }

    private static void LeftRotateByOne_fun(int[] arr) {
        int n = arr.length;
        int temp = arr[0];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
