//Clearing ith bit means convert that into 0
//Logic : n & ~(1<<i)
package Bit_Manipulation;

public class ClearIthBit {
    public static void main(String[] args) {
        System.out.println(ClearIthBit_fun(10, 5));
        System.out.println(ClearIthBit_fun(7, 1));
    }

        private static int ClearIthBit_fun(int n,int i){
        int BitMask=~(1<<i);
        return n&BitMask;
    }
}
