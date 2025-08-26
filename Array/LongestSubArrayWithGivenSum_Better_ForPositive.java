package Array;

public class LongestSubArrayWithGivenSum_Better_ForPositive {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        Long k = 10L;

        System.out.println(LongestSubArray(arr, k));
    }

    private static int LongestSubArray(int[] arr, Long k) {
        int n = arr.length;
        int left = 0, right = 0;
        int MaxLen = 0;
        Long sum = (long) arr[0];

        while (right < n) {

            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }

            if (sum == k) {
                MaxLen = Math.max(MaxLen, right - left + 1);
            }

            right++;
            if (right < n) {
                sum += arr[right];
            }
        }
        return MaxLen;
    }
}
