package Pattern;

public class pattern_72 {
    public static void main(String[] args) {
        int iLength = 5, jLength = 9;
        print_pattern(iLength, jLength);
    }

    private static void print_pattern(int iLength, int jLength) {
        for (int i = 0; i < iLength; i++) {
            int num = 1;
            for (int j = 0; j < jLength; j++) {
                if (j + i >= 4 && j - i <= 4) {
                    System.out.print(num);
                    if (j < 4) {
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
