package labs.labTenth;

import java.util.Scanner;

public class exercise1 {



    public static void main(String[] args) throws exercise1exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type custom error message:");
        String msg = scanner.next();
        int age = 14;
        if (age<15)
        {
            throw new exercise1exception(msg);

        }


    }

}
