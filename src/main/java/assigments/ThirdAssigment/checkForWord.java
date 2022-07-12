package assigments.ThirdAssigment;

public class checkForWord {
    public static void main(String[] args) {
        String str = "A brown fox ran away fast";
        String word = "brown";

        if (str.toLowerCase().contains(word.toLowerCase())){
            System.out.println("The sentence contain the word " + word + " at the position") ;
            System.out.println(str.toLowerCase().indexOf(word.toLowerCase()));
        }

    }
}
