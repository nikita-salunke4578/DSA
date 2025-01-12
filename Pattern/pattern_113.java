package Pattern;

public class pattern_113 {
    public static void main(String[] args) {
        int iLength = 13, jLength = 17;
        print_pattern(iLength, jLength);
    }

    private static void print_pattern(int iLength, int jLength) {
        for (int i = 0; i < iLength; i++) {
            for (int j = 0; j < jLength; j++) {
                if ((j + i <= 2) || (j - i >= 6 && (j + i <= 10)) || (j - i >= 14) || (j - i <= -5) || (j + i >= 21)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
