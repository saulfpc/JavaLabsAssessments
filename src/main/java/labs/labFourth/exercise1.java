package labs.labFourth;

public class exercise1 {


    public static void main(String[] args) {

        int a = 10;
        int b = 200;
        int c = 91;
        int largest = 0;

        if (a>=b && a>= c) largest = a;
        if (b>=a && b>=c) largest = b;
        else if (c>=a && c>=b) largest=c;


        System.out.println("the largest number between " + a + " " + b + " " + c + " is " + largest);
    }
}
