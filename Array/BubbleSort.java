//Bubble Sort : Time Complexity : Best- O(n) , worst & average - O(n^2)
package Array;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={7,3,2,1,2};
        int [] result=BubbleSortAlgo(arr);
        System.out.println("Sorted Array: "+ Arrays.toString(arr));
    }

    private static int[] BubbleSortAlgo(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}
