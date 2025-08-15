//String Compression..,
//Given  : "aaabbcccdd"  O/P : a3b2c3d2
//Step 1: create stringBuilder object, for(i=0 to str.length()){
// count=1    //for every character count should be 1
// while(i<str.length()-1&& str.charAt(i)==str.charAt(i+1)){
// count++;
//i++;
// }
//sb.append(str.charAt(i))
//if(count>1){sb.append(count);}
// } return sb.toString() ;

package String;

import com.sun.javaws.IconUtil;

public class stringCompression {
    public static void main(String[] args) {
        String str = "aaabbcccdd";
        System.out.println(compress(str));
    }

    private static String compress(String str) {
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            int count = 1;

            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));

            if (count > 1) {
                sb.append(count);
            }
        }
        return sb.toString();
    }
}
