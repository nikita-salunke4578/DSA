//Here Time Complexity is O(n^3), we have optimal solution for this : prefix method
package Array;
public class FindMaxSubArraySum {
    public static void main(String[] args) {
        int[] num = {2, 4, 6, 8, 10};
        MaxSubArraySum(num);
    }

    private static void MaxSubArraySum(int[] num) {
        int maxsum=Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                int currsum=0;

                for (int k = i; k <=j ; k++) {
                    currsum=currsum+num[k];
                }
                System.out.println("Current Sum="+currsum);
                if(currsum>maxsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.println("Max Sum:"+maxsum);
    }
}
