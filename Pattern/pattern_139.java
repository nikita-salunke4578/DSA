package Pattern;

public class pattern_139 {
    public static void main(String[] args) {
        int iLength = 7, jLength = 7;
        print_pattern(iLength, jLength);
    }

    private static void print_pattern(int iLength, int jLength) {
        for (int i = 0; i < iLength; i++) {
            for (int j = 0; j < jLength; j++) {
                if (i == 0 || i == 6 || j + i == 6) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
