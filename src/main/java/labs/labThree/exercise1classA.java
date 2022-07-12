package labs.labThree;

public class exercise1classA implements exercise1BankInterface{
    @Override
    public void getInterest() {
        System.out.println("the interest is static and is 13% ");
    }

    public static void main(String[] args) {
        exercise1classA classA = new exercise1classA();
        classA.getInterest();
        System.out.println("The value of interest is " + interest);
    }
}
