package Array;

public class LongestSubArrayGivenSum_bruteforce {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        int key = 4;

        LonestSubArray(arr, key);
    }

    private static void LonestSubArray(int[] arr, int key) {

        int MaxLen = 0;
        int sum;

        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == key) {
                    MaxLen = Math.max(MaxLen, (j - i) + 1);
                }
            }
        }
        System.out.println(MaxLen);
    }
}
