//Right rotate an array by k places
//arr={10,20,30,40,50}; k=2;  n=arr.length;   O/P:{40,50,10,20,30}
//step 1 : Reverse whole array.  {50,40,30,20,10}
//step 2 : Reverse array from 0 to k-1 (50,40) => {40,50,30,20,10}
//step 3 : Reverse array from k to n-1 (30,20,10) => {40,50,10,20,30}
//final O/P : {40,50,10,20,30}....congrats you got your O/P....keep it up...
package Array;

import java.util.Arrays;

public class RotateRightByK_Efficient {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int k = 2;
        int n = arr.length;

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k-1);
        reverse(arr, k , n - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
//10 20 30  40 50
//50 10 20 30 40  k=1
//40 50 10 20 30

