//Problem Statement: Given an array of N integers, left rotate the array by one place.
//Here Time Complexity= O(n) and Space Complexity : O(n) bcoz we have take another array temp;
package Array;

import java.util.Arrays;

public class LeftRotateByOne {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        LeftRotateByOne_fun(arr);
    }

    private static void LeftRotateByOne_fun(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];

        for (int i = 1; i < n; i++) {
            temp[i - 1] = arr[i];
        }
        temp[n - 1] = arr[0];

        System.out.println(Arrays.toString(temp));
    }
}
