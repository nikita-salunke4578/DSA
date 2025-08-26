package Array;

import java.util.HashMap;

public class LongestSubArrayWithGivenSum_Optimize {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        Long k = 15L;

        System.out.println(findLongestSubarray(arr, k));
    }

    private static int findLongestSubarray(int[] arr, Long k) {

        HashMap<Long, Integer> mpp = new HashMap<>();
        int MaxLen = 0;
        Long sum = 0L;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == k) {
                MaxLen = Math.max(MaxLen, i + 1);
            }

            Long rem = sum - k;

            if (mpp.containsKey(rem)) {
                int len = i - mpp.get(rem);
                MaxLen = Math.max(MaxLen, len);
            }

            if (!mpp.containsKey(sum)) {
                mpp.put(sum, i);
            }
        }
        return MaxLen;
    }
}

