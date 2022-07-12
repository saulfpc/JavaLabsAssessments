package assigments.FirstAssigment;

public class fibonacci {

    public static void main(String[] args) {
        int n =10;
        int first = 0;
        int second = 1;
        int sum ;
        System.out.println("fibonacci iteration " + n);
        System.out.println();
        System.out.print(first + " " + second);

        for (int i = 0; i <=n ; i++) {
            sum = first + second;
            System.out.print(" " + sum);
            first = second;
            second = sum;
        }

    }

}
