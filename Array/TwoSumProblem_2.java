//Using HashMap
//TC:O(n^2) and SC:O(n)
package Array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumProblem_2 {
    public static void main(String[] args) {

        int N = 5;
        int[] arr = {2, 6, 5, 7, 8};
        int target = 14;

        int[] result = TwoSum(arr, N, target);
        System.out.println(Arrays.toString(result));
    }

    private static int[] TwoSum(int[] arr, int n, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int remaining = target - arr[i];

            if (map.containsKey(remaining)) {
                int idx = map.get(remaining);
                return new int[]{i, idx};
            }
            map.put(arr[i], i);
        }
        return new int[]{-1, -1};
    }
}
