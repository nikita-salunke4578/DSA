package Pattern;

public class pattern_20 {
    public static void main(String[] args) {
        int iLength=9,jLength=10;
        print_pattern(iLength,jLength);
    }
    //function definition
    private static void print_pattern(int iLength,int jLength){
        for (int i = 0; i < iLength; i++)       //outer loop for rows
        {
            for (int j = 0; j < jLength; j++) {
                if((j+i <= 4 || j-i <= -4)||(j+i >= 13 || j-i >= 5))     //condition for printing stars
                {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
