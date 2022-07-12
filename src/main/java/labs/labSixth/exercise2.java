package labs.labSixth;

public class exercise2 {
    public static void main(String[] args) {

        /**
         * [] first is the row and the second [] is the column
         */
        int [][] arr = new int[3][3];
        arr [0][0]=15; arr [0][1]=17; arr [0][2]=19;
        arr [1][0]=1; arr [1][1]=3; arr [1][2]=4;
        arr [2][0]=15; arr [2][1]=15; arr [2][2]=15;


        System.out.println(arr.length +" print the row");
        System.out.println(arr[0].length + " print the columns");


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
