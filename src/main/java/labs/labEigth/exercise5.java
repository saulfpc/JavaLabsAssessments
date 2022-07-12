package labs.labEigth;

public class exercise5 {

    public static void main(String[] args) {
        Integer number = 102345678;
        String str = String.valueOf(number);
        String reverseStorage = "";
        char character;
        for (int i = 0; i <str.length() ; i++) {
            character = str.charAt(i);
            reverseStorage = character + reverseStorage;
        }
        System.out.println(str);
        System.out.println(Integer.valueOf(reverseStorage));
    }
}
