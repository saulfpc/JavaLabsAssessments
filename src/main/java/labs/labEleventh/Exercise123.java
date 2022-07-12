package labs.labEleventh;

import java.util.ArrayList;

public class Exercise123 {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Words");
        words.add("Letters");
        words.add("This");

        words.add(3,"Hello There");

        System.out.println(words.get(3));

        words.set(3, "No longer hello there");
        System.out.println(words.get(3));

        for (int i = 0; i <words.size() ; i++) {

            if (words.get(i).equalsIgnoreCase("No longer hello there")) System.out.println("Found the search word");
        }

    }

}
