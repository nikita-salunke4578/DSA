// Given an array of size n, write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not. If the array is sorted then return True, Else return False.
//Efficient Approach : Time complexity = o(n)
package Array;

public class CheckIsSorted_Efficient {
    public static void main(String[] args) {
        int[] arr = {1, 2, 30, 4, 5};
        System.out.println(is_Sorted(arr));
    }

    private static boolean is_Sorted(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
