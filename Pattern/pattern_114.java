package Pattern;

public class pattern_114 {
    public static void main(String[] args) {
        int iLength = 7, jLength = 5;
        print_pattern(iLength, jLength);
    }

    private static void print_pattern(int iLength, int jLength) {
        for (int i = 0; i < iLength; i++) {
            for (int j = 0; j < jLength; j++) {
                if ((i > 0 && j == 0) || (i > 0 && j == 4) || (j > 0 && j < 4 && i == 0) || i == 3) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
