package labs.labNineth;

public class exercise1 {

    public static void main(String[] args) {
        try {
            int n1=10;
            int n2=0;
            System.out.println((n1/n2));
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
    }
}
