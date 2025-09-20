package Array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class FindLeaderInArray_Optimize {
    public static void main(String[] args) {
        int[] arr = {4, 7, 1, 0};
        findLeader(arr);
    }

    private static void findLeader(int[] arr) {

        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();

        int max = arr[n - 1];
        ans.add(arr[n - 1]);   //Since, Last Element is always leader

        for (int i = n - 2; i >= 0; i--) {

            if (arr[i] > max) {
                ans.add(arr[i]);
                max = arr[i];
            }

        }

        Collections.reverse(ans);
        System.out.println(ans);
    }
}
