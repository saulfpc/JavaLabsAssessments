package assigments.SecondAssigment;

public class sumOfDigits {

    public static void main(String[] args) {
        int n = 1234;
        int sum = String.valueOf(n).chars().map(Character::getNumericValue).sum();
        System.out.println(sum);
    }

}
