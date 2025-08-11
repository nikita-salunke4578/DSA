// TC: O(n^2)
// SC: O(n) extra for hashset
package Array;

import java.util.*;

public class ThreeSum_Better {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeSum(nums);
        System.out.println(result);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums); // sort for easy duplicate handling
        Set<List<Integer>> resultSet = new HashSet<>();

        for (int i = 0; i < n; i++) {
            Set<Integer> seen = new HashSet<>(); // reset for each i

            for (int j = i + 1; j < n; j++) {
                int third = -(nums[i] + nums[j]); // needed value for triplet

                if (seen.contains(third)) {
                    // sort triplet to handle duplicates
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], third);
                    resultSet.add(triplet);
                }

                seen.add(nums[j]);
            }
        }

        return new ArrayList<>(resultSet);
    }
}
