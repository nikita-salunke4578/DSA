package Pattern;

public class pattern_07 {
    public static void main(String[] args) {
        int ilength=9,jlength=5;

        for (int i = 0; i < ilength; i++) {
            for (int j = 0; j < jlength; j++) {

                if(j+i >= 4 && j-i >= -4)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
