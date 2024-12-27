package Pattern;

import java.sql.SQLOutput;

public class pattern_03 {
    public static void main(String[] args) {
        int ilength=5,jlength=5;

        for (int i = 0; i < ilength; i++) {
            for (int j = 0; j < jlength; j++) {
                if(j+i <= 4)            //condition for printing stars
                {
                    System.out.print("* ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
