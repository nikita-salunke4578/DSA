package Array;

import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;
        reverse_fun(arr, 0, n - 1);
        System.out.println("Reverse Array : " + Arrays.toString(arr));
    }

    private static void reverse_fun(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

    }
}
