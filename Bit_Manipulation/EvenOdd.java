//We can check whether no is Even or Odd by checking its LSB, if LSB is 0 then No is Even , if LSB is 1 then No is Odd
package Bit_Manipulation;

public class EvenOdd {
    public static void main(String[] args) {
        EvenOdd(14);
        EvenOdd(7);
    }

    private static void EvenOdd(int num) {
        int BitMask = 1;
        if ((num & BitMask) == 0) {
            System.out.println(num + " is Even No");
        } else {
            System.out.println(num + " is Odd No");
        }
    }
}
