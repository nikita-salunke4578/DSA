package Array;

public class Find_missingNo_Optimal2 {
    public static void main(String[] args) {
        int[] arr = {0, 1,3, 4, 5};
        int N = 5;
        System.out.println("Missing No:" + FindMissing(arr, N));
    }

    private static int FindMissing(int[] arr, int n) {
        int xor1 = 0;
        int xor2 = 0;
        for (int i = 0; i < n - 1; i++) {
            xor1 = xor1 ^ arr[i];   //Xor of Array Elements
            xor2 = xor2 ^ (i + 1);      //Xor of All (1 to N-1)
        }
        xor2 = xor2 ^ n;        //above only till n-1 xor is calculated, & we need to calculate xor from 1 to N , so this step
        return (xor2 ^ xor1);
    }

}
