package Pattern;

public class pattern_14 {
    public static void main(String[] args) {
        int iLength = 5, jLength = 9;
        print_pattern(iLength, jLength);         //function call
    }

    //    function for printing stars
    private static void print_pattern(int iLength, int jLength) {
        for (int i = 0; i < iLength; i++)       //outer loop for rows
        {
            for (int j = 0; j < jLength; j++) {
                if (j - i >= 0 && j + i <= 8)                //condition for printing stars
                {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
