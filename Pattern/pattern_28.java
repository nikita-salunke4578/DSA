package Pattern;

public class pattern_28 {

    public static void main(String[] args) {
        int iLength = 9, jLength = 5;
        print_pattern(iLength, jLength);
    }

    //function definition
    private static void print_pattern(int iLength, int jLength) {
        for (int i = 0; i < iLength; i++) {
            char ch = 'A';
            for (int j = 0; j < jLength; j++) {
                if (j - i <= 0 && j + i <= 8) {
                    System.out.print((char)(ch+j));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


