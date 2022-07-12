package assigments.FirstAssigment;

import java.util.Arrays;

public class sortArray {

    public static void main(String[] args) {

        Integer ar [] = {4,6,8,9,1,0,2,4,3};
        System.out.println(Arrays.toString(ar));
        int temporalSortingValues;
        for (int i = ar.length -1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (ar[j] > ar[j+1]){
                    temporalSortingValues = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temporalSortingValues;
                }
            }
        }
        System.out.println(Arrays.toString(ar));


    }

}
