package assigments.FourthAssigment;

import java.util.ArrayList;
import java.util.Collections;

public class SortArray {

    public static void main(String[] args) {
        ArrayList<String> lst = new ArrayList<>();
        lst.add("Car");
        lst.add("Arm");
        lst.add("Dog");
        lst.add("Cat");
        lst.add("Food");
        System.out.println(lst);
        Collections.sort(lst);
        System.out.println(lst);
    }

}
