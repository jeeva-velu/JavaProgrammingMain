package strings;

public class JoiningStringsDemo {

    public static void main(String[] args) {
        String st1 = "Hello";
        String st2 = "World";
        String st3 = "Jeeva";
        String result = String.join(",",st1,st2,st3);
        System.out.println("The joined string is:" +result);

    }
}
