package assigments.FourthAssigment;

import java.util.Enumeration;
import java.util.Hashtable;

public class ViewKeysHahTable {
    public static void main(String[] args) {
        Hashtable table =new Hashtable<>();

        table.put(1, "one");
        table.put(2, "two");
        table.put(3,"Three");
        table.put(4,"Fourth");
        Enumeration e = table.keys();

        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }

    }
}
