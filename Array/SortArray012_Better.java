//TC:O(n),SC:O(1)
//Step 1 : as we have to sort array which contain only 0,1,& 2 , so we will make 3 variables, count_0,count_1, count_2.
//step 2 : iterate over array, count 0,1,2.
//step 3 : now, update array, add 0's of count_0, 1's of count_1, 2's of count count_2, then return array
package Array;

import java.util.Arrays;

public class SortArray012_Better {
    public static void main(String[] args) {
        int[] arr = {2, 0, 1, 1, 2, 0, 0};
        System.out.println("Original Array:" + Arrays.toString(arr));
        int[] result = sortArray(arr);
        System.out.println("Sorted Array :" + Arrays.toString(result));
    }

    private static int[] sortArray(int[] arr) {
        int count_0 = 0, count_1 = 0, count_2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count_0++;
            } else if (arr[i] == 1) {
                count_1++;
            } else {
                count_2++;
            }
        }

        for (int i = 0; i < count_0; i++) {
            arr[i] = 0;
        }
        for (int i = count_0; i < count_0 + count_1; i++) {
            arr[i] = 1;
        }
        for (int i = count_0 + count_1; i < arr.length; i++) {
            arr[i] = 2;
        }
        return arr;
    }
}
