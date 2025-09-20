package Array;

import java.util.Arrays;

public class RearrangeArrayBySign_2 {
    public static void main(String[] args) {
        int nums[] = {3, 1, -2, -5, 2, -4};
        RearrangeArray(nums);
    }

    private static void RearrangeArray(int[] nums) {

        int[] result = new int[nums.length];
        int posIndex = 0, NegIndex = 0;

        for (int i = 0; i < result.length; i++) {
            if (i % 2 == 0) {
                while (nums[posIndex] < 0) posIndex++;
                result[i] = nums[posIndex++];
            } else {
                while (nums[NegIndex] > 0) NegIndex++;
                result[i] = nums[NegIndex++];
            }
        }
        System.out.println("Modified Array:" + Arrays.toString(result));
    }

}
