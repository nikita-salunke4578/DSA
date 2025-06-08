//Binary search : here element should be in ascending order
//Time Complexity: O(log n)
package Array;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[5];

        System.out.println("Enter 5 array elements in ascending order:");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("Enter key element to search:");
        int key = sc.nextInt();

        int idx = Binary_Search(num, key);
        System.out.println("Key is present at index:" + idx);
    }

    private static int Binary_Search(int[] num, int key) {
        int start = 0, end = num.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (num[mid] == key) {
                return mid;
            }
            if (num[mid] < key) {    // key is on right side
                start = mid;
            }
            if (num[mid] > key) {
                end = mid;
            }
        }
        return -1;
    }
}
