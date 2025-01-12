package Pattern;

public class pattern_90 {
    public static void main(String[] args) {
        int iLength = 5, jLength = 5;
        print_pattern(iLength, jLength); //function call
    }

    //function definition
    private static void print_pattern(int iLength, int jLength) {
        for (int i = 0; i < iLength; i++)       //outer loop for rows
        {
            for (int j = 0; j < jLength; j++)   //inner loop for columns
            {
                if (i == 0 || i == 4 || j == 0 || j == 4)   //condition for printing patterns
                {
                    System.out.print("P");
                } else {
                    System.out.print("Q");
                }
            }
            System.out.println();
        }
    }
}
