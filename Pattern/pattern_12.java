package Pattern;

public class pattern_12 {
    public static void main(String[] args) {
        int iLength = 9, jLength = 9;
        print_pattern(iLength, jLength);        //function call
    }

    private static void print_pattern(int iLength, int jLength) {
        for (int i = 0; i < iLength; i++)               //outer loop for rows
        {
            for (int j = 0; j < jLength; j++) {
                if ()       //condition for printing stars
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
