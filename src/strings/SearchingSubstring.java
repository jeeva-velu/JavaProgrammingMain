package strings;

public class SearchingSubstring {

    public static void main(String[] args) {

        String original = "Jeeva";
        int index = original.indexOf('e');
        System.out.println(index);
        String original1 = "Hello World";
        int index1 = original1.indexOf("World");
        System.out.println(index1);

        String original2 = "Java Jeeva";
        boolean isContains = original2.contains("e");
        System.out.println(isContains);

        boolean checkStart = original.startsWith("J");
        System.out.println(checkStart);
        boolean checkEnd = original.endsWith("A");
        System.out.println(checkEnd);

        boolean isMatched = original.matches(".*va.*");
        System.out.println(isMatched);



    }

}
