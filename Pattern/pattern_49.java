package Pattern;

public class pattern_49 {
    public static void main(String[] args) {
        int iLength=9,jLength=9;
        print_pattern(iLength,jLength);
    }

    private static void print_pattern(int iLength, int jLength) {
        for (int i = 0; i < iLength; i++) {
            for (int j = 0; j < jLength; j++) {
                if(j+i >= 8){
                    System.out.print((char)(41+(i+j)));
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}