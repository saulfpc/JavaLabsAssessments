package labs.labNineth;

public class exercise2 {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

        try {
            System.out.println(arr[7]);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}
