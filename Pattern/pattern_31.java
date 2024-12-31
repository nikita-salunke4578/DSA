package Pattern;

public class pattern_31 {
    public static void main(String[] args) {
        int iLength=6,jLength=6;
        print_pattern(iLength,jLength);
    }

    private static  void print_pattern(int iLength,int jLength){

        for (int i = 0; i < iLength; i++) {
            char ch='A';

            for (int j = 0; j < jLength; j++) {
                if(j+i >= 5){
                    System.out.print(ch+" ");
                    ch++;
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
