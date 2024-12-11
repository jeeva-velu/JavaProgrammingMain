package strings;

public class StringReplaceDemo {

    public static void main(String[] args) {

        String original = "Jeeva";
        String replacedString1 = original.replace('e','m');
        System.out.println(replacedString1);
        String original1 = "Hello World";
        String replacedString2 = original1.replace("World","Jeeva");
        System.out.println(replacedString2);
        String original3 = "abababab";
        String replacedString3 = original3.replace("ab","x");
        System.out.println(replacedString3);
        String replacedString4 = original1.replaceAll("a|e|i|o|u","*");
        System.out.println(replacedString4);
        String replacedStringFirst = original.replaceFirst("e","E");
        System.out.println(replacedStringFirst);
    }
}
