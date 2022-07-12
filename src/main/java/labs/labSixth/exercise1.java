package labs.labSixth;

import java.util.Arrays;
import java.util.OptionalDouble;

public class exercise1 {
    public static void main(String[] args) {

        int numbers[] ={1,2,3,4,5,6};
        System.out.println(Arrays.stream(numbers).average());
        float sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        float average = sum/ numbers.length;
        System.out.println(average);
    }
}
