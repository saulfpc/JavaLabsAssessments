package labs.labOne;

import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type the Divisor number: ");
        int divisor = sc.nextInt();
        System.out.print("Type the Dividend number: ");
        int dividend = sc.nextInt();
        System.out.println(divisor +" / "+ dividend +" the quotient is " +(divisor/dividend));
        System.out.println("the Remainder is: " + (divisor%dividend));
    }
}
