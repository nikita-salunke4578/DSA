//Here Time complexity is O(n^2) < o(n^3) , so this is optimal solution but we have another optimal solution i.e. Kadane's algorithm.Ka
package Array;

public class MaxSumSubArrayPrefixMethod {
    public static void main(String[] args) {
        int[] num = {1, 8, 3, -2, 5};
        prefixMethod(num);
    }

    private static void prefixMethod(int[] num) {
        int start, end, currSum;
        int MaxSum = Integer.MIN_VALUE;

        int[] prefix = new int[num.length];
        prefix[0] = num[0];
        for (int i = 1; i < num.length; i++) {
            prefix[i] = prefix[i - 1] + num[i];
        }

        for (int i = 0; i < num.length; i++) {
            start = i;
            for (int j = i; j < num.length; j++) {
                currSum = 0;
                end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (currSum > MaxSum) {
                    MaxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum=" + MaxSum);
    }
}
