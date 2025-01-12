package Pattern;

public class pattern_116 {
    public static void main(String[] args) {
        int iLength = 6, jLength = 5;
        print_pattern(iLength, jLength);
    }

    private static void print_pattern(int iLength, int jLength) {
        for (int i = 0; i < iLength; i++) {
            for (int j = 0; j < jLength; j++) {
                if ((j == 0) && (i > 0 && i < 5) || ((i == 0) && (j > 0)) || ((i == 5) && (j > 0))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
