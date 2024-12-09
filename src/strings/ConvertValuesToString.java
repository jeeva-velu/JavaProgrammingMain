package strings;

public class ConvertValuesToString {

    public static void main(String[] args) {
        int num = 30;
        double value = 3.14;
        boolean bool = true;

        String st1 = String.valueOf(num);
        String st2 = String.valueOf(value);
        String st3 = String.valueOf(bool);

        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);

        int age = 20;
        String message = "My age is : "+age;
        System.out.println(message);

    }

}
