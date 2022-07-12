package labs.labFourth;

public class exercise2 {

    static final char c = 'a';

    public static void main(String[] args) {

        char variable = Character.toLowerCase(c);
        switch (variable) {

            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(variable + " is a vowel");
                break;
            default: System.out.println(variable + " is a consonant");
        }
    }
}
