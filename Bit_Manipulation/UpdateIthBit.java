//Updating Ith Bit Means we have given bit, position, and operation to perform (0=Clear, 1=Set)
package Bit_Manipulation;

import java.sql.SQLOutput;

public class UpdateIthBit {
    public static void main(String[] args) {
        System.out.println(UpdateIthBit_fun(10, 4, 1));
    }

    private static int ClearIthBit(int n, int i) {
        int BitMask = ~(1 << i);
        return n & BitMask;
    }

    private static int UpdateIthBit_fun(int num, int i, int newBit) {
        int n = ClearIthBit(num, i);
        int BitMask = newBit << i;
        return n | BitMask;
//        another approach
//        if(newBit==0){
//            clearBit(n,i);
//        }else{
//            setBit(n,i);
//        }
    }
}
