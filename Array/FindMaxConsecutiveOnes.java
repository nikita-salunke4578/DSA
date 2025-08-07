package Array;

public class FindMaxConsecutiveOnes {
    public static void main(String[] args) {
        int arr[] = {1, 1, 0, 1, 1, 1};
        int result = findMaxConsecutiveOne(arr);
        System.out.println("Total consecutive One's in list : " + result);
    }

    private static int findMaxConsecutiveOne(int[] arr) {
        int count = 0, maxi = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            maxi = Math.max(count, maxi);
        }
        return maxi;
    }
}
