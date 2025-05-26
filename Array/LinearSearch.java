//Time Complexity = O(n)
package Array;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Enter Key element to search:");
        int key = sc.nextInt();

        int index = findIndex(numbers, key);
        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Key is found at index: " + index);
        }
    }

    private static int findIndex(int[] numbers, int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }
}