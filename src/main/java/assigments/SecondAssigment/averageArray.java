package assigments.SecondAssigment;

import java.util.OptionalDouble;

public class averageArray {

    public static void main(String[] args) {
        int[] values = {1,2,3,4,5};
        long sum = 0;
        long count = 0;
        for (int value : values) {
            sum += value;
            count++;
        }
        System.out.println(count > 0 ? OptionalDouble.of((double) sum / count) : OptionalDouble.empty());

    }

}
