package Pattern;

public class pattern_112 {
    public static void main(String[] args) {
        int iLength = 5, jLength = 7;
        print_pattern(iLength, jLength);
    }

    private static void print_pattern(int iLength, int jLength) {
        for (int i = 0; i < iLength; i++) {
            for (int j = 0; j < jLength; j++) {
                if ((j - i == -1) || (j + i == 7) || (i == 1 && j == 3) || ((i == 0) && (j == 1 || j == 2 || j == 4 || j == 5))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
