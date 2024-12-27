package Pattern;

public class pattern_06 {
    public static void main(String[] args) {
        int ilength=8,jlength=5;

        for (int i = 0; i < ilength; i++) {             //loop for rows
            for (int j = 0; j < jlength; j++) {

                if(j+i <= 4 || j-i <= -4)           //condition for printing stars
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
