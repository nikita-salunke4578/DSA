package Array;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {56, 20, 300, 8};
        int[] result = insertionSortAlgo(arr);
        System.out.println("Sorted Array :"+ Arrays.toString(arr));
    }

    private static int[] insertionSortAlgo(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
}
