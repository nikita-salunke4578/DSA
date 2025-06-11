//Find the subarrays of array
//Time complexity: o(n^3)
package Array;

public class FindSubArrays {
    public static void main(String[] args) {
        int [] num={2,4,6,8,10};
        SubArrays(num);
    }

    private static void SubArrays(int[] num) {

        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                int sum=0;
                int small=Integer.MAX_VALUE;
                int large=Integer.MIN_VALUE;

                for (int k = i; k <= j; k++) {
                    System.out.print(num[k]+" ");
                    sum=sum+num[k];

                    if(small>num[k]){
                        small=num[k];
                    }
                    if(large<num[k]){
                        large=num[k];
                    }
                }

                System.out.print(" = Sum of subarray:"+sum);
                System.out.print(" == Small:"+small+" and Large="+large);
                System.out.println();
            }
            System.out.println();
        }
    }
}
