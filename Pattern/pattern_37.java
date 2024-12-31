package Pattern;

public class pattern_37 {
    public static void main(String[] args) {
        int iLength=6,jLength=6;
        print_pattern(iLength,jLength);
    }

    private static void print_pattern(int iLength, int jLength) {
        int num=0;
        for (int i = 0; i < iLength; i++) {
            char ch='A';
            int num2,diff=5;
            num2=num;
            for (int j = 0; j < jLength; j++) {
                if(j-i <= 0) {
                    System.out.print((char) (ch + num2));
                    num2 = num2 + diff;
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            num++;
        }
    }
}
