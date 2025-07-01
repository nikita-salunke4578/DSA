//Write a Java program that:
//Takes an array of exam scores (unsorted)
//Sorts them in ascending order using Selection Sort
//Prints the top 3 scores after sorting
//Optional bonus:
//Handle cases with less than 3 scores
package Array;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] scores={90,67};

        int[] result=Sort(scores);
        int count=Math.min(3, scores.length);//if array elements are < than 3 then we have to print all elements.
        System.out.println("Top three Scores: ");
        for (int i = result.length-1;i>= result.length-count ; i--) {
            System.out.print(result[i]+" ");
        }
    }

    private static int[] Sort(int[] scores) {
        for (int i = 0; i < scores.length-1; i++) {
            int minPos=i;
            for (int j = i+1; j < scores.length; j++) {
                if(scores[minPos]>scores[j]){
                    minPos=j;
                }
            }
            int temp=scores[i];
            scores[i]=scores[minPos];
            scores[minPos]=temp;
        }
        return scores;
    }
}
