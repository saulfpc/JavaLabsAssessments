package assigments.ThirdAssigment;

public class NumberFormatExceptionEx{

    public static void main(String[] args) {
        try {
            int n = Integer.parseInt("9b");
            System.out.println(n);
        }catch(NumberFormatException nfe){
            System.err.println("The value pass contains other no numeric values");
        }
    }

}
