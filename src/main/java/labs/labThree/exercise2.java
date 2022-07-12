package labs.labThree;

public class exercise2 {

    private void calculatePerimeter(int a){
        System.out.println("the perimeter of a square is 4 times one of is side " + (4*a) );
    }
    private void calculatePerimeter(int a, int b){
        System.out.println("the perimeter of a parallelogram is " + (2*(a+b)));
    }
    private void calculatePerimeter(int a, int b, int c){
        System.out.println("the perimeter of a righ rectangle is the sum of their sides " + (a+b+c));
    }

    public static void main(String[] args) {
        exercise2 ex2 = new exercise2();
        ex2.calculatePerimeter(2);
        ex2.calculatePerimeter(2,4);
        ex2.calculatePerimeter(2,4,6);
    }

}
