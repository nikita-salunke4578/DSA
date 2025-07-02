//Time complexity: O(n)
package Array;

import java.util.Scanner;

public class FindLargestSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        System.out.println("Enter 5 Array Elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int large = findSmallLarge(arr);
        System.out.println("Largest Element:" + large);

    }

    private static int findSmallLarge(int[] arr) {
        int Largest = Integer.MIN_VALUE;
        int Smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (Largest < arr[i]) {
                Largest = arr[i];
            }
            if (Smallest > arr[i]) {
                Smallest = arr[i];
            }
        }
        System.out.println("Smallest Element:" + Smallest);
        return Largest;
    }
}
