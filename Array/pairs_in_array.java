//WAP to print pairs in array and total no. of pairs.
//Time complexity=O(n^2);
package Array;

public class pairs_in_array {
    public static void main(String[] args) {
        int[] num = {2, 4, 6, 8, 10};
        print_pairs(num);
    }

    private static void print_pairs(int[] num) {
        int tp = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                System.out.print("(" + num[i] + "," + num[j] + ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs=" + tp);
    }
}
