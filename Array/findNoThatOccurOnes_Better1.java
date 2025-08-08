package Array;

public class findNoThatOccurOnes_Better1 {
    public static void main(String[] args) {
        int[] arr={1,1,4,1,2,1,2};
        System.out.println(findNoThatOccurOnes_Fun(arr));
    }

    private static int findNoThatOccurOnes_Fun(int[] arr) {
        int n= arr.length;

        //step 1 : find max element
        int max=arr[0];
        for (int i = 0; i < n; i++) {
            max=Math.max(max,arr[i]);
        }

        //define array of size [max+1], which stores occurrence of each element
        int[] occurrence=new int[max+1];

        for (int i = 0; i < n; i++) {
            occurrence[arr[i]]++;
        }

        for (int i = 0; i < occurrence.length; i++) {
            if(occurrence[i]==1){
                return i;
            }
        }
        return -1;
    }
}
