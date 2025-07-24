package Bit_Manipulation;


import java.util.Arrays;

public class CountingBits_Optimize {
    public static void main(String[] args) {
        int[] ans = countingbits_fun(5);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] countingbits_fun(int n) {
        int[] ans = new int[n + 1];
        ans[0] = 0;

        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i / 2] + (i % 2);
        }
        return ans;
    }
}

