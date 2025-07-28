//This is better approach than bruteforce
package Array;

public class FindSecondLargeSmallElement_Better {
    public static void main(String[] args) {
        int[] arr = {1};
        secondLargeEle(arr);
    }

    private static void secondLargeEle(int[] arr) {
        int len = arr.length;
        int large = Integer.MIN_VALUE;
        int SecondLarge = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        int SecondSmall = Integer.MAX_VALUE;

        //if there is only 1 element in array or there is no element in array ,it  returns -1;
        if (len == 0 || len == 1) {
            System.out.println("Second Largest: -1 and Second Smallest : -1");
        }

        for (int i = 0; i < len; i++) {
            small = Math.min(small, arr[i]);
            large = Math.max(large, arr[i]);
        }

        for (int i = 0; i < len; i++) {
            //here we are finding smallest element in array except small, so we will get secondSmall Elemnt
            if (arr[i] < SecondSmall && arr[i] != small) {
                SecondSmall = arr[i];
            }
            if (arr[i] > SecondLarge && arr[i] != large) {
                SecondLarge = arr[i];
            }
        }
        System.out.println("Second Smallest :" + SecondSmall);
        System.out.println("Second Largest: " + SecondLarge);
    }
}
