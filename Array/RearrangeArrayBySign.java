//2149. Rearrange Array Elements by Sign
//
//You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.
//
//You should return the array of nums such that the the array follows the given conditions:
//
//Every consecutive pair of integers have opposite signs.
//For all integers with the same sign, the order in which they were present in nums is preserved.
//The rearranged array begins with a positive integer.
//Return the modified array after rearranging the elements to satisfy the aforementioned conditions.
package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeArrayBySign {
    public static void main(String[] args) {
        int nums[] = {3, 1, -2, -5, 2, -4};
        RearrangeArray(nums);
    }

    private static void RearrangeArray(int[] nums) {
        ArrayList<Integer> Positive = new ArrayList<>();
        ArrayList<Integer> Negative = new ArrayList<>();


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                Positive.add(nums[i]);
            } else {
                Negative.add(nums[i]);
            }
        }


        int PositiveIdx = 0, NegativeIdx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = Positive.get(PositiveIdx);
                PositiveIdx++;
            } else {
                nums[i] = Negative.get(NegativeIdx);
                NegativeIdx++;
            }
        }

        System.out.println("Modified Array : " + Arrays.toString(nums));
    }



}


//Time complexity : O(n)
//Space complexity : O(n)