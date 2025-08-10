//Brute force Approach
//TC: O(n^2), SC:O(1)
package Array;

import java.util.Arrays;

public class TwoSumProblem {
    public static void main(String[] args) {
        int N = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;

        int[] result = TwoSum(arr, N, target);
        System.out.println(Arrays.toString(result));
    }

    private static int[] TwoSum(int[] arr, int n, int target) {
        for (int i = 0; i < n; i++) {
            int remaining = target - arr[i];
            int idx = Search(remaining, arr);
            if (idx > 0) {
                return new int[]{i, idx};
            }
        }
        return new int[]{};
    }

    private static int Search(int key, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
