package assigments.FourthAssigment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class hashValueToList {

    public static void main(String[] args) {
        HashMap<String, Integer> person = new HashMap<>();
        List<String> lst = new ArrayList<>();

        person.put("Juan",20);
        person.put("John",30);
        person.put("Ahmed",40);
        person.put("Roy",50);
        person.put("Cloud",60);

        for (Map.Entry<String, Integer> key: person.entrySet()) {
            lst.add(key.getKey());
        }
        System.out.println(lst);

    }

}
