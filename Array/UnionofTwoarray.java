//Problem Statement: Given two sorted arrays, arr1, and arr2 of size n and m. Find the union of two sorted arrays.
//we will solve this problem using HashSet, it store only unique elements.
//The union of two arrays can be defined as the common and distinct elements in the two arrays.NOTE: Elements in the union should be in ascending order.
package Array;

import java.util.ArrayList;
import java.util.HashSet;

public class UnionofTwoarray {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2 ={2,3,4,4,5};
        int m= arr1.length,n= arr2.length;
        ArrayList<Integer> result=UnionTwoArray(arr1,arr2,m,n);
        System.out.println(result);
    }

    private static ArrayList<Integer> UnionTwoArray(int[] arr1, int[] arr2, int m, int n) {
        ArrayList<Integer> arrList=new ArrayList<>();
        HashSet<Integer> s=new HashSet<>();

        for (int num1:arr1) {
            s.add(num1);
        }

        for (int num2:arr2) {
            s.add(num2);
        }

        arrList.addAll(s);
        return arrList;
    }
}
