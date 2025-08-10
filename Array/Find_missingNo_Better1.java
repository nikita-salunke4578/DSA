//Better Approach :TC: O(n),SC:O(n+1)
package Array;

public class Find_missingNo_Better1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int N = 5;
        System.out.println("Missing No:" + FindMissing(arr, N));
    }

    private static int FindMissing(int[] arr, int n) {
        int[] hash = new int[n + 1];

        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }

        for (int i = 1; i <= n; i++) {
            if (hash[i] == 0) {
                return i;
            }
        }
        return -1;
    }
}
