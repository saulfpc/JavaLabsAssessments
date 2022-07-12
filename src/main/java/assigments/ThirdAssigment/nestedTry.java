package assigments.ThirdAssigment;

public class nestedTry {
    public static void main(String args[]){
        try{
            try{
                System.out.println("going to divide by 0");
                int a =39/0;
            }catch(ArithmeticException e) {
                System.out.println(e);
            }

            try{
                int arr[]=new int[3];
                System.out.println("going to add out of the bound of array");
                arr[3]=4;
            }catch(ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }

        }catch(Exception e){
            System.out.println("Exception of the first try and catch");
        }
        System.out.println("out of the try and catch...");
    }
}
