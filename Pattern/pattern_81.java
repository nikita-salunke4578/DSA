package Pattern;

public class pattern_81 {
    public static void main(String[] args) {
        int iLength = 5, jLength = 10;
        print_pattern(iLength, jLength);
    }

    private static void print_pattern(int iLength, int jLength) {
        for (int i = 0; i < iLength; i++) {
            for (int j = 0; j < jLength; j++) {
                if (j - i <= 0) {
                    System.out.print(j + 1);
                } else if (j + i >= 9) {
                    System.out.print((char) (58 - j));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
