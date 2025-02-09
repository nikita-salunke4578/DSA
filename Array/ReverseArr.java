//Write a program to find and display reverse of an array using third variable.
package Array;
import java.lang.reflect.Array;
import java.util.Arrays;
public class ReverseArr {
    public static void main(String[] args) {
        int[] arr = {14, 92, 320, 410, 36};
        int[] reverse_arr = reverse(arr);
        System.out.println(Arrays.toString(reverse_arr));
    }

    private static int[] reverse(int[] arr) {
        int temp, FrontSideIndex = 0, length = arr.length, EndSideIndex = length - 1;
        for (int i = 0; i < (length / 2); i++) {
            temp = arr[FrontSideIndex];
            arr[FrontSideIndex] = arr[EndSideIndex];
            arr[EndSideIndex] = temp;
            FrontSideIndex++;
            EndSideIndex--;
        }
        return arr;
    }
}
