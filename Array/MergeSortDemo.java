package Array;

import java.util.Arrays;
import java.util.Vector;

public class MergeSortDemo {
    public static void main(String[] args) {
        int [] arr={6,3,2,8};
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int start, int end) {
        if(start<end){
            int mid=start+(end-start)/2;

            mergeSort(arr,0,mid);           //Left Side
            mergeSort(arr,mid+1,end);       //Right Side

            merge(arr,start,mid,end);
        }
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        Vector<Integer>  temp = new Vector<>();
        int i=start;
        int j=mid+1;

        while(i<=mid && j<=end){
            if(arr[i]<=arr[j]){
                temp.add(arr[i]);
                i++;
            }else{
                temp.add(arr[j]);
                j++;
            }
        }

        while(i<=mid){
            temp.add(arr[i]);
            i++;
        }
        while(j<=end){
            temp.add(arr[j]);
            j++;
        }

        for (int idx = 0; idx < temp.size(); idx++) {
            arr[idx+start]= temp.get(idx);
        }

    }
}
