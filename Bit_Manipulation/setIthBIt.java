//Set IthBit is simple means setting 1 to the position, but if already 1 is present on that position then no need to change.
//Logic: Perform OR operation between n | (1<<i)
package Bit_Manipulation;

public class setIthBIt {
    public static void main(String[] args) {
        System.out.println(SetIthBit(13, 3));
        System.out.println(SetIthBit(10,2));
    }

    private static int SetIthBit(int n, int i) {
        int BitMask = 1 << i;
        return n | BitMask;
    }
}
