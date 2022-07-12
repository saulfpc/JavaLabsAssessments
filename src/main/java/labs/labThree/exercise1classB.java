package labs.labThree;

public class exercise1classB implements exercise1BankInterface{
    @Override
    public void getInterest() {
        System.out.println("the interest is static and is 13% ");
    }

    public static void main(String[] args) {
        exercise1classB classB = new exercise1classB();
        classB.getInterest();
        System.out.println("the interest rate is " + interest);
    }
}
