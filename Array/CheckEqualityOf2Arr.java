//Write a program to test the equality of two arrays
package Array;

public class CheckEqualityOf2Arr {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4}, arr2 = {1, 2, 3, 4};
        boolean result = CheckEquality(arr1, arr2);
        if (result) {
            System.out.println("Both arrays are Equal");
        } else {
            System.out.println("Both Arrays are not Equal");
        }
    }

    private static boolean CheckEquality(int[] arr1, int[] arr2) {
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
