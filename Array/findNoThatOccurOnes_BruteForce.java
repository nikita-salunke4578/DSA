//This is brute force approach
//TC:O(n), SC: O(1)
package Array;

public class findNoThatOccurOnes_BruteForce {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 1, 2};
        int result = findNoThatOccurOnes_fun(arr);
        System.out.println("No that occur Once in array :" + result);
    }

    private static int findNoThatOccurOnes_fun(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (num == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return num;
            }
        }
        return -1;
    }
}
