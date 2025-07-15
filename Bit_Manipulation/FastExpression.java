package Bit_Manipulation;

public class FastExpression {
    public static void main(String[] args) {
        System.out.println(FastExpression_fun(5,3));
    }

    private static int FastExpression_fun(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }

}
