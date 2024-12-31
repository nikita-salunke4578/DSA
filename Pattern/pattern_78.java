package Pattern;

public class pattern_78 {
    public static void main(String[] args) {

        int iLength = 5, jLength = 20;
        print_pattern(iLength, jLength);     //function call
    }

    //function definition
    private static void print_pattern(int iLength, int jLength) {
        for (int i = 0; i < iLength; i++) {
            for (int j = 0; j < jLength; j++) {
                if ((j-i <= 0 && j <= 4)||(j+i <= 9&&(j >= 4 && j<= 9))||(j-i >= 10 && (j >= 9 && j<= 14))||((j+i >= 19)&&(j >=15 && j <=19)))      //condition for printing stars
                {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}



