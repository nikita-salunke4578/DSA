//Given an integer array nums sorted in non-decreasing order, remove all duplicates in-place so that each unique element appears only once. Return the number of unique elements in the array.
//TC :O(n*log(n))+O(n), Brute Force Approach
package Array;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {0, 0, 3, 3, 5, 6};
        int k = removeDuplicate(arr);
        System.out.println("Size=" + k);
        System.out.println("Array Element after removing duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static int removeDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int k = set.size();
        int j = 0;

        for (int x : set) {
            arr[j++] = x;
        }
        return k;
    }
}
