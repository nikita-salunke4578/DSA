package Pattern;

public class p_12_striver {
    public static void main(String[] args) {
        int rows = 4, column = 8;
        printPattern(rows, column);
    }

    private static void printPattern(int rows, int column) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                if (j - i <= 0 || j + i >= 7) {
                    if (j <= 3) {
                        System.out.print((char) (49 + j));
                    } else {
                        System.out.print((char) (56 - j));
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
