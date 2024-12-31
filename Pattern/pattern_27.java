package Pattern;



public class pattern_27 {
    public static void main(String[] args) {
        int iLength=9,jLength=5;
        print_pattern(iLength,jLength);
    }

    //function definition
    private static void print_pattern(int iLength,int jLength){

        for (int i = 0; i < iLength; i++) {

            for (int j = 0; j < jLength; j++) {
                char ch='A';
               if(j-i <= 0 && j+i <=8 && i<=4){
                   System.out.print((char)(ch+i));
               }
                else if(j-i <= 0 && j+i <=8 && i > 4){

                    System.out.print((char)(73-i));
                }else{
                   System.out.print(" ");
               }
            }
            System.out.println();
        }
    }
}
