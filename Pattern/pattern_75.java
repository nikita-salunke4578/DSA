package Pattern;

public class pattern_75 {
    public static void main(String[] args) {
        int iLength = 11, jLength = 11;
        print_pattern(iLength, jLength);
    }

    private static void print_pattern(int iLength, int jLength) {
        for (int i = 2; i < iLength; i = i + 2) {
            for (int j = 0; j < jLength; j++) {
                if (j - i <= 0) {
                    if (i == 2 * j) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }

    }
}
