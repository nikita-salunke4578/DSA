package Array;
//Write a program to copy an array by iterating the array.
//The Arrays.toString() method belongs to the Arrays class in Java. It converts an array into its string representation consisting of a list of the array’s elements

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] arr = {100, 90, 70, 83};
        int[] copied_arr = copy(arr);
        System.out.println(Arrays.toString(copied_arr));
    }

    private static int[] copy(int[] arr) {
        int[] arr2 = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        return arr2;
    }
}
