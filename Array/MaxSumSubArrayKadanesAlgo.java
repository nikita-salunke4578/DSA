//kadane's algo says if currsum is negative then instead of -ve take 0 as current Sum. Here Time complexity is O(n);
package Array;

public class MaxSumSubArrayKadanesAlgo {
    public static void main(String[] args) {
        int[] num = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadanes(num);
    }

    private static void kadanes(int[] num) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            cs += num[i];

            if (cs < 0) {
                cs = 0;
            }

            ms = Math.max(cs, ms);
        }
        System.out.println("Max Sum=" + ms);
    }
}
