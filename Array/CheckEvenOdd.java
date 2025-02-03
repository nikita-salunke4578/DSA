//Write a program to put even and odd elements of array in two separate arrays. (Variations)
package Array;

import java.util.Arrays;

public class CheckEvenOdd {
    public static void main(String[] args) {
        int[] num = {11, 32, -48, 65, 90,12,67};
        checkEvenOdd(num);
    }

    private static void checkEvenOdd(int[] num) {

        int EvenCount = 0, OddCount = 0;

        for (int x : num) {
            if (x > 0) {
                if (x % 2 == 0) {
                    EvenCount++;
                } else {
                    OddCount++;
                }
            }
        }
        int[] Even = new int[EvenCount], Odd = new int[OddCount];
        int idx_Even = 0, idx_Odd = 0;
        for (int x : num) {
            if (x > 0) {
                if (x % 2 == 0) {
                    Even[idx_Even] = x;
                    idx_Even++;
                } else {
                    Odd[idx_Odd] = x;
                    idx_Odd++;
                }
            }
        }
        System.out.println("Even Array: " + Arrays.toString(Even));
        System.out.println("Odd Array: " + Arrays.toString(Odd));

    }
}
