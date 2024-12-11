package strings;

public class StringTrimDemo {

    public static void main(String[] args) {

        String str1 = " Jeeva ".trim();
        System.out.println(str1);
        String str2 = "\n\t Jeeva".trim();
        System.out.println(str2);
        String str3 = "Jee v a".trim();
        System.out.println(str3);

        boolean isSame = "Jeeva".equals("Jeeva  ".trim());

    }

}
