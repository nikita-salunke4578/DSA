// Given an array of size n, write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not. If the array is sorted then return True, Else return False.
//Bruteforce Approach : Time complexity = o(n^2)
package Array;

public class CheckIsSorted {
    public static void main(String[] args) {
        int[] arr = {10, 2, 3, 4, 5};
        System.out.println(isSorted(arr));
    }

    private static boolean isSorted(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
