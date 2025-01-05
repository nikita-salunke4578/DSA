package Pattern;

public class pattern_59 {
    public static void main(String[] args) {
        int iLength = 9, jLength = 5;
        print_pattern(iLength, jLength);
    }

    private static void print_pattern(int iLength, int jLength) {
        for (int i = 0; i < iLength; i++) {
            for (int j = 0; j < jLength; j++) {
                if (j - i >= 0) {
                    System.out.print((j - i) + 1);
                } else if (j + i >= 8) {
                    System.out.print((j + i) - 7);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
