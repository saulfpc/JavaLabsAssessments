package labs.labNineth;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class exercise3 {

    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the Day");
        String day = scanner.next();
        System.out.println("Type the month");
        String month = scanner.next();
        System.out.println("Type the year");
        String year = scanner.next();

        String date = day+"/"+month+"/"+year;

        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        System.out.println(date1);

    }

}
