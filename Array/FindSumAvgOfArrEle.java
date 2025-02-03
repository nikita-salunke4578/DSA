package Array;

public class FindSumAvgOfArrEle {
    public static void main(String[] args) {
        int[] num={100,99,56,83,50};
        FindSumAvg(num);
    }

    private static void FindSumAvg(int[] num) {
        int sum=0,length=num.length;
        float avg;
        for (int i = 0; i < length; i++) {
            sum +=num[i];
        }
        avg=(float)sum/length;
        System.out.println("Sum="+sum+" and Average="+avg);
    }
}
