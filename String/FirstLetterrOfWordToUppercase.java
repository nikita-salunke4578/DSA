//Given string, convert first letter of every word into Uppercase
// String str="hi, i am nikita"....O/P: Hi, I am Nikita
//Step 1: Create String1builder class object (sb) and convert first letter of your string into Uppercase and then append that to sb
// char ch = Character.toUpperCase(str.charAt(0));
//Step 2: for(i=1 to str.length()), in this loop check if any character is " "(bcoz words get separate by space), if there is space then append that space to sb, and i++, now, this is next letters first character, convert into uppercase and append into sb.
//for (int i = 1; i < str.length(); i++) {
//            if (str.charAt(i) == ' ' && i < str.length() - 1) {
//                sb.append(str.charAt(i));
//                i++;
//                sb.append(Character.toUpperCase(str.charAt(i)));
//            } else {
//                sb.append(str.charAt(i));
//            }
//        }
//finally convert stringbuilder to string and return it.
package String;

public class FirstLetterrOfWordToUppercase {
    public static void main(String[] args) {
        String str = "hi, i am nikita, a software developer";
        System.out.println(firstLetterToUppercase(str));
    }

    private static String firstLetterToUppercase(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
