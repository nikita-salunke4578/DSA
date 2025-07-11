package Array;

public class MarksAnalyzer {
    public static void main(String[] args) {
        int [] scores= {90,80,98,47,95};
        int total=0;
        int avg=0;
        int highest=scores[0];
        int Lowest=scores[0];
        for (int i = 0; i < scores.length; i++) {
            total=scores[i]+total;

            if(highest<scores[i])
            {
                highest=scores[i];
            }
            if(Lowest>scores[i]){
                Lowest=scores[i];
            }
            if(scores[i]>=90){
                System.out.println(scores[i]);
            }
        }

        avg=total/scores.length;
        System.out.println("Average="+avg);

        System.out.println("Highest Scores:"+highest);
        System.out.println("Lowest Scores:"+Lowest);
    }
}
