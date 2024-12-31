package Pattern;

public class pattern_30 {

    public static void main(String[] args) {
        int iLength = 11, jLength = 6;

        print_pattern(iLength, jLength);
    }


    private static void print_pattern(int iLength, int jLength) {


        for (int i = 0; i < iLength; i++) {
            for (int j = 0; j < jLength; j++) {
                if (j + i <= 5 ) {
                    System.out.print((char)(70 - (i+j)));
                }else if(j-i <= -5 ){
                    System.out.print((char)(60 +(i-j)));
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}


