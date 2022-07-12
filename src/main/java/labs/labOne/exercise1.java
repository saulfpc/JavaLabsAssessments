package labs.labOne;

import java.util.Scanner;

import static java.lang.System.exit;

public class exercise1 {

    public static void printMenu(String[] options){
        for (String option : options){
            System.out.println(option);
        }
        System.out.print("Choose your option : ");
    }


    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Type the Length of the rectangle");
        int lengthOfRectangle = scanner.nextInt();
        System.out.println("Type the width of the rectangle");
        int widthOfRectangle = scanner.nextInt();
        String[] options = {"1- Perimeter of a rectangle",
                "2- Option Area of a rectangle",
                "3- Exit"
        };
        int option = 1;
        while (option!=3){
            printMenu(options);
            try {
                option = scanner.nextInt();
                switch (option) {
                    case 1 -> option1(lengthOfRectangle, widthOfRectangle);
                    case 2 -> option2(lengthOfRectangle, widthOfRectangle);
                    case 3 -> exit(0);
                }
            }
            catch (Exception ex){
                System.out.println("Please enter an integer value between 1 and " + options.length);
                scanner.next();
            }
        }

    }
    private static void option1(int lengthOfRectangle, int widthOfRectangle) {
        System.out.println("The perimeter of the rectangle is " +(2*lengthOfRectangle+2*widthOfRectangle));
    }
    private static void option2(int lengthOfRectangle, int widthOfRectangle) {
        System.out.println("Te Area of the rectangle is "+(lengthOfRectangle*widthOfRectangle));
    }

}
