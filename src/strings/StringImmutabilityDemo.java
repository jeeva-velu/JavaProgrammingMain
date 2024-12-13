package strings;

public class StringImmutabilityDemo {
    public static void main(String[] args) {
        String s1 = "Jeeva";
        s1 = "Harsha";
        System.out.println(s1);

        final String s2 = "Amma";
        // s2 = "Jeeva";        We cannot alter the final string object
    }
}
