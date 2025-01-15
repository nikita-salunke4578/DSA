package Pattern;

public class pattern_138 {
    public static void main(String[] args) {
        int iLength = 7, jLength = 7;
        print_pattern(iLength, jLength);
    }

    private static void print_pattern(int iLength, int jLength) {
        for (int i = 0; i < iLength; i++) {
            for (int j = 0; j < jLength; j++) {
                if ((j - i == 0 && i < 3) || (j + i == 6 && i < 3) || (j == 3 && i > 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
