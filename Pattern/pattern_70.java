package Pattern;

public class pattern_70 {
    public static void main(String[] args) {
        int iLength = 9, jLength = 9;
        print_pattern(iLength, jLength);         //function call
    }

    //function definition
    private static void print_pattern(int iLength, int jLength) {
        for (int i = 0; i < iLength; i = i + 2) {
            for (int j = 0; j < jLength; j++) {
                if (j - i <= 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
