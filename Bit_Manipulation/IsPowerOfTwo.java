package Bit_Manipulation;

public class IsPowerOfTwo {
    public static void main(String[] args) {
        System.out.println(IsPowerOfTwo_fun(8));
        System.out.println(IsPowerOfTwo_fun(9));
    }

    private static boolean IsPowerOfTwo_fun(int n) {
        return ((n & (n - 1)) == 0);
    }
}
