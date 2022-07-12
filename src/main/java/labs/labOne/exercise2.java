package labs.labOne;

public class exercise2 {

    public static void main(String[] args) {
        int a = 5;
        int b = 1;
        int c;
        c=a+b;
        String result = ++a==c ?  "a = 5 plus b = 1 the result is 6 same as ++a":"a+b was not the same as a++";
        System.out.println(result);
        c=a-b;
        result = --a==c ?  "a = 5 minus b = 1 the result is 4 same as --a":"a-b was not the same as a--";
        System.out.println(result);
    }
}
