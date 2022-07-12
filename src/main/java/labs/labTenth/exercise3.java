package labs.labTenth;

public class exercise3 extends exercise3exception{

/*
Rule 1: If the superclass method does not declare an exception,
subclass overridden method cannot declare the checked exception.
Rule 2: If the superclass method does not declare an exception,
subclass overridden method cannot declare the checked exception
but can declare unchecked exception.
 */

    void msg()throws ArithmeticException {
        System.out.println("TestExceptionChild");
    }

    public static void main(String[] args) {
        exercise3exception ex1 = new exercise3exception();
        exercise3exception ex2 = new exercise3();

        try {
            ex1.msg();
            ex2.msg();

        }catch (Exception e){}
    }

}
