//Return Longest Subarray length having sum...
package Array;

public class LongestSubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        int key = 3;
        System.out.println(getLongestSubArrayLenWithGivenSum(arr, key));
    }

    private static int getLongestSubArrayLenWithGivenSum(int[] arr, int key) {
        int start, end, currsum;
        int len = 0;

        for (int i = 0; i < arr.length; i++) {
            start = i;
            for (int j = i; j < arr.length; j++) {
                end = j;
                currsum = 0; // reset before summing this subarray
                for (int k = start; k <= end; k++) {
                    currsum += arr[k];
                }
                if (currsum == key) { // check after full sum is computed
                    len = Math.max((j - i) + 1, len);
                }
            }
        }
        return len;
    }
}
