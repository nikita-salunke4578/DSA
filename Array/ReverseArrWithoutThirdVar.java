//Write a program to find and display reverse of an array Without using third variable.
package Array;

import java.util.Arrays;

public class ReverseArrWithoutThirdVar {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int[] reverse_arr = reverse(arr);
        System.out.println(Arrays.toString(reverse_arr));
    }

    private static int[] reverse(int[] arr) {
        int frontSideIndex = 0, length = arr.length, endSideIndex = length - 1;
        for (int i = 0; i < (length / 2); i++) {
            arr[frontSideIndex] = arr[frontSideIndex] + arr[endSideIndex];
            arr[endSideIndex] = arr[frontSideIndex] - arr[endSideIndex];
            arr[frontSideIndex] = arr[frontSideIndex] - arr[endSideIndex];
            frontSideIndex++;
            endSideIndex--;
        }
        return arr;
    }
}
