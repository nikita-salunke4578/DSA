package Pattern;

import java.sql.SQLOutput;

public class pattern_02 {
    public static void main(String[] args) {
        int ilength=5,jlength=5;


        for (int i = 0; i < ilength; i++)   //loop for rows
        {
            for (int j = 0; j < jlength; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
