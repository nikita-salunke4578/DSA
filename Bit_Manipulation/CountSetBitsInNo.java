package Bit_Manipulation;

public class CountSetBitsInNo {
    public static void main(String[] args) {
        System.out.println(CountSetBitsInNo_fun(15));
    }

    private static int CountSetBitsInNo_fun(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
}
