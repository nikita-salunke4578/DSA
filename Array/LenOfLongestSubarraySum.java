//BruteForce Approach :
//Example 1:
//Input Format: N = 3, k = 5, array[] = {2,3,5}
//Result: 2
//TC:O(n^3)
package Array;

public class LenOfLongestSubarraySum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5};
        int s = 5;
        int result = lenOfLongestSubarraySum(arr, s);
        System.out.println("Length of longest subarray of sum " + s + " =" + result);
    }

    private static int lenOfLongestSubarraySum(int[] arr, int s) {
        int len = 0;
        int start, end;

        for (int i = 0; i < arr.length; i++) {
            start = i;
            for (int j = i; j < arr.length; j++) {
                end = j;
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    sum += arr[k];
                }
                if (sum == s) {
                    len = Math.max(len, j - i + 1);
                }
            }
        }
        return len;
    }
}

