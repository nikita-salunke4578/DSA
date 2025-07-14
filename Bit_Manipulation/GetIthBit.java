//to get ith Bit, we do & operation with n and 1<<i
package Bit_Manipulation;

public class GetIthBit {
    public static void main(String[] args) {
        System.out.println(FindIthBit(10,3));
        System.out.println(FindIthBit(15,3));
    }

    private static int FindIthBit(int n, int i) {
        int BitMask=1<<i;
        if((n & BitMask)==0){
            return 0;
        }else{
            return 1;
        }
    }
}
