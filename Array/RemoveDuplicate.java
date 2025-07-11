// Write a program to remove the duplicate elements of a given array and return the new length of the array.
//(Variations)
package Array;
public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] num={10,12,10,8,12};
        removeDuplicate(num);
    }

    private static void removeDuplicate(int[] num) {
        for (int i = 0; i < num.length-1; i++) {
            for (int j = i+1; j <num.length ; j++) {
                if(num[i]==num[j]){

                }
            }
        }
    }
}
