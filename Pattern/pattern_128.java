package Pattern;

public class pattern_128 {
    public static void main(String[] args) {
        int iLength = 7, jLength = 5;
        print_pattern(iLength, jLength);
    }

    private static void print_pattern(int iLength, int jLength) {
        for (int i = 0; i < iLength; i++) {
            for (int j = 0; j < jLength; j++) {
                if ((j == 0 || j == 4) && (i > 0 && i < 6) || ((i == 0 || i == 6) && (j > 0 && j < 4))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
