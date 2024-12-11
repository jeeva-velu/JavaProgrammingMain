package strings;

public class StringSplitDemo {

    public static void main(String[] args) {

        String fruits = "apple,orange,banana,grape,mango";
        String[] fruitArray = fruits.split(",");
        System.out.println(fruitArray);
    }
}
