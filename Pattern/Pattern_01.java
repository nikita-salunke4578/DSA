package Pattern;

public class Pattern_01 {
    public static void main(String[] args) {
        int iLength=5,jLength=5;

        myClass(iLength,jLength);
    }

    private static void myClass(int iLength, int jLength) {
        for (int i = 0; i < iLength; i++) {
            for (int j = 0; j <jLength ; j++) {
                if(j+i>=4){
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
