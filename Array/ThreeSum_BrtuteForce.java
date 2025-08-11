//TC: O(n^2)
package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum_BrtuteForce {
    public static void main(String[] args) {
        int nums[] = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeSum(nums);
        System.out.println(result);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);


        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                        if (!result.contains(triplet)) { // prevent duplicates
                            result.add(triplet);
                        }
                    }
                }
            }
        }
        return result;
    }
}
