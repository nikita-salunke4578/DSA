//But if our given array is already sorted then in that case no need to go through all iteration , so here is optimized solution.
package Array;

import java.util.Arrays;

public class BubbleSortOptimize {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] result = BubbleSortAlgo(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    private static int[] BubbleSortAlgo(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swap = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swap = true;
                }
                if (!swap) {
                    break;
                }
            }

        }
        return arr;
    }

}
