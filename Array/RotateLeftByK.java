//Left Rotate Array by K Places
//Here Time complexity : O(n^2)
package Array;

import java.sql.Array;
import java.util.Arrays;

public class RotateLeftByK {
    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 5, 3, -5};
        int k = 8;
        RotateLeftByK_fun(arr, k);
    }

    private static void RotateLeftByK_fun(int[] arr, int k) {
        int n = arr.length;

        for (int i = 0; i < k; i++) {
            int temp = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
