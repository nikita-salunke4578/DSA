package Pattern;

public class pattern_43 {

        public static void main(String[] args) {
            int iLength = 5, jLength = 5;

            print_pattern(iLength, jLength);
        }


        private static void print_pattern(int iLength, int jLength) {


            for (int i = 0; i < iLength; i++) {
                char ch = '1';
                for (int j = 0; j < jLength; j++) {
                    if (j + i >= 4) {
                        System.out.print((char)(ch+j)+" ");

                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
                ch--;
            }
        }
    }
