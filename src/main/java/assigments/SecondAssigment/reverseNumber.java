package assigments.SecondAssigment;

import java.util.stream.IntStream;

public class reverseNumber {
    public static void main(String[] args) {
        int a = 123;
        Integer reverse = Integer.parseInt(String.valueOf(new StringBuilder(a+"").reverse()));
        System.out.println(reverse);

    }
}
