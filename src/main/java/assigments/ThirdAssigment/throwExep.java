package assigments.ThirdAssigment;

public class throwExep {

    public static void main(String[] args) {
        throwExep obk = new throwExep();
        obk.methodInception();
    }

    void methodWithEx() throws ArithmeticException{
        throw new ArithmeticException("Calculation error");
    }
    void methodTwo() throws ArithmeticException{
        methodWithEx();
        System.out.println("For the error I was not executed");
    }
    void methodInception(){
        try{
            methodTwo();
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException message");
        }
    }
}
