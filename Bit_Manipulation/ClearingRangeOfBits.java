package Bit_Manipulation;

public class ClearingRangeOfBits {
    public static void main(String[] args) {
        System.out.println(ClearingLastiBits_fun(15,3,4));
    }

    private static int ClearingLastiBits_fun(int n, int i, int j) {
        int a=(~0)<<(j+1);
        int b=(1<<i)-1;
        int BitMask=a|b;
        return n&BitMask;
    }
}
