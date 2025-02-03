package Array;

import java.util.*;

public class CheckSpecificVal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter Array Elemnts");
        //input array elements from user
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Your array Elements:");
        for (int x : arr) {
            System.out.println(x);
        }
        System.out.println("Enter Value to be check:");
        int Ele = sc.nextInt();

        Boolean result = Check(arr, Ele);
        if (result) {
            System.out.println("Element is found in array");
        } else {
            System.out.println("Element is not present in array");
        }
    }

    private static Boolean Check(int[] arr, int ele) {
        for (int i = 0; i < arr.length; i++) {
            if (ele == arr[i]) {
                return true;
            }
        }
        return false;
    }
}
