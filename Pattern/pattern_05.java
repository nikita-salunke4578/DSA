package Pattern;

public class pattern_05 {
    public static void main(String[] args) {
        int ilength=9,jlength=5;

        for (int i = 0; i < ilength; i++) {
            for (int j = 0; j < jlength; j++) {

                if(j-i <= 0 && j+i <= 8)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
