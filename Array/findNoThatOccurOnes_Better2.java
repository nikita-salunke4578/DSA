package Array;

import java.util.HashMap;
import java.util.Map;

public class findNoThatOccurOnes_Better2 {
    public static void main(String[] args) {
        int[] arr = {4, 4, 2, 3, 2, 3, 5, 2};
        System.out.println(findNoThatOccurOnes(arr));
    }

    private static int findNoThatOccurOnes(int[] arr) {
        int n = arr.length;

        //HashMap to store key(array element) and value(No. of occurrence of that element)
        HashMap<Integer, Integer> map = new HashMap<>();


        //to find no. of occurrences and store key and value in HashMap.
        //getOrDefault(element, defaultvalue) this method is use to find how many times this elements exists already.
        for (int i = 0; i < n; i++) {
            int value = map.getOrDefault(arr[i], 0);
            map.put(arr[i], value + 1);        //here value+1 bcoz above method return existed count, and now this element again found so while storing increase value by 1.
        }

        //get element that has value (no. of occurrences as 1)
        for (Map.Entry<Integer, Integer> it :
                map.entrySet()) {
            if (it.getValue() == 1) {
                return it.getKey();
            }
        }
        //This line will never execute
        //if the array contains a single element.
        return -1;
    }
}
