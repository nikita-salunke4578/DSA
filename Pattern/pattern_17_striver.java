package Pattern;

public class pattern_17_striver {
    public static void main(String[] args) {
        int rows = 4, column = 7;
        print_pattern(rows, column);
    }

    private static void print_pattern(int rows, int column) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                if (j + i >= 3 && j - i <= 3) {
                    if (j <= 3) {
                        System.out.print((char) (62 + (j + i)));
                    } else {
                        System.out.print((char) (68 - (j - i)));
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
