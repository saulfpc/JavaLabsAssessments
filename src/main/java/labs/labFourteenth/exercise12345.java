package labs.labFourteenth;

import java.util.*;

public class exercise12345 {

    public static void main(String[] args) {

        //exercise 1
        Map<String, Integer> mp= new HashMap<>();
        mp.put("First", 1);
        mp.put("Second", 2);
        mp.put("Third", 3);
        mp.put("Fourth", 4);
        System.out.println(mp.containsKey("Third") + " " + mp.get("Third"));

        //exercise 2

        Hashtable<Integer, String> ht1 = new Hashtable<>();

        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");

        Set<Integer> setOfKeys = ht1.keySet();
        for (Integer e: setOfKeys
             ) {
            System.out.println("key:" + e + " value:"+ht1.get(e));
        }

        //exercise 3
        ht1.remove(3,"three");
        System.out.println(ht1);

        //exercise 4
        List<String> lst = new ArrayList<String>(ht1.values());
        System.out.println(lst);

        //exercise 5
    for (Map.Entry<String, Integer> entry : mp.entrySet()){
        String getKey = entry.getKey();
        System.out.println(mp.get(getKey));
    }
    }

}
