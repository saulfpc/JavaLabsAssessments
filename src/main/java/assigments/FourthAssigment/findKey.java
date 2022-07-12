package assigments.FourthAssigment;

import java.util.HashMap;

public class findKey {

    public static void main(String[] args) {
        HashMap<String, Integer> person = new HashMap<>();

        person.put("Juan",20);
        person.put("John",30);
        person.put("Ahmed",40);
        person.put("Roy",50);
        person.put("Cloud",60);

        System.out.println("Does the HashMap contains the key name Roy: " + person.containsKey("Roy"));
    }

}
