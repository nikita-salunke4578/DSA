//This approach is only useful when we have elements without duplicate value.
package Array;

public class FindSecondLargestEle {
    public static void main(String[] args) {
        int[] arr = {90, 20, 120, 40, 50};
        int SecLarEle = FindSecondLargestElement(arr);
        System.out.println("Second Largest Element is " + SecLarEle);
    }

    private static int FindSecondLargestElement(int[] arr) {
        int temp;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr[1];
    }
}
