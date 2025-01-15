package Pattern;

public class pattern_86 {
    public static void main(String[] args) {
        int iLength = 5, jLength = 5;
        print_pattern(iLength, jLength);
    }

    private static void print_pattern(int iLength, int jLength) {
        for (int i = 0; i < iLength; i++) {
            for (int j = 0; j < jLength; j++) {
                if (j - i == 0) {
                    System.out.print("0");
                } else {
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }
}
