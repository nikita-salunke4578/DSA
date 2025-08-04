//Here imp formula to remember is = rotated[(i+k)%n]=arr[i]
//Time Complexity : O(n) and Space Complexity : O(n)
package Array;

import java.util.Arrays;

public class RotateRightByK_optimize {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int k = 9;
        RotateRightByK_fun(arr, k);
    }

    private static void RotateRightByK_fun(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] rotated = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = arr[i];
        }

        System.out.println(Arrays.toString(rotated));
    }
}
