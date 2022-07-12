package labs.labFifth;

import java.util.Scanner;

public class exercise2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the first value of the range");
        int a = scanner.nextInt();
        System.out.println("Type the second value of the range");
        int b = scanner.nextInt();
        int largest = 0;
        int lowest = 0;
        String  primeNumbers = "";

        if (a>=b) {largest = a; lowest =b;}
        else {largest = b; lowest = a;}

        for (int i = lowest; i <=largest ; i++) {
            int counter =0;
            for (int j = i; j >=1 ; j--) {
                if (i%j==0)counter=counter+1;
            }
            if (counter==2){
                primeNumbers = primeNumbers + i + " ";
            }

        }
        System.out.println(primeNumbers);
    }

}
