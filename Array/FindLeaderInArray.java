//Time complexity : O(n^2)
//Space complexity : O(n)

package Array;

import java.util.ArrayList;

public class FindLeaderInArray {
    public static void main(String[] args) {
        int[] arr={4, 7, 1, 0};
        findLeader(arr);
    }

    private static void findLeader(int[] arr) {

        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i< arr.length;i++){
            boolean leader=true;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]<arr[j]){
                    leader=false;
                    break;
                }
            }
            if(leader){
                ans.add(arr[i]);
            }
        }
        System.out.println(ans);
    }
}
