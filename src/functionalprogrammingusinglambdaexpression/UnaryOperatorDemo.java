package functionalprogrammingusinglambdaexpression;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {
    public static void main(String[] args) {

        //UnaryOperator is a child of Function interface-It can be used in the case where you want the same input datatype as output to make code more effective.
        //It has all methods in Function interface like apply(),compose(),andThen().

        UnaryOperator<String> convertString = (input) -> input.toUpperCase(); //Input and Output are of same data type.
        String convertedString = convertString.apply("Jeeva");    //Assigning the output using the apply() method to a new String object.
        System.out.println(convertedString);


        //Using the identity() static method in UnaryOperator interface... Use this method where you want to return same input value as output..

        UnaryOperator<String> sameInputAsOutput = UnaryOperator.identity();
        System.out.println("Returns same i/p as o/p : "+sameInputAsOutput.apply("Harsha"));

        //Using two default methods compose() and andThen().

        UnaryOperator<Integer> doubleValue = num -> num * 2;
        UnaryOperator<Integer> addThree = num -> num + 3;

        //Chaining the LambdaExpressions using the default methods...
        //These default methods like andThen(),compose() are inherited from Function interface.So it has Function return type only.

        Function<Integer,Integer> output1 = doubleValue.andThen(addThree);  //First left LambdaExp will be executed and then right LambdaExp will be executed.
        System.out.println(output1.apply(5));   //13
        Function<Integer,Integer> output2 = doubleValue.compose(addThree);  //First right LambdaExp will be executed and then left LambdaExp will be executed.
        System.out.println(output2.apply(5));   //16

    }
}
