package Array;

public class SumOfAllEvenNo {
    public static void main(String[] args) {
        int[] arr ={40,67,94,32,2,1};
        SumAllEvenNo(arr);
    }

    private static void SumAllEvenNo(int[] arr) {
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                sum=sum+arr[i];
            }
        }
        System.out.println("Sum of all even No is "+sum);
    }
}
