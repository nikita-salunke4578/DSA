//Step 1: divide string into 2 parts, check 1st character with last, 2nd char with 2nd last and so on,
//Step 2: When char from left side is not equal to right side that means string iss not palindrome
//int n=str.length();
// for(i=0 to n/2)
// {
//      if(str.charAt(i)!=str.charAt(n-1-i){
//          return false;
//      }
// }
//otherwise return true;
//TC: O(log n)
package String;

public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "madam";
        System.out.println(isPalindrome(str));
    }

    private static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
