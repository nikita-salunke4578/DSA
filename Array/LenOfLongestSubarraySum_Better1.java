//Better Approach :
//Example 1:
//Input Format: N = 3, k = 5, array[] = {2,3,5}
//Result: 2
//TC:O(n^2)
package Array;

public class LenOfLongestSubarraySum_Better1 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5};
        int s = 5;
        int result = LenthOfLongestSubarraySum(arr, s);
        System.out.println("Length of Longest Subarray of sum " + s + " =" + result);
    }

    private static int LenthOfLongestSubarraySum(int[] arr, int s) {
        int len = 0;
        int sum;

        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == s) {
                    len = Math.max(len, j - i + 1);
                }
            }
        }
        return len;
    }
}
