package Pattern;

public class pattern_50 {
    public static void main(String[] args) {
        int iLength=7,jLength=30;
        print_pattern(iLength,jLength);
    }

    private static void print_pattern(int iLength, int jLength) {
        for (int i = 0; i < iLength; i++) {
            for (int j = 0; j < jLength; j++) {
                System.out.print((j/3));
            }
            System.out.println();
        }
    }
}
