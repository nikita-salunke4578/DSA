package Array;

import java.util.Arrays;

public class RotateLeftByK_Optimal {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;
        int k = 2;

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k);
        reverse(arr, k + 1, n - 1);
        System.out.println("Array After Rotating by " + k + " elements : " + Arrays.toString(arr));
    }

    private static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

    }
}
//10 20 30 40 50
// 20 30 40 50 10  k=1
//30 40 50 10 20   k=2

//Initial : 10 20 30 40 50
//reverse : 50 40 30 20 10
// reverse from 0 to k : 30 40 50 20 10
// reverse from k+1 to n-1: 30 40 50 10 20
