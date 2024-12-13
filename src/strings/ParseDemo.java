package strings;

public class ParseDemo {
    public static void main(String[] args) {

        String str = "123";
        int parseNumber = Integer.parseInt(str);
        System.out.println(parseNumber);

        String str1= "12.45";
        float parseFloat = Float.parseFloat(str1);
        System.out.println(parseFloat);

        String st2 = "33435677";
        long parseLong = Long.parseLong(st2);
        System.out.println(parseLong);

        String str3 = "true";
        boolean parseBoolean = Boolean.parseBoolean(str3);
        System.out.println(parseBoolean);

        String str4 = "Hello";
        char parseChar = str4.charAt(0);
        System.out.println(parseChar);

        String str5 ="Jeeva";
        char[] arr = str5.toCharArray();
        char firstChar = arr[0];
        System.out.println(firstChar);
    }

}
