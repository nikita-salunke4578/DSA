package Pattern;

public class pattern_24 {
        public static void main(String[] args) {
            int iLength = 9, jLength = 9;
            print_pattern(iLength, jLength);     //function call
        }

        //function definition
        private static void print_pattern(int iLength, int jLength) {
            for (int i = 0; i < iLength; i++) {
                for (int j = 0; j < jLength; j++) {
                    if ((j+i >= 4 && j-i >= -4)&&(j+i <= 8 || j-i <= 0))        //condition for printing stars
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



