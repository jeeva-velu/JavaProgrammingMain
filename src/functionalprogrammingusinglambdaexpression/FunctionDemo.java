package functionalprogrammingusinglambdaexpression;

import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {
        Function<String,String> convertString = (input) -> input.toUpperCase(); //Input and Output are of same data type.
        String converted = convertString.apply("Jeeva");    //Assigning the output using the apply() method to a new String object.
        System.out.println(converted);

        //Getting the length of the string...

        Function<String,Integer> lengthString= (input) -> input.length();
        int lenghtOfString = lengthString.apply("Jeeva");
        System.out.println(lenghtOfString);
    }

}
