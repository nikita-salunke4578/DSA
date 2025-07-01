import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {6, 3, 8, 2};
        mergeSort(arr);
        System.out.println("Sorted: " + Arrays.toString(arr));
    }

    static void mergeSort(int[] arr) {
        if (arr.length < 2) return;

        int mid = arr.length / 2;

        // Split the array
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        // Recursively sort each half
        mergeSort(left);
        mergeSort(right);

        // Merge them back
        merge(arr, left, right);
    }

    static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Compare elements and merge
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        // Copy leftover elements
        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];
    }
}
