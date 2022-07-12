package assigments.ThirdAssigment;

public class palindrome {
    public static void main(String[] args) {
        String str = "Radar";
        String reverseStorage = "";
        char characters;
        for (int i = 0; i <str.length() ; i++) {
            characters = str.charAt(i);
            reverseStorage = characters + reverseStorage;
        }

        if (str.equalsIgnoreCase(reverseStorage)) {
            System.out.println(str + " is a Palindrome String");
        } else {
            System.out.println(str +  " is not a Palindrome String");
        }
    }
}
