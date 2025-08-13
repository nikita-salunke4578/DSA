package Pattern;

public class strive_p_11 {

    public static void main(String[] args) {
        int rows = 5, column = 5;
        printPattern(rows, column);
    }

    private static void printPattern(int rows, int column) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                if (j - i <= 0) {
                    if ((j + i) % 2 == 0) {
                        System.out.print("1");
                    } else {
                        System.out.print("0");
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


