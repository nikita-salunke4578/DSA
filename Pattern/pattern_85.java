package Pattern;

public class pattern_85 {
    public static void main(String[] args) {
        int iLength = 5, jLength = 5;
        print_pattern(iLength, jLength);
    }

    private static void print_pattern(int iLength, int jLength) {
        for (int i = 0; i < iLength; i++) {
            for (int j = 0; j < jLength; j++) {
                if (i == 2 || j == 2) {
                    System.out.print("*");
                } else {
                    System.out.print("O");
                }
            }
            System.out.println();
        }
    }
}
