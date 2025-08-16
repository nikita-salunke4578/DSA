

package String;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String s="the sky is blue";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        String str=s.trim();                        //Remove starting and end whitespaces
        String[] strArray=str.split("\\s+");           //convert string to array on basis of " "

        List<String> list= Arrays.asList(strArray);

        Collections.reverse(list);            //reverse the arrayList
        return String.join(" ",list);        //Convert arrayList into String and return
    }
}
