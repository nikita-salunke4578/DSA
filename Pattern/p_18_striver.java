package Pattern;

public class p_18_striver {
    public static void main(String[] args) {
        int rows = 5, column = 5;
        print_pattern(rows, column);
    }

    private static void print_pattern(int rows, int column) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                if (j - i <= 0) {
                    System.out.print((char) (69 + (j - i)));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
