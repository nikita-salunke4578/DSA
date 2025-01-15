package Pattern;

public class pattern_93 {
    public static void main(String[] args) {
        int iLength = 5, jLength = 9;
        print_pattern(iLength, jLength);
    }

    private static void print_pattern(int iLength, int jLength) {
        for (int i = 0; i < iLength; i++) {
            for (int j = 0; j < jLength; j++) {
                if (j - i == 0 || j + i == 8) {
                    System.out.print("N");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
