//TC: O(n), SC:O(1)
//First, we will run a loop that will continue until mid <= high.
//There can be three different values of mid pointer i.e. arr[mid]
//If arr[mid] == 0, we will swap arr[low] and arr[mid] and will increment both low and mid. Now the subarray from index 0 to (low-1) only contains 0.
//If arr[mid] == 1, we will just increment the mid pointer and then the index (mid-1) will point to 1 as it should according to the rules.
//If arr[mid] == 2, we will swap arr[mid] and arr[high] and will decrement high. Now the subarray from index high+1 to (n-1) only contains 2.
//In this step, we will do nothing to the mid-pointer as even after swapping, the subarray from mid to high(after decrementing high) might be unsorted. So, we will check the value of mid again in the next iteration.
//Finally, our array should be sorted.
package Array;

import java.util.Arrays;

public class SortArray012_Optimal {
    public static void main(String[] args) {
        int[] arr = {2, 0, 1};
        System.out.println("Original Array:" + Arrays.toString(arr));
        int[] result = sortArray(arr);
        System.out.println("Sorted Array :" + Arrays.toString(result));

    }

    private static int[] sortArray(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high)
            if (arr[mid] == 0) {
                swap(low, mid, arr);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else if (arr[mid] == 2) {
                swap(high, low, arr);
                high--;
            }
        return arr;
    }


    private static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
