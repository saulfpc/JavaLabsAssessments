package assigments.ThirdAssigment;

import java.util.ArrayList;
import java.util.List;

public class stringConversionArray {
    public static void main(String[] args) {
        String str1 = "Hello";
        String word = "";
        List<String> lst = new ArrayList<>();
        for (int i = 0; i <str1.length() ; i++) {
                lst.add(String.valueOf(str1.charAt(i)));
        }
        System.out.println(lst);

        StringBuffer sbf = new StringBuffer();
        for (String str: lst
             ) {
            sbf.append(str);
        }
        System.out.println(sbf);

    }

}
