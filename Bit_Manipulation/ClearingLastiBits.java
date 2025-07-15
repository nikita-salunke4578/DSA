package Bit_Manipulation;

public class ClearingLastiBits {
    public static void main(String[] args) {
        System.out.println(ClearingLastiBits_fun(11, 2));
    }

    private static int ClearingLastiBits_fun(int n, int i) {
        int BitMask = (~0) << i;
        return n & BitMask;
    }
}
