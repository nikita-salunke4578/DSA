package Bit_Manipulation;

import java.util.Arrays;

public class CountingBits_Brute {
    public static void main(String[] args) {
        int [] result=CountingBits_fun(5);
        System.out.println(Arrays.toString(result));
    }

    private static int[] CountingBits_fun(int n) {
        int[] ans=new int[n+1];

        for (int i = 0; i <=n; i++) {
            int count=0;

            String Binary=Integer.toBinaryString(i);

            for (int j = 0; j < Binary.length(); j++) {
                if(Binary.charAt(j)=='1'){
                    count++;
                }
            }
            ans[i]=count;
        }
        return ans;
    }
}
