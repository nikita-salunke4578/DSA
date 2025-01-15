package Pattern;

public class pattern_77 {
    public static void main(String[] args) {
        int iLength = 5, jLength = 5;
        print_pattern(iLength, jLength);
    }

    private static void print_pattern(int iLength, int jLength) {
        int num = 1;
        for (int i = 0; i < iLength; i++) {
            for (int j = 0; j < jLength; j++) {
                if (j - i <= 0) {
                    System.out.print(num+" ");
                    num++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
