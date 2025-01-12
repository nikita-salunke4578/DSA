package Pattern;

public class pattern_111 {
    public static void main(String[] args) {
        int iLength = 5, jLength = 5;
        print_pattern(iLength, jLength);
    }

    private static void print_pattern(int iLength, int jLength) {
        int num = 5;
        for (int i = 0; i < iLength; i++) {
            for (int j = 0; j < jLength; j++) {
                if (j - i >= 0) {
                    System.out.print(num);
                } else {
                    System.out.print((char) (53 - j));
                }
            }
            System.out.println();
            num--;
        }
    }
}
