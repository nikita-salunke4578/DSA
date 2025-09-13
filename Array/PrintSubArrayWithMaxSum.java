package Array;

public class PrintSubArrayWithMaxSum {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        PrintSubArrayWithMaxSum_fun(arr);
    }

    private static void PrintSubArrayWithMaxSum_fun(int[] arr) {
        int sum = 0, maxsum = Integer.MIN_VALUE;
        int start = 0;
        int ansStart = -1, ansEnd = -1;

        for (int i = 0; i < arr.length; i++) {
            if (sum == 0) {
                start = i;
            }
            sum += arr[i];

            if (sum > maxsum) {
                maxsum = sum;

                ansStart = start;
                ansEnd = i;
            }

            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println("MaxSum=" + maxsum);
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
