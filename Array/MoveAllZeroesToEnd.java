//Move Zeros to end
//BruteForce Approach : TC: O(n) and SC:O(n) because of extra space for ArrayList
package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveAllZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {0,2,8,0,5,0};
        moveZerosToEnd(arr);
    }

    private static void moveZerosToEnd(int[] arr) {
        ArrayList<Integer> arrList = new ArrayList<>();
        int n = arr.length;
        for (int num : arr) {
            if (num != 0) {
                arrList.add(num);
            }
        }
        int nz = arrList.size();
        int i = 0;

        for (int num : arrList) {
            arr[i++] = num;
        }

        for (int j = nz; j < n; j++) {
            arr[j] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }
}
