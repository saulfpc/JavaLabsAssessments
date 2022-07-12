package assigments.FourthAssigment;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetValues {
    public static void main(String[] args) {
        TreeSet<String> set1 = new TreeSet<>();
        set1.add("AB");
        set1.add("ZX");
        set1.add("DE");
        set1.add("CB");
        set1.add("DQ");
        set1.add("QH");

        System.out.println(set1.first());
        System.out.println(set1.last());

    }
}
