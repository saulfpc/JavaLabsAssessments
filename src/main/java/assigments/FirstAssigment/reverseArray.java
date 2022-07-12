package assigments.FirstAssigment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the size of the array");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        int i = 0;

        while (i<=n-1){
            System.out.println("Type the number that belongs to the array");
            numbers[i] = sc.nextInt();
            i++;
        }
        System.out.println(Arrays.toString(numbers));
        for (int j = 0; j < numbers.length/2; j++) {
            int temp = numbers[j];
            numbers[j] = numbers[numbers.length - j - 1];
            numbers[numbers.length - j - 1] = temp;
        }

        System.out.println(Arrays.toString(numbers));
    }
}
