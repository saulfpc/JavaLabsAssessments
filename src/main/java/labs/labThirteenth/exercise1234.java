package labs.labThirteenth;

import java.util.*;

public class exercise1234 {

    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>();
        set1.add("ABC");
        set1.add("ABCD");
        set1.add("DEFG");
        set1.add("CBA");
        set1.add("GFDE");
        set1.add("QRST");
        System.out.println("Hash Set random order-" + set1);


        set1.clear();
        set1=new LinkedHashSet<>();
        set1.add("ABC");
        set1.add("ABCD");
        set1.add("DEFG");
        set1.add("CBA");
        set1.add("GFDE");
        set1.add("QRST");

        System.out.println(set1.size());

        System.out.println(set1.contains("CBA"));

        set1.clear();

        Set<Integer> set=new TreeSet<Integer>();
        set.add(1);
        set.add(3);
        set.add(5);
        set.add(6);
        set.add(9);
        set.add(0);

        System.out.println(((TreeSet<Integer>) set).first());
        System.out.println(((TreeSet<Integer>) set).last());

        List<Integer> list = new ArrayList<>();
        list.addAll(set);
        System.out.println(list);
    }

}
