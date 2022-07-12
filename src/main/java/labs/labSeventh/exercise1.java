package labs.labSeventh;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercise1 {

    public static void main(String[] args) {
        /**
         * Write a program to sort the Strings in the array: (Bubble Sort)
         * String str[] = “Ciaz, Alto, Swift, Dezire, Brezza”
         * Try with user input also, using Scanner.nextLine()
         */

        /*Scanner s = new Scanner(System.in);

        System.out.println("enter number of words to sort");

        int n=s.nextInt();

        String wordsCollection[]=new String[n];

        System.out.println("enter Words");

        for(int i=0;i<n;i++){//for reading array
            System.out.println("Type word:");
            wordsCollection[i]=s.nextLine();

        }*/

        String wordsCollection[]={"Ciaz", "Alto", "Swift", "Dezire", "Brezza"};
        String sortStr;
        List<String> sortArray =new ArrayList<String>();

        for (int i = 0; i < wordsCollection.length ; i++) {
            for (int j = i+1; j < wordsCollection.length ; j++) {
                if (wordsCollection[j].compareToIgnoreCase(wordsCollection[i])<0){
                    sortStr=wordsCollection[i];
                    wordsCollection[i] = wordsCollection[j];
                    wordsCollection[j]=sortStr;
                }
            }
            System.out.println(wordsCollection[i]);
            sortArray.add(wordsCollection[i]);
        }
        System.out.println(sortArray);

    }
}
