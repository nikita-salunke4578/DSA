package Pattern;

public class pattern_71 {
    public static void main(String[] args) {
        int iLength = 9, jLength = 9;
        print_pattern(iLength, jLength);
    }

    private static void print_pattern(int iLength, int jLength) {

        for (int i = 0; i < iLength; i=i+2) {
            int num = 1;
            for (int j = 0; j < jLength; j++) {
                if (j - i <= 0) {
                    System.out.print(num);
                    if (j - i / 2 < 0) {
                        num++;
                    } else {
                        num--;
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
