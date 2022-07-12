package assigments.ThirdAssigment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class occuranceOnString {

    public static void main(String[] args) {
        String str = "DevLabs Alliance Training";
        List<String> characterList = new ArrayList<>();
        for (String s : str.split("")) {
            characterList.add(s.toLowerCase());
        }
        List<String> removeDuplicated = new ArrayList<>();
        Set<String> uniqueValues = new HashSet<>();
        for (String s : str.split("")) {
            if (uniqueValues.add(s)) {
                removeDuplicated.add(s);
            }
        }
        ArrayList<Integer> Occurrences = new ArrayList<>();
        int counterCharacters = 1;

        for (String aList : characterList){
            int count = 0;
            for (String s1 : characterList) {
                if (s1.equals(aList)) {
                    count++;
                }
            }
            counterCharacters = count;
            Occurrences.add(counterCharacters);
        }
        System.out.println(characterList);
        System.out.println(Occurrences);
    }
}
