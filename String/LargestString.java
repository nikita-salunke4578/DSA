//Given set of String, find Largest String in it.(compare on the basis of lexicographic)
//ex: fruits[]="apple" "banana" "mango"
//O/P: mango
//Step 1: assume largeststr=fruits[0]
//step 2: for(int i=0 to fruits.length) {
// if(largest.compareTo(fruits[i])<0){
// largest=fruits[i];
// }
// }
//return largest;
//compareTo() string funstion returns 0 if (s1==s2), returns -ve value if (s1<s2), returns +ve value if (s1>s2)


package String;

public class LargestString {
    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "mango"};
        System.out.println(getLargestString(fruits));
    }

    private static String getLargestString(String[] fruits) {
        String largest = fruits[0];

        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        return largest;
    }
}
