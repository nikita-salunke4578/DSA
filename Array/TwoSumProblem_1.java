//TC:O(n^2) and SC: O(n)
package Array;

import java.util.Arrays;

public class TwoSumProblem_1 {
    public static void main(String[] args) {
        {
            int N = 2;
            int[] arr = {2, 6};
            int target = 14;

            int[] result = TwoSum(arr, N, target);
            System.out.println(Arrays.toString(result));
        }
    }

    private static int[] TwoSum(int[] arr, int n, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
