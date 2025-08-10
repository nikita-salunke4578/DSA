//Using Summation method : sum of (1 to N)=n(n+1)/2;
package Array;

public class Find_missingNo_Optimal1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4};
        int N = 4;
        System.out.println("Missing No:" + FindMissing(arr, N));
    }

    private static int FindMissing(int[] arr, int n) {
        int Totalsum = n * (n + 1) / 2;
        int ArraySum = 0;

        for (int i = 0; i < arr.length; i++) {
            ArraySum += arr[i];
        }
        return (Totalsum - ArraySum);
    }

}
