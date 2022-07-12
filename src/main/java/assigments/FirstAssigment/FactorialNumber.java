package assigments.FirstAssigment;

public class FactorialNumber {

    public static void main(String[] args) {
        int n = 10;
        int i = 1;
        int factorial = 1;
        while (i<=n){
            factorial = factorial * i;
            System.out.println(factorial);
            i++;
        }
        System.out.println("The factorial of " + n +" is " + factorial);
    }

}
