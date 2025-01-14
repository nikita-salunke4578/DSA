package Pattern;

public class Pattern_25 {
    public static void main(String[] args) {
        int iLength = 5, jLength = 5;

        myClass(iLength, jLength);
    }

    private static void myClass(int iLength, int jLength) {

        for (int i = 0; i < iLength; i++) {
            for (int j = 0; j < jLength; j++) {
                if (j - i <= 0) {
                    System.out.print((char) (j + 65));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

/*
 * A
 * BB
 * CCC
 * DDDD
 * EEEEE
 * */