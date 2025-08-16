package String;

public class LargestOddinString {
    public static void main(String[] args) {
        String num = "35427";
        System.out.println(getLargestOddinString(num));
    }

    private static String getLargestOddinString(String num) {
        int n = num.length() - 1;

        while (n >= 0) {
            int dig = num.charAt(n) - '0';//convert character into int

            if (dig % 2 != 0) {
                return num.substring(0, n + 1);
            }
        }
        return "";
    }
}
