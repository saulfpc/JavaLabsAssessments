package assigments.FourthAssigment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class reverseArraylist {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("AA");
        list.add("BB");
        list.add("CC");
        list.add("DD");

        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }

}
