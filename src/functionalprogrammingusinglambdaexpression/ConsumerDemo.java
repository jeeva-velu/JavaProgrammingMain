package functionalprogrammingusinglambdaexpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {

        //This interface accepts/consumes any datatype as input but does not return anything to the caller/invoking method.
        Consumer<String> convertAndDisplay = input -> System.out.println(input.toUpperCase());
        convertAndDisplay.accept("harsha");     //accept()-SAM to accept the input.

        Consumer<Integer> squareOf = num -> System.out.println(num * num);
        List<Integer> numbersList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        numbersList.forEach(squareOf);

        //Using andThen() default method to chain multiple lambda expressions...

        Consumer<String> appendInput = input -> System.out.println("New value after appending is : HELLO "+input);
        appendInput.andThen(convertAndDisplay).accept("Jeeva");
    }
}
