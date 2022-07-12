package assigments.SecondAssigment;

import java.util.ArrayList;

public class oddNumbersBetween {

    public static void main(String[] args) {
        ArrayList<Integer> Odd = new ArrayList<Integer>();
        for (int i = 79; i <=179 ; i++) {
            if (i % 2 == 1) {
                // Insert odd number
                Odd.add(i);
            }

        }
        System.out.println(Odd);

    }

}
