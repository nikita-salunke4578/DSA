//Write a Program to find substring of given string.
//Step 1: loop For(i=startidx to endidx){
// substr+=str.charAt(i);
// }
//return substr;
package String;

public class substring {
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(substring(str, 0, 5));
    }

    private static String substring(String str, int startidx, int endidx) {
        String substr = "";
        for (int i = startidx; i < endidx; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }
}
