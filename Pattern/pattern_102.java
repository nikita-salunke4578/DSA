package Pattern;

public class pattern_102 {
    public static void main(String[] args) {
        int iLength = 5, jLength = 9;
        print_pattern(iLength, jLength);
    }

    private static void print_pattern(int iLength, int jLength) {
        for (int i = 0; i < iLength; i++) {
            for (int j = 0; j < jLength; j++) {
                if ((i == 0 && j <= 4) || (i == 4 && j >= 4) || j - i == 0 || j - i == 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
