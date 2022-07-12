package labs.labSeventh;

public class exercise2 {

    public static void main(String[] args) {
        String characters = "AbCdefGHijklMNOpqRstUVwxyZ@%*234";
        char c;
        for (int i = 0; i < characters.length(); i++) {
            c=characters.charAt(i);
            if(Character.isUpperCase(c))System.out.println(c + " is upper case");
            if(Character.isLowerCase(c))System.out.println(c + " is lower case");
        }

    }
}
