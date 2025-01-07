package Pattern;

public class pattern_74 {
    public static void main(String[] args) {
        int iLength = 5, jLength = 9;
        print_pattern(iLength, jLength); //function call for printing pattern
    }

    private static void print_pattern(int iLength, int jLength) {
        for (int i = 0; i < iLength; i++)       //outer loop for rows
        {
            char ch = 'A';
            for (int j = 0; j < jLength; j++)       //inner loop for columns
            {
                if (j + i >= 4 && j - i <= 4)        //condition for printing pattern
                {
                    System.out.print(ch);
                    if (j < 4) {
                        ch++;
                    } else {
                        ch--;
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
