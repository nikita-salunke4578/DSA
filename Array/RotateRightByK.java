//Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
package Array;

import java.sql.Array;
import java.util.Arrays;

public class RotateRightByK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 20;
        RotateRightByK_fun(arr, k);
    }

    private static void RotateRightByK_fun(int[] arr, int k) {
        int n = arr.length;

        k = k % n;
        for (int i = 0; i < k; i++) {
            int temp = arr[n - 1];

            for (int j = n - 1; j >= 1; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
