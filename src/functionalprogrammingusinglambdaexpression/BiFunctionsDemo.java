package functionalprogrammingusinglambdaexpression;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;

public class BiFunctionsDemo {
    public static void main(String[] args) {

        // 1.BiPredicate-Accepts 2 i/p parameters and returns a boolean value...

        BiPredicate<Integer, Integer> isSumEven = (num1, num2) -> (num1 + num2) % 2 == 0;
        System.out.println(isSumEven.test(5, 9));    //true - 5+9=14->Even...

        // 2.BiFunction-Accepts 2 i/p parameters and returns o/p of specified type...

        BiFunction<Double, Double, Double> calculatePower = (num1, num2) -> Math.pow(num1, num2);
        System.out.println(calculatePower.apply(2.0, 3.0));  //8.0 - 2.0^2.0 = 8.0...

        // 3.BiConsumer - Accepts two i/p parameters but does not return anything...

        BiConsumer<String,String> appendAndConvert = (word1,word2) -> System.out.println((word1+word2).toUpperCase());
        appendAndConvert.accept("Jeeva","Hero");        // JEEVAHERO

        // 4.BinaryOperator - Child of BiFunction interface.Accepts 2 i/p parameters and o/p going to be returned is also of same type as i/p type given...

        BinaryOperator<Double> calculatePowerWithBO = (num1,num2) -> Math.pow(num1,num2);
        System.out.println(calculatePowerWithBO.apply(5.0,2.0));        //25.0 -> 5.0^2.0 = 25.0...

        //Using static methods available in BinaryOperator interface.1.maxBy(),2.minBy().

        BinaryOperator<Integer> maxOperation = BinaryOperator.maxBy((num1,num2) -> Integer.compare(num1,num2));
        System.out.println(maxOperation.apply(40,70));      //70

        BinaryOperator<Integer> minOperation = BinaryOperator.minBy((num1,num2) -> Integer.compare(num1,num2));
        System.out.println(minOperation.apply(40,70));      //40
    }

}
