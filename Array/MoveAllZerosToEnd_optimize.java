package Array;

import java.util.Arrays;

public class MoveAllZerosToEnd_optimize {
    public static void main(String[] args) {
        int[] arr={0,0,20,7};
        MoveAllZeroesToEnd_fun(arr);
    }

    private static void MoveAllZeroesToEnd_fun(int[] arr) {
        int n=arr.length;
        int j=-1;

        for(int i=0;i<n;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }

        if (j==-1)return;

        for (int i = j+1; i < n; i++) {
            if(arr[i]!=0){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

