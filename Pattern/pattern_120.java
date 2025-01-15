package Pattern;

public class pattern_120 {
    public static void main(String[] args) {
        int iLength = 7, jLength = 6;
        print_pattern(iLength, jLength);
    }

    private static void print_pattern(int iLength, int jLength) {
        for (int i = 0; i < iLength; i++) {
            for (int j = 0; j < jLength; j++) {
                if ((j == 0) || (i == 0 && j < 6) || (i == 6 && j < 6) || (i == 3 && j > 2) || (j == 5 && i > 3)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
