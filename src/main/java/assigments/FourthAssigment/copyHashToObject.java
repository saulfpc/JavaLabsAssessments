package assigments.FourthAssigment;

import java.util.Arrays;
import java.util.HashSet;

public class copyHashToObject {
    public static void main(String[] args) {
        HashSet<String> Words = new HashSet<String>();
        Words.add("First");
        Words.add("Second");
        Words.add("Third");
        Words.add("Fourth");

        System.out.println(Words);
        Object[] array = Words.toArray();
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }
    }
}
