package assigments.FirstAssigment;

import java.util.Scanner;

public class areaTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Calculate the area of the triangle");
        System.out.println("Type the value of the base of the triangle");
        int base = sc.nextInt();
        System.out.println("Type height of the triangle");
        int height = sc.nextInt();
        double area = 0.5 * base * height;
        System.out.println("The area of the triangle is " + area);

    }

}
