//Sort an array of 0s, 1s and 2s
//Bruteforce Approach
//TC: O(n^2), SC:O(1)

package Array;

import java.util.Arrays;

public class SortArray012 {
    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0};
        System.out.println("Original Array:" + Arrays.toString(arr));
        int[] result = sortArray(arr);
        System.out.println("Sorted Array :" + Arrays.toString(result));
    }

    private static int[] sortArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
