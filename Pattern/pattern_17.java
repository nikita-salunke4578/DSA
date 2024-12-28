package Pattern;

public class pattern_17 {
    public static void main(String[] args) {
        int iLength = 9, jLength = 5;
        print_pattern(iLength, jLength);     //function call
    }

    //function defination
    private static void print_pattern(int iLength, int jLength) {
        for (int i = 0; i < iLength; i++)           //outer loop for tracking rows
        {
            for (int j = 0; j < jLength; j++) {
                if (j + i >= 4 && j - i >= -4)       //condition for printing stars
                {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
