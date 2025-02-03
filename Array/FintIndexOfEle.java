package Array;

//Write a program to find the index of an array element.
public class FintIndexOfEle {
    public static void main(String[] args) {
        int[] arr = {10, 22, 80, 56, 90};
        int Ele = 22;
        int idx = findIndex(arr, Ele);
        if (idx == -1) {
            System.out.println("Element is not present in array");
        } else {
            System.out.println("Element Found at index:" + idx);
        }
    }

    private static int findIndex(int[] arr, int ele) {
        for (int i = 0; i < arr.length; i++) {
            if (ele == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
