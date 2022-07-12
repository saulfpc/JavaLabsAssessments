package labs.labFourth;

public class exercise3 {
    public static void main(String[] args) {
        int number= 0;
        System.out.println(number + checkNumber(number));


    }

   private static String checkNumber(int number){
        if(number>0) return " is Positive";
        else if(number<0) return " is negative";
        else return " is not positive or negative just zero";
    }
}
