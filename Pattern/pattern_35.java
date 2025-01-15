package Pattern;

public class pattern_35 {


    public static void main(String[] args) {
        int iLength = 6, jLength = 6;
        print_pattern(iLength, jLength);
    }


    private static void print_pattern(int iLength, int jLength) {
        char ch = 'A';
        for (int i = 0; i < iLength; i++) {

            for (int j = 0; j < jLength; j++) {
                if (j - i <= 0) {
                    System.out.print(ch++);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}




